package ecu2;
import java.util.Scanner;
import java.util.Locale;
import java.math.*;

class EcuacionLineal {
	
	//a) Los atributos privados a, b y c, que representan a los 3 coeficientes
	
	private double a;
	private double b;
	private double c;
	
	//b) Un constructor para los argumentos para a, b y c.
	public EcuacionLineal() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); 
		System.out.print("Ingrese a, b, c: ");
		this.a = sc.nextDouble();
		this.b = sc.nextDouble();
		this.c = sc.nextDouble();
	}
	
	//c) Un metodo getDiscriminante() que develve el discriminante
	
	public double getDiscriminante() {
		double Discriminante = Math.pow(b, 2) - 4*a*c;
		return Discriminante;
	}
	
	//d) Dos metodos getRaiz1() y getRaiz2() que retornan las dos raıces de la ecuacion
	
	public double getRaiz1(){
		double d = getDiscriminante(); 
		double r1 = (- b + (Math.sqrt(d)) )/ (2*a) ;
		return r1;	
	}
	
	public double getRaiz2(){
		double d = getDiscriminante(); 
		double r2 = (- b - (Math.sqrt(d)) ) / (2*a);
		return r2;
	}
	
	public double getRaizUnica() {
	    return -b / (2*a);
	}

}
