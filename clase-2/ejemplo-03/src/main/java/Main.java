public class Main {
    public static void main(String[] args) {
        System.out.println("Observer pattern");
        CuentaTwitter cuentaTwitter = new CuentaTwitter("ealpuchem");
        CuentaTwitter cuentaTwitter2 = new CuentaTwitter("randomUser");
        Subject subject = new Subject();
        subject.addObserver(cuentaTwitter);
        subject.addObserver(cuentaTwitter2);
        subject.twitt();
    }
    
}
