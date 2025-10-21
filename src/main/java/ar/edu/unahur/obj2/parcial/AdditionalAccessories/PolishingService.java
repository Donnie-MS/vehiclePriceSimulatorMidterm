package ar.edu.unahur.obj2.parcial.AdditionalAccessories;

import ar.edu.unahur.obj2.parcial.ICar;

public class PolishingService extends CarDecorator{
    private Integer fixedPrice;
    public PolishingService(ICar car, Integer fixedPrice) {
        super(car);
        this.fixedPrice = fixedPrice;
    }

    @Override
    public Integer getFinalPrice() {
        Integer polishingPrice = this.car.isFast() ? this.fixedPrice: this.fixedPrice + 5000;
        return this.car.getFinalPrice() +  Math.min(100000 ,polishingPrice * this.car.getSurface());
    } 

}
