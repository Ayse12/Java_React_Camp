package kodlamaionesnesi;

public class Instructor extends User{
	private int numberOfCourses;
	private int numberOfStudents;
	
	public Instructor(int id,String name,String email,int age,int numberOfCourses,int numberOfStudents) {
		super(id,name,email,age);
		this.numberOfCourses=numberOfCourses;
		this.numberOfStudents=numberOfStudents;
	}
	public Instructor() {
		
	}
	
	
	public int getCourses() {
		return numberOfCourses;
	}
	public void setCourses(int courses) {
		this.numberOfCourses = courses;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	
	
}
