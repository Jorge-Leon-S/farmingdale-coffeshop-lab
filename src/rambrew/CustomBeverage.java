package rambrew;

public class CustomBeverage implements Beverage {
    private Beverage base;
    private String size;
    private String milk;
    private int shots;
    private String sweetener;

    public CustomBeverage(Beverage base, String size, String milk, int shots, String sweetener) {
        this.base = base;
        this.size = size;
        this.milk = milk;
        this.shots = shots;
        this.sweetener = sweetener;
    }

    public String getDescription() {
        return base.getDescription() +
                " | Size: " + size +
                " | Milk: " + milk +
                " | Shots: " + shots +
                " | Sweetener: " + sweetener;
    }

    public double getCost() {
        double cost = base.getCost();

        if(size.equals("Medium")) cost += 0.5;
        if(size.equals("Large")) cost += 1.0;

        if(shots > 1) cost += (shots - 1) * 0.75;

        return cost;
    }
}