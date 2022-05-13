package core.car;

public class Car {

    private String type;
    private String brand;
    private String color;

    private boolean isEngineRunning;

    /**
     *
     * @param type The car type (SUV, Sedan, Off Road..)
     * @param brand The car brand (Audi, Jeep, BMW...)
     * @param color The car color (Red, Blue, White, Black..)
     *
     */
    public Car(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public void turnEngineKey(){
        System.out.println("Turning the engine key.");
        this.isEngineRunning = !isEngineRunning;
        String engineState = isEngineRunning ? "on" : "off";
        System.out.println(String.format("The engine is %s!", engineState));
    }

    /**
     * Drives the car around the block
     */
    public void drive(){
        String message = isEngineRunning ? "Driving..." : "You need to turn on the car first";
        System.out.println(message);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
