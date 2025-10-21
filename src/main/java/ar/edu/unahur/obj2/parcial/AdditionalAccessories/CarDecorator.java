package ar.edu.unahur.obj2.parcial.AdditionalAccessories;

import ar.edu.unahur.obj2.parcial.ICar;

public abstract class CarDecorator implements ICar{
    protected ICar car;
    public CarDecorator(ICar car) {
        this.car = car;
    }

    public Integer getBasePrice() {
        return this.car.getBasePrice();
    }    

    public Integer getFinalPrice() {
        return this.car.getFinalPrice();
    }

    public Integer getNumberOfDoors() {
        return this.car.getNumberOfDoors();
    }

    public Boolean isFast() {
        return this.car.isFast();
    }

    public Integer getSurface() {
        return this.car.getSurface();
    }

    public Boolean isSporty() {
        return this.car.isSporty();
    }
}
