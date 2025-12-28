public class Car {

    // Encapsulation
    private  String make;
    private  String model;
    private  int year;

    // attributes
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters (Access the attributes securely.)
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    // setters (Modify the attributes securely.)
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

}
