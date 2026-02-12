package ecu;

class Main {

	public static void main(String[] args) {
		/*  Escriba un programa de prueba
		 	(Test) que solicite al usuario ingresar a, b, c, d, e y f 
		 	y muestre el resultado. Si ad − bc es
		 	0, indique que ”La ecuacion no tiene solucion”.
		*/ 
		
		EcuacionLineal ec1 = new EcuacionLineal();
		

		if(ec1.tieneSolucion()) {
			System.out.println("X = "+ec1.getX()+", y = "+ec1.getY());
		}else {
			System.out.println("La ecuacion no tiene solucion");
		}
		

	}

}
