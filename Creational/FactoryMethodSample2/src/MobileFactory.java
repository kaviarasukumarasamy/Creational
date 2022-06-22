
public class MobileFactory {
	public MobileFactory() {

	}

	Mobile createMobile(String type) {

		Mobile mob = null;
		if ("app".equalsIgnoreCase(type)) {
			mob = new Apple();
			System.out.println("Apple created");
		} else if ("sam".equalsIgnoreCase(type)) {
			mob = new Samsung();
			System.out.println("Samsung created");
		}
		return mob;
	}
}
