package ar.edu.unahur.obj2.parcial.AdditionalAccessories;

import ar.edu.unahur.obj2.parcial.ICar;

public class PowerWindows extends CarDecorator{
    private Integer pricePerDoors;
    public PowerWindows(ICar car, Integer pricePerDoors) {
        super(car);
        this.pricePerDoors = pricePerDoors;
    }
 
    @Override
    public Integer getFinalPrice() {
        return this.getFinalPrice() + this.pricePerDoors * car.getNumberOfDoors();
    }
}

