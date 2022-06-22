
public class AbstractFactoryExample {
	public static void main(String[] args) {

		AbstractFactory carFactory = FactoryProducer.getFactory("Car");

		Car car1 = carFactory.getCar("Honda");
		car1.draw();

		AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");

		Animal animal1 = animalFactory.getAnimal("Rabbit");
		animal1.setAge(2);
		System.out.println(animal1.getAge());

	}

}
