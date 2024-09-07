public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new VeryThinCrust();
    }
    public Sauce createSauce(){
        return new BruschettaSauce();
    }
    public Cheese createCheese(){
        return new GoatCheese();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Parmesan(), new Oregano(), new Eggplant(), new Spinach(), new BlackOlives()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clams createClam(){
        return new Camari();
    }
}