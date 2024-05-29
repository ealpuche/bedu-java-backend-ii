public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int anio;

    public Carro(String marca, String modelo, String color, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    // instanciar el objeto carro Carro c = new Carro("Toyota", "Corolla", "Rojo", 2020);

    public void encender() {
        System.out.println("El carro " + marca + " " + modelo + " ha sido encendido");
    }


    
}
