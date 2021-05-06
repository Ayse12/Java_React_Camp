# 4. GÜN - OOP Soyutlama
- 2 tip bağımlılık var.
	 * Loosly coupled -> Gevşek bağımlı
	 * Tightly coupled -> Katı bağımlı
-	Katıyı gevşeğe çevirmeliyiz.

⭐️Tightly Coupled ait örnek kodlar aşağıda verilmiştir. Loosly Coupled kodları proje içerisindedir. Utils.java dosyasını CustomerManager ile kullanarak gevşek bağımlı bir yapı oluşturuldu. ⭐️

## Tightly Coupled Örneği
##### CustomerManager.java

```java
package interfaces;

public class CustomerManager {
	
	private Logger logger;

	
	//Bir adet logger tanımlayıp çağırma
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	
	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi : " +customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger(); //Katı
		logger.log(customer.getFirstName());
	}
 	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi : " +customer.getFirstName());
		DatabaseLogger logger = new DatabaseLogger(); //Katı
		logger.log(customer.getFirstName());
	}
}
```

---
##### Main.java
```java
package interfaces;

public class Main {

	public static void main(String[] args) {
    	CustomerManager customerManager = new CustomerManager(new EmailLogger());
	   	Customer engin = new Customer(1,"Engin","Demirog");
	   	customerManager.add(engin);

	}
}

```

---
##### OUTPUT
```java
Müşteri Eklendi : Engin
Email Loglandı : Engin
