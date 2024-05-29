public class Adaptador implements Target{

    private Adaptador1 adaptador1;
    private Adaptador2 adaptador2;

    public Adaptador(Adaptador1 adaptador) {
        this.adaptador1 = adaptador;
    }

    public Adaptador(Adaptador2 adaptador) {
        this.adaptador2 = adaptador;
    }


    @Override
    public void solicitud() {
        adaptador1.solicitud();
    }

    @Override
    public void carga() {
        adaptador2.carga();
    }


    
}
