
class MiPunto {
	
	//a) Los atributos x e y que representan las coordenadas con metodos getter.
	private double x;
	private double y;
	
	//b) Un constructor sin argumentos que crea un punto (0, 0).
	
	public MiPunto(){
		
	}
	
	//c) Un constructor que construye un punto con las coordenadas especificadas.
	
	public MiPunto(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	/*d) Un metodo llamado distancia que retorna la 
	     distancia desde este punto hasta un
	     punto especificado del tipo MiPunto.
    */
	
	public double distancia(MiPunto otro) {
		
		double dist = Math.sqrt( (Math.pow((otro.x - this.x),2)) + (Math.pow(( otro.y - this.y ),2)) ) ;
		return dist;
	}
	
	/*
	e) Un metodo llamado distancia que retorna la 
	distancia desde este punto hasta otro
	punto con las coordenadas x e y especificadas.
    */
	
	public double distancia(double x2 , double y2) {
		
		double dist = Math.sqrt( (Math.pow((x2 - this.x),2)) + (Math.pow(( y2 - this.y ),2)) ) ;
		return dist;
	}
	

	//getters x e y
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}


 //Main
	
	public static void main(String[] args) {
		/*Escriba un programa de prueba que
		cree los puntos (0, 0) y (10, 30.5) y 
		muestre la distancia entre ellos.
		*/
		
		MiPunto m1 = new MiPunto();
		MiPunto m2 = new MiPunto(10,30.5);
		
		System.out.println(m1.distancia(m2));

	}

}
