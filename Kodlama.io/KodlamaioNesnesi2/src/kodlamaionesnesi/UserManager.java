package kodlamaionesnesi;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getName()+" "+"Kullanýcý eklendi.");
	}

	public void Delete(User user) {
		System.out.println(user.getName()+" "+"Kullanýcý silindi.");
	}

	public void Update(User user) {
		System.out.println(user.getName()+" "+"Kullanýcý güncellendi.");
	}
}
