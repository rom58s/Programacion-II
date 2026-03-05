package vectorT;

public class AlgebraVectorialT {
	
	private double x;
	private double y;
	private double z;
	
	public AlgebraVectorialT(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return String.format("(%.1f ;"+" %.1f ;"+" %.1f)", x , y , z);
	}
	
	//sobrecarga de operadores
	
	//a) Suma de vectores
	
	public AlgebraVectorialT suma(AlgebraVectorialT otro) {
		double t = x + otro.x;
		double s = y + otro.y;
		double w = z + otro.z;
		
		return new AlgebraVectorialT(t,s,w);
	}
	
	//b) b) Multiplicacion de un escalar r por un vector a
	
	public AlgebraVectorialT escalar(double r) {
		double t = r * x;
		double s = r * y;
		double w = r * z;
		
		return new AlgebraVectorialT(t,s,w);
	}
	
	//c) longitud de un vector a
	
	public double longitud() {
		return Math.sqrt((Math.pow(x,2))+(Math.pow(y,2))+(Math.pow(z,2)));
	}
	
	//d)Normalizar un vector a
	
	public AlgebraVectorialT normalizar() {
		double Long = longitud();
		if(Long != 0) {
			double t = x/Long;
			double s = y/Long;
			double w = z/Long;
			return new AlgebraVectorialT(t,s,w);
		}
		return new AlgebraVectorialT(0,0,0);
	}
	
	//e) Producto escalar de a y b
	
	public double productoE (AlgebraVectorialT otro) {
		return (x*otro.x)+(y*otro.y)+(z*otro.z);
	}
	
	//f)Producto vectorial de a y b
	public AlgebraVectorialT productoV (AlgebraVectorialT otro) {
		double t = (y*otro.z)-(z*otro.y);
		double s = (z*otro.x)-(x*otro.z);
		double w = (x*otro.y)-(y*otro.x);
		
		return new AlgebraVectorialT(t,s,w);
	}


}
