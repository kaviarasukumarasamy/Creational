
public class FactoryTest {

	public static void main(String[] args) {
		 MobileFactory factory= new MobileFactory();

         Apple apple = (Apple)factory.createMobile("app");
         apple.cost();
         apple.pictureClarity();
         apple.batteryPower();

         Samsung sam= (Samsung)factory.createMobile("sam");
         sam.cost();
         sam.pictureClarity();
         sam.batteryPower();
	}

}
