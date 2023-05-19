
public class Calculadora {

	private int x;
	private int y;
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int Suma () {
		return x + y;
	}
	
	public int Resta () {
		return x - y;
	}
<<<<<<< HEAD
	
	public int Multiplica () {
		return x * y;
	}
	
	public int Divide () {
		return x / y;
	}
	
	 public static void raiz(String[] args) {
        double numero = 16.0;
        double resultado = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);
    }

	@Override
	public String toString() {
		return "Calculadora [x=" + x + ", y=" + y + ", Suma =" + Suma() + ", Resta =" + Resta() + "]";
	}
	
	
	
}
