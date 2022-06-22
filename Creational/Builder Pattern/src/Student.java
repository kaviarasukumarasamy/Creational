
public class Student {
	private String firstName;
	private String lastName;
	private String city;

	public Student(String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city=city;
	}

	@Override
	public String toString() {

		return "Student[firstName=" + firstName + ",lastName=" + lastName + ",city= "+ city+"]";
	}

}
