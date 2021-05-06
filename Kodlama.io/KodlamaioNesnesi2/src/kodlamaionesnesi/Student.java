package kodlamaionesnesi;

public class Student extends User{
	private String courses;
	private double percent;
	
	public Student(int id,String name,String email,int age,String courses,double percent) {
		super(id,name,email,age);
		this.courses=courses;
		this.percent=percent;
	}
	public Student() {
		
	}
	
	
	
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
	

}
