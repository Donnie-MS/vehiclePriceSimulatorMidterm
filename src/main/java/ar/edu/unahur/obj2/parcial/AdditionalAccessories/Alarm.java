package ar.edu.unahur.obj2.parcial.AdditionalAccessories;


import ar.edu.unahur.obj2.parcial.ICar;

public class Alarm extends CarDecorator{
    private Integer fixedPrice;
    public Alarm(ICar car, Integer fixedPrice) {
        super(car);
        this.fixedPrice = fixedPrice;
    }

    @Override
    public Integer getFinalPrice() {
        Integer alarmPrice = this.car.isSporty() ? this.fixedPrice : this.fixedPrice + 30000;
        return this.car.getFinalPrice() + alarmPrice;
    }
    
}
