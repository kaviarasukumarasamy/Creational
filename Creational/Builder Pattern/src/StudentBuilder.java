
public class StudentBuilder {
		   private String firstName;
		   private String lastName;
		   private String city;
		   public StudentBuilder withFirstName(String firstName) {
		       this.firstName = firstName;
		       return this;
		   }

		   public StudentBuilder withLastName(String lastName) {
		       this.lastName = lastName;
		       return this;
		   }
		   public StudentBuilder withcity(String city) {
		       this.city = city;
		       return this;
		   }
		   
		   public Student build() {
		       return new Student(firstName, lastName,city);
		   }
		}

