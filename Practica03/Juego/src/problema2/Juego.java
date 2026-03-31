package problema2;

import java.util.Scanner;

class Juego {
	Scanner sc = new Scanner(System.in);
	protected int numeroDeVidas;
	protected int record;
	private int vidasIniciales; 
	
    public Juego(int numeroDeVidas) {
        this.vidasIniciales = numeroDeVidas; 
        reiniciaPartida(); 
    }
	
    public void reiniciaPartida() {
        reiniciaPartida(vidasIniciales); 
    }
    
    public void reiniciaPartida(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }
	
	public void actualizaRecord() {
		record = record + 10;
	}
	
	public boolean quitaVida() {
		numeroDeVidas --;
		if(numeroDeVidas>0) {
			return true;
		}else {
			return false;
		}
	}

}


//Se deriva de la clase Juego.
//Clase JuegoAdivinaNumero
class JuegoAdivinaNumero extends Juego{
	private int numeroAAdivinar;
	
	public JuegoAdivinaNumero(int numeroDeVidas){
		super(numeroDeVidas);
	}
	
	/*a) Añada un nuevo metodo validaNumero que tendra
	   como parametro un numero entero. Este metodo devolvera
	   true si el numero esta entre 0 y 10, en otro caso retornara
       false.*/
	
	public boolean validaNumero(int n) {
		return n >= 0 && n <= 10;
	}
	
	public void juega() {
		super.reiniciaPartida();
		int aleatorio = (int)(Math.random() * 11);
		System.out.println("Adivina un número del 0 al 10:");
		
        boolean jugando = true;
        while(jugando) {
            System.out.print("\nIngrese nro: ");
            
        	/*	b) Utilice el metodo validaNumero para validar el numero 
        	  	ingresado por el usuario en
        		el metodo juega.*/
           
            numeroAAdivinar = sc.nextInt();
            if(validaNumero(numeroAAdivinar)) {
            	
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
            	
            }else {
            	System.out.println("Numero no valido");
            }
            
        }
    }
	
}

//Clase JuegoAdivinaPar 
//a) Se deriva de la clase JuegoAdivinaNumero
class JuegoAdivinaPar extends JuegoAdivinaNumero{
	
	public JuegoAdivinaPar(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	
	/*b) Redefina el metodo validaNumero devolviendo 
	   true si el numero es par y si esta entre el 0 y 10.
	   Si el numero es impar, muestra un mensaje de error 
	   por pantalla y devuelve false.
	 */
		
	@Override
	public boolean validaNumero(int n) {
	    if(n >= 0 && n <= 10) {
	        if(n % 2 == 0) {
	            return true;
	        } else {
	            System.out.println("Error: el número debe ser PAR");
	            return false;
	        }
	    } else {
	        System.out.println("Error: el número debe estar entre 0 y 10");
	        return false;
	    }
	}
}

//Clase JuegoAdivinaImpar 
//a) Se deriva de la clase JuegoAdivinaNumero

class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	
	/*b) Redefina el metodo validaNumero devolviendo true si 
	    el numero es impar y si esta entre el 0 y 10. Si el 
	    numero es par, muestra un mensaje de error por pantalla y
	    devuelve false.*/
	
	@Override
	public boolean validaNumero(int n) {
	    if(n >= 0 && n <= 10) {
	        if(n % 2 != 0) {
	            return true;
	        } else {
	            System.out.println("Error: debe ser impar");
	            return false;
	        }
	    } else {
	        System.out.println("Fuera de rango");
	        return false;
	    }
	}
	
}

