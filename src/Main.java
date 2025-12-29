//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Car car = new Car("BMW", "X6", 2024, 125000 );

        car.applyIncrease(0.10);

        // Accessing attributes via getters
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println("Valor do Carro : " + car.getValue());
    }
}