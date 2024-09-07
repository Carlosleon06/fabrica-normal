public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Parmesan(), new Oregano(), new Eggplant(), new Spinach(), new BlackOlives()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clams createClam(){
        return new FrozenClams();
    }
}