
public class Pizzafactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new Cheesepizza();
		} else if (type.equals("pepperoni")) {
			pizza = new Pepperonipizza();
		} else if (type.equals("clam")) {
			pizza = new Clampizza();
		} else if (type.equals("veggie")) {
			pizza = new Veggiepizza();
		}
		return pizza;
	}
}
