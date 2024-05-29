public class Main {
    
    public static void main(String[] args) {
        // Adaptador1 adaptador1 = new Adaptador1();
        // adaptador1.solicitud();
        Adaptador1 adaptador1 = new Adaptador1();
        Adaptador2 adaptador2 = new Adaptador2();
        Adaptador adaptador = new Adaptador(adaptador2);

        adaptador.carga();
        
    }
}
