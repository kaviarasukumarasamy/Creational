
public class CarFactory implements AbstractFactory {
	@Override
	public Car getCar(String carName) {

		if (carName == null) {
			return null;
		}
		if (carName.equalsIgnoreCase("Honda")) {
			return new Honda();

		} else if (carName.equalsIgnoreCase("Mercedes")) {
			return new Mercedes();

		} else if (carName.equalsIgnoreCase("Volkswagen")) {
			return new Volkswagen();
		}

		return null;
	}
	
	@Override
    public Animal getAnimal (String animalType) {
        return null;	
    }
}
