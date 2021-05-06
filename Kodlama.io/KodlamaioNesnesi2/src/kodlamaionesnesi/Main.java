package kodlamaionesnesi;

public class Main {

	public static void main(String[] args) {
		
			System.out.println("----------------Student Manager-----------------");
	        StudentManager studentManager = new StudentManager();
			Student student = new Student(1, "Ayse", "ayse@ayse.com", 22, "Java-React", 56);
			studentManager.Add(student);
			studentManager.Delete(student);
			studentManager.Update(student);
			
			System.out.println(" ");
			System.out.println("----------------Instructor Manager-----------------");
			
			InstructorManager instructorManager = new InstructorManager();
			Instructor instructor = new Instructor(8, "Engin Demirog", "engin@engin.com", 32, 20, 8620);
			instructorManager.Add(instructor);
			instructorManager.Delete(instructor);
			instructorManager.Update(instructor);
			
			System.out.println(" ");
			System.out.println("-----------------User Manager----------------");
			
			UserManager userManager = new UserManager();
			User user = new User(9, "Ahmet Arıkan", "ahmet@ahmet.com", 25);
			userManager.Add(user);
			userManager.Delete(user);
			userManager.Update(user);

			
	}

}
