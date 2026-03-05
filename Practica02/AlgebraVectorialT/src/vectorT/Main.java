package vectorT;

class Main {

	public static void main(String[] args) {
		AlgebraVectorialT a = new AlgebraVectorialT(1,2,3);
		AlgebraVectorialT b = new AlgebraVectorialT(1,1,1);
		System.out.println("a = "+ a +"  b = "+b);
		System.out.println("a) a + b = "+a.suma(b));
		System.out.println("b) r=2 , r*a = "+a.escalar(2));
		System.out.println(String.format("c) longitud de a = %.2f", a.longitud()));
		
	
		if(a.longitud() == 0){
		    System.out.println("No se puede normalizar el vector cero.");
		}else{
			System.out.println("d) a/|a| = " + a.normalizar());
		}
		
		System.out.println(String.format("e) a·b = %.2f", a.productoE(b)));
		System.out.println("f) axb = "+ a.productoV(b));
		
		
		

	}

}
