package week4.assignment;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect the database");

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the database");

	}

	@Override
	public void executeConnect() {
		System.out.println("Execute the connection");

	}

	public static void main(String[] args) {
		JavaConnection javaConnection = new JavaConnection();
		javaConnection.connect();
		javaConnection.disconnect();
		javaConnection.executeConnect();
		
		
		
		
	}
}
