
public class AnimalsFactory implements AbstractFactory {
	@Override
	public Animal getAnimal(String animalType) {

		if (animalType == null) {
			return null;
		}
		if (animalType.equalsIgnoreCase("RABBIT")) {
			return new Rabbit();

		} else if (animalType.equalsIgnoreCase("COW")) {
			return new Cow();

		} else if (animalType.equalsIgnoreCase("HORSE")) {
			return new Horse();
		}

		return null;
	}

	@Override
	public Car getCar(String carName) {
		return null;
	}
}
