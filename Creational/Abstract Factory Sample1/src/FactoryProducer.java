//Create a Factory producer class to get factories by passing an information such as Animal or Car

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("ANIMAL")) {
			return new AnimalsFactory();

		} else if (choice.equalsIgnoreCase("CAR")) {
			return new CarFactory();
		}

		return null;
	}
}
