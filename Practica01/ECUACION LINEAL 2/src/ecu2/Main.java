package ecu2;

class Main {

	public static void main(String[] args) {
		EcuacionLineal ec = new EcuacionLineal();

		double d = ec.getDiscriminante();

		if (d > 0) {
		    System.out.println("La ecuacion tiene dos raices: "
		            + ec.getRaiz1() + " y "
		            + ec.getRaiz2());
		} else if (d == 0) {
		    System.out.println("La ecuacion tiene una raiz: "
		            + ec.getRaizUnica());
		} else {
		    System.out.println("La ecuacion no tiene raices reales");
		}

	}
}
