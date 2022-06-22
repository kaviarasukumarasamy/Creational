
public class PizzaTestDrive {

	public static void main(String[] args) {
		Pizzafactory factory = new Pizzafactory();
		Pizzastore store = new Pizzastore(factory);
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
