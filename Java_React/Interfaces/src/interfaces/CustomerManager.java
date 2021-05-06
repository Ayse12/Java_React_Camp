package interfaces;

public class CustomerManager {
	private Logger[] loggers;

	//Array þeklinde logger tanýmlama
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi : " +customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi : " +customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
}
