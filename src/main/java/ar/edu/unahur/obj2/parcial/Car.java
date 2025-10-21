package ar.edu.unahur.obj2.parcial;
//La concesionaria obviamente cambiar el precio base de un auto.
public class Car implements ICar{
    private Integer basePrice;
    private final Integer numberOfDoors;
    private Integer maximumSpeed;
    private final Integer surface;

    public Car(Integer basePrice, Integer numberOfDoors, Integer maximumSpeed, Integer surface) {
        this.basePrice = basePrice;
        this.numberOfDoors = numberOfDoors;
        this.maximumSpeed = maximumSpeed;
        this.surface = surface;
    }

    public Boolean isSporty() {
        return this.numberOfDoors >= 2 && this.maximumSpeed >= 160;
    }

    public Integer getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public Integer getBasePrice() {
        return this.basePrice;
    }

    public Integer getFinalPrice() {
        return this.basePrice;
    }

    public Boolean isFast() {
        return this.maximumSpeed >= 140; 
    }

    public void setMaximumSpeed(Integer newMaximumSpeed) {
        this.maximumSpeed = newMaximumSpeed;
    }

    public void setBasePrice(Integer newBasePrice) {
        this.basePrice = newBasePrice;
    }

    public Integer getSurface() {
        return this.surface;
    }
}
