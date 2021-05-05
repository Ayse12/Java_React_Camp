package PolymorphismDemo;


public class Main {

	public static void main(String[] args) {
		//Loglama();
		//DizilerleLoglama();
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		
	}
	
	public static void Loglama() {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.Log("Log mesajý");
	}
	public static void DizilerleLoglama() {
		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
		for(BaseLogger logger:loggers) {
		logger.Log("Log Mesajý");
		}

	}
}
