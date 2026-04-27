package rambrew;

public class BeverageBuilder {
    private Beverage beverage;
    private String size;
    private String milk;
    private int shots;
    private String sweetener;

    public BeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public BeverageBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public BeverageBuilder setShots(int shots) {
        this.shots = shots;
        return this;
    }

    public BeverageBuilder setSweetener(String sweetener) {
        this.sweetener = sweetener;
        return this;
    }

    public CustomBeverage build() {
        return new CustomBeverage(beverage, size, milk, shots, sweetener);
    }
}