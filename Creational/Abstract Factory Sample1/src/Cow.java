
public class Cow implements Animal {
	public Cow() {
		this.age = 0;
	}

	int age;

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getAge() {
		return "The COW has " + age + " years old.";
	}
}
