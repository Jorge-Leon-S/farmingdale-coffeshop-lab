package rambrew;

public class OrderDriver {
    public static void main(String[] args) {

        Beverage coffee = new BeverageBuilder(new Coffee())
                .setSize("Large")
                .setMilk("Oat")
                .setSweetener("Sugar")
                .build();

        Beverage latte = new BeverageBuilder(new Latte())
                .setSize("Medium")
                .setMilk("Almond")
                .setShots(2)
                .setSweetener("Honey")
                .build();

        Order order = new Order();
        order.addDrink(coffee);
        order.addDrink(latte);

        order.printOrder();
    }
}