package ar.edu.unahur.obj2.parcial;

public class Car {
    private Integer basePrice;
    private final Integer numberOfDoors;
    private Integer maximumSpeed;
    private final Integer surface;

    public Boolean isSporty() {
        return this.numberOfDoors >= 2 && this.maximumSpeed >= 160;
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
}
