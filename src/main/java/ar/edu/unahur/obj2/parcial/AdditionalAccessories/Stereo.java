package ar.edu.unahur.obj2.parcial.AdditionalAccessories;

import ar.edu.unahur.obj2.parcial.ICar;

public class Stereo extends CarDecorator{
    private Integer installationPrice;
    private Integer pricePerSpeaker;
    public Stereo(ICar car, Integer installationPrice, Integer pricePerSpeaker) {
        super(car);
        this.installationPrice = installationPrice;
        this.pricePerSpeaker = pricePerSpeaker;
    }
    @Override
    public Integer getFinalPrice() {
        return this.car.getFinalPrice() + installationPrice + this.priceTotalSpeaker();
    }

    private Integer priceTotalSpeaker() {
        return pricePerSpeaker * this.car.getNumberOfDoors();
    }
}
