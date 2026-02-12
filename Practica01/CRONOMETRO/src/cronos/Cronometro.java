package cronos;
import java.util.Date;
import java.text.SimpleDateFormat;

class Cronometro {
	//atributos privados
	//a) Los atributos privados inicia y finaliza con metodos getter
	private Date inicia;
	private Date finaliza;
	
	//b) Un constructor sin argumentos que inicialica inicia con la hora actual
	
	public Cronometro() {
		this.inicia = new Date();
	}	
	
    // Comportamiento (Método)
    public void imprimirHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora con Date: " + sdf.format(inicia));
    }
    
    //c) Un metodo llamado inicia() que restablece inicia a la hora actual.
    
    public void inicia() {
    	this.inicia = new Date();
    }
    
    //d) Un metodo llamado detener() que establece finaliza a la hora actual.
    
    public void detener() {
    	 this.finaliza = new Date();
    }
    
    //e) Un metodo llamado lapsoDeTiempo() que retorna el tiempo transcurrido del cronometro en milisegundos.

    public long lapsoDeTiempo() {
    	if (inicia == null || finaliza == null) {
            return 0;
        }
        return finaliza.getTime() - inicia.getTime();
    }
	
	//getters y setters 
	public Date getInicia() {
		return inicia;
	}
	public void setInicia(Date inicia) {
		this.inicia = inicia;
	}
	public Date getFinaliza() {
		return finaliza;
	}
	public void setFinaliza(Date finaliza) {
		this.finaliza = finaliza;
	}

}
