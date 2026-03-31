package juego1;

import java.util.Scanner;

class Juego {
	Scanner sc = new Scanner(System.in);

	//a) Anada los atributos numeroDeVidas y record ambos de tipo entero
	protected int numeroDeVidas;
	protected int record;
	
	private int vidasIniciales; // solo para guardar el valor del constructor
	
    // Constructor recibe vidas y las guarda
    public Juego(int numeroDeVidas) {
        this.vidasIniciales = numeroDeVidas; // guardamos para reinicios
        reiniciaPartida(); // llama al reinicio literal
    }
	
	//b) Anada el metodo reiniciaPartida.
    
    // Método reiniciaPartida literal (sin parámetros) → cumple inciso
    public void reiniciaPartida() {
        reiniciaPartida(vidasIniciales); // llama al método con parámetro
    }
    
    public void reiniciaPartida(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }
	
	//c) Anada el metodo actualizaRecord
	public void actualizaRecord() {
		record = record + 10;
	}
	
	//d) Anada el metodo quitaVida.
	public boolean quitaVida() {
		numeroDeVidas = numeroDeVidas - 10;
		if(numeroDeVidas>0) {
			return true;
		}else {
			return false;
		}
	}

}

//a) Se deriva de la clase Juego.
class JuegoAdivinaNumero extends Juego{
	
	//b) Anada el atributo numeroAAdivinar de tipo entero.
	
	private int numeroAAdivinar;
	
	/*c) Agregue un constructor que tiene el parametro 
	     numero de vidas, de tipo entero. Este
	     se lo pasara al constructor de la clase padre.
	 */
	
	public JuegoAdivinaNumero(int numeroDeVidas){
		super(numeroDeVidas);
	}
	
	/*d) Agregue el metodo juega, siguiendo las instrucciones 
	 * de  incisos 1),2),3) y 4)*/
	
	public void juega() {
		//1) Llama al metodo reiniciaPartida que ha heredado.
		super.reiniciaPartida();
		//2) Genere aleatoriamente el numero a adivinar (entre 0 y 10).
		int aleatorio = (int)(Math.random() * 11);
		
		/*3) Muestra un mensaje al usuario pidiendo que adivine 
		     un numero entre el 0 y el 10.
		 */
		System.out.println("Adivina un número del 0 al 10:");
		
		/*4) Lee un entero del teclado y lo compara con el numero 
		     generado aleatoriamente: */
		
		/*a1) Si es igual, muestra un mensaje Acertaste!! y, tras 
		      llamar a actualizaRecord, sale del metodo.
		      
		  b1) Si es diferente, llama al metodo quitaVida heredado.
		  
		  c1) Si el metodo quitaVida devuelve true, significa que 
		  aun le quedan mas vidas al jugador por lo que se muestra 
		  un mensaje indicando si el numero a adivinar es mayor o 
		  menor y se le pide que lo intente de nuevo.
		  
		  d1)Si el metodo quitaVida devuelve false significa que ya 
		  no le quedan mas vidas al jugador, con lo que sale del 
		  metodo juega.


		*/
		
        boolean jugando = true;
        while(jugando) {
            System.out.print("\nIngrese nro: ");
            numeroAAdivinar = sc.nextInt();
            if(numeroAAdivinar == aleatorio) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                jugando = false;
            } else {
                boolean fallo = quitaVida();
                if(fallo) {
                    System.out.println("Fallaste, pero aún le quedan vidas.");
                    if(numeroAAdivinar > aleatorio) {
                        System.out.println("El número a adivinar es menor.");
                    } else {
                        System.out.println("El número a adivinar es mayor.");
                    }
                } else {
                    System.out.println("Ya no le quedan vidas. Fin del juego.");
                    jugando = false;
                }
            }
        }
    }
	
}

