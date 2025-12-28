public class Car {

    // Encapsulation
    private final String make;
    private final String model;
    private final int year;

    // attributes
    Car(String marca, String modelo, int ano){
        this.make = marca;
        this.model = modelo;
        this.year = ano;
    }

    // getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
