package week4.assignment;

public class JavaConnectionInherits extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("Connect to the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the database");
		
	}

	@Override
	public void executeConnect() {
		System.out.println("Exeute the database");
		
	}
	@Override
	public void executeQuery() {
		System.out.println("Exeute the Query");
		
	}
	
	public static void main(String[] args) {
		JavaConnectionInherits inherits= new JavaConnectionInherits();
		inherits.connect();
		inherits.disconnect();
		inherits.executeConnect();
		inherits.executeQuery();
	}
}


