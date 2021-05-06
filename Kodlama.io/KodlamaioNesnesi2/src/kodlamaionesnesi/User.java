package kodlamaionesnesi;

public class User {
	private int id;
	private String name;
	private String email;
	private int age;
	
	public User(int id,String name,String email,int age) {
		super();
		this.age=age;
		this.email=email;
		this.id=id;
		this.name=name;
	}
	
	public User() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
