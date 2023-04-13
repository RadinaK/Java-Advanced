package PP02Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String brand){
        this(brand, "unknown", -1);
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getHorsePower(){
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.\n",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
