package ecu;
import java.util.Scanner;
import java.util.Locale;

class EcuacionLineal {
	//a) Los atributos privados a, b, c, d , e y f.
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//b) Un constructor para los argumentos  a, b, c, d , e y f.
	
	public EcuacionLineal() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); 
		System.out.print("Ingrese a, b, c, d, e, f: ");
		this.a = sc.nextDouble();
		this.b = sc.nextDouble();
		this.c = sc.nextDouble();
		this.d = sc.nextDouble();
		this.e = sc.nextDouble();
		this.f = sc.nextDouble();
	}	
	
	//c) Un metodo tieneSolucion() que devuelve true si ad − bc no es cero
	
	public boolean tieneSolucion() {
		
		double analizar = (a*d) - (b*c);
		
		if(analizar != 0) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	//d) Dos metodos getX() y getY() que retornan la solucion de la ecuacion.
	
	public double getX() {
		double x = ((e*d) - (b*f))/((a*d) - (b*c));
		return x;
	}
	
	
	public double getY() {
		double y = ((a*f) - (e*c))/((a*d) - (b*c));
		return y;
	}
}
