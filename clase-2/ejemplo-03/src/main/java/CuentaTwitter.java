public class CuentaTwitter implements Observer{

    private String alias;

    public CuentaTwitter(String alias) {
        this.alias = alias;
    }

    @Override
    public void update() {
        System.out.println("Notificacion push celular a las cuenta " + alias);
    }
    
}
