package inheritance2;

public class LogManager {
	//Log lama iþleminin yapýlacaðý class
	public void log(int logType) {
		//enum mantýðý
		if(logType==1) {
			System.out.println("Veritabanýna loglandý");
		}else if (logType==2) {
			System.out.println("Dosyaya loglandý.");
		}else {
			System.out.println("Maile loglandý");
		}
		
	}
}


//1 - Database
//2 - File
//3 - Email