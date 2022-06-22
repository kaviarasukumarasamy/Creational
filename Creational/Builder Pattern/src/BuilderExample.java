
public class BuilderExample {

	public static void main(String[] args) {
		   Student student = new StudentBuilder().withFirstName("Thornton")
		           .withLastName("Melon").withcity("erode").build();
		   
		   System.out.println(student);
	}
	}


