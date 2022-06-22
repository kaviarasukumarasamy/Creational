public abstract class Pizza {
	String pizza_name;
	String flour;
	String sauce;

	public String getName() {
		return pizza_name;
	}

	public void prepare() {
		System.out.println("Preparing " + pizza_name);
	}

	public void bake() {
		System.out.println("Baking " + pizza_name);
	}

	public void cut() {
		System.out.println("Cutting " + pizza_name);
	}

	public void box() {
		System.out.println("Boxing " + pizza_name);
	}

}
