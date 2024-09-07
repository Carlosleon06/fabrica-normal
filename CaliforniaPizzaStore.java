public class CaliforniaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null:
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
           
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");

        } else if (item.equals("camari")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style camari Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new pepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        } else
            return null;
    }
}