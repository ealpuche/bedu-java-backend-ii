public class Main{
    public static void main(String[] args){
        Carro c1 = new Carro("Toyota", "Corolla", "Rojo", 2020);
        Carro c2 = new Carro("Toyota", "Corolla", "Rojo", 2020);
        c1.encender();
        System.out.println(c1);
        c2.encender();
        System.out.println(c2);

        // CarroSingleton c1 = CarroSingleton.getInstance("Toyota", "Corolla", "Rojo", 2020);
        // c1.encender();
        // System.out.println(c1);
        // CarroSingleton c2 = CarroSingleton.getInstance("Nissan", "Sentra", "Azul", 2021);
        // c2.encender();
        // System.out.println(c2);
    }
}