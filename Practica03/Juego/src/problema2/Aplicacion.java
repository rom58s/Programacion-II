package problema2;

//Clase Aplicacion
class Aplicacion{
	public static void main(String[] args) {
		
	/*a) El metodo main crea una instancia de 
		 cada uno de los tres juegos creados: JuegoAdivinaNumero, 
		 JuegoAdivinaPar y JuegoAdivinaImpar. Como numero de vidas de
		 cada juego se pondra 3.*/
		
      JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3);
      JuegoAdivinaPar j2 = new JuegoAdivinaPar(3);
      JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3);
      
	//b) Llame al metodo juega de cada una de las tres instancias.
      
      
      j1.juega();
      System.out.println("\nNumeros pares");
      j2.juega();
      System.out.println("\nNumeros impares");
      j3.juega();
		
	}
}


