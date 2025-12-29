public class Car {

    // Encapsulation
    private String make;
    private String model;
    private int year;
    private double value;

    // attributes
    Car(String make, String model, int year, double value) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    // method to apply increase
    public void applyIncrease(double percentage) {
        this.value += this.value * percentage;
    }

    // getters (Access the attributes securely.)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    // setters (Modify the attributes securely.)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
