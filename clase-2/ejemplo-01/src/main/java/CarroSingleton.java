public class CarroSingleton{

    private static CarroSingleton instance = null;
    private String marca;
    private String modelo;
    private String color;
    private int anio;

    private CarroSingleton(String marca, String modelo, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    public static CarroSingleton getInstance(String marca, String modelo, String color, int anio){
        if(instance == null){
            instance = new CarroSingleton(marca, modelo, color, anio);
        }
        return instance;
    }

    public void encender(){
        System.out.println("El carro " + marca + " " + modelo + " ha sido encendido");
    }
    
}