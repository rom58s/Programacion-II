package algebraLienal;

class AlgebraVectorial {
	
	
	private double x;
	private double y;
	private double z;
	
	//Constructores sobrecargados 
	
	public AlgebraVectorial(){
		
	}
	
	public AlgebraVectorial(double x,double y){
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	
	public AlgebraVectorial(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// INCISOS DE PERPENDICULARIDAD
	
	// inciso a) |a + b| = |a - b|
	
	public boolean perpendicular(AlgebraVectorial otro, String a) {
	    double suma = Math.sqrt(Math.pow(x + otro.x, 2) + Math.pow(y + otro.y, 2) + Math.pow(z + otro.z, 2));
	    double resta = Math.sqrt(Math.pow(x - otro.x, 2) + Math.pow(y - otro.y, 2) + Math.pow(z - otro.z, 2));

	    return suma == resta;
	}


	// inciso b) |a - b| = |b - a|
	
	public boolean perpendicular(AlgebraVectorial otro, String a, String b) {
	    double restaAB = Math.sqrt(Math.pow(x - otro.x, 2) + Math.pow(y - otro.y, 2) + Math.pow(z - otro.z, 2));
	    double restaBA = Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2) + Math.pow(otro.z - z, 2));

	    return restaAB == restaBA;
	}


	//inciso c)  a · b = 0
	public boolean perpendicular(AlgebraVectorial otro, String a,String b,String c) {

		if(((x*otro.x)+(y*otro.y)+(z*otro.z)) == 0) {
			return true;
		}
		return false;
	}
	
	// inciso d) |a + b|^2 = |a|^2 + |b|^2
	
	public boolean perpendicular(AlgebraVectorial otro, String a, String b, String c, String d) {
	    double sumaCuadrada = Math.pow(x + otro.x, 2) + Math.pow(y + otro.y, 2) + Math.pow(z + otro.z, 2);
	    double pitagoras = (x*x + y*y + z*z) + (otro.x*otro.x + otro.y*otro.y + otro.z*otro.z);
	    return sumaCuadrada == pitagoras;
	}

	//INCISOS DE PARALELISMO

	// inciso e) a = rb
	public boolean paralelo(AlgebraVectorial otro, String e) {
	    // Si la división de sus componentes es igual, son paralelos
	    double rx = (double)x / otro.x;
	    double ry = (double)y / otro.y;
	    double rz = (double)z / otro.z;
	    return (rx == ry && ry == rz);
	}

	
	// inciso f) a × b = 0

	public boolean paralelo(AlgebraVectorial otro, String e, String f) {
	    double cx = (y * otro.z) - (z * otro.y);
	    double cy = (z * otro.x) - (x * otro.z);
	    double cz = (x * otro.y) - (y * otro.x);
	    // Si todos los componentes del producto cruz son 0
	    return (cx == 0 && cy == 0 && cz == 0);
	}

	// PROYECCIÓN Y COMPONENTE
	
	// inciso g) Proyeccion de a sobre b
	public AlgebraVectorial proyeccion(AlgebraVectorial otro) {
	    double productoPunto = (x * otro.x) + (y * otro.y) + (z * otro.z);
	    double magnitudBSquared = Math.pow(otro.x, 2) + Math.pow(otro.y, 2) + Math.pow(otro.z, 2);
	    
	    // Protección: No se puede dividir entre cero
	    if (magnitudBSquared == 0) {
	        System.out.println("Error: No se puede proyectar sobre un vector nulo.");
	        return new AlgebraVectorial(0, 0, 0); 
	    }
	    
	    double escalar = productoPunto / magnitudBSquared;
	    return new AlgebraVectorial(escalar * otro.x, escalar * otro.y, escalar * otro.z);
	}


	// inciso h) Componente de a en b
	
	public double componente(AlgebraVectorial otro) {
	    double productoPunto = (x * otro.x) + (y * otro.y) + (z * otro.z);
	    double magnitudB = Math.sqrt(Math.pow(otro.x, 2) + Math.pow(otro.y, 2) + Math.pow(otro.z, 2));
	    
	    if (magnitudB == 0) return 0; // Evitamos el error de división
	    
	    return productoPunto / magnitudB;
	}
	
	
    // --- MÉTODOS GET ---
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }


	// Main

	public static void main(String[] args) {
	    // Definimos dos vectores para la prueba (Ejemplo: A es la mitad de B)
		AlgebraVectorial v1 = new AlgebraVectorial(1,2,3);
		AlgebraVectorial v2 = new AlgebraVectorial(2,-1,0);
		
	    System.out.println("--- PRUEBAS DE VECTORES ---");
	    
	    //(1) determinar si dos vectores son perpendiculares , usamos el inciso c)
	    
		if(v1.perpendicular(v2,"a","b","c")) {
			System.out.println("Resultado (1): es perpendicular");
		}else {
			System.out.println("Resultado (1): no es perpendicular");
		}
		
	    // (2) Determinar si son paralelos (usando el inciso f)
	    if (v1.paralelo(v2, "e", "f")) {
	        System.out.println("Resultado (2): Los vectores son PARALELOS.");
	    } else {
	        System.out.println("Resultado (2): Los vectores NO son paralelos.");
	    }

	    // (3) Determinar la proyeccion (inciso g)
	  
	    AlgebraVectorial proy = v1.proyeccion(v2);
	    System.out.println("Resultado (3): La Proyeccion de A sobre B es: (" + proy.getX() + ", " + proy.getY() + ", " + proy.getZ() + ")");

	    // (4) Determinar el componente (inciso h)
	    double comp = v1.componente(v2);
	    System.out.println("Resultado (4): El Componente de A en la direccion de B es: " + comp);
		
	}

}
