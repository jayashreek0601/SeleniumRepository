package week4.assignment;

public class APIClient {
	public void sendRequest(String endPoint) {
		System.out.println("Sending request to endpoint");
		System.out.println("Endpoint: "+endPoint);
	}

	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending request to endpoint");
		System.out.println("Endpoint: "+endPoint);
		System.out.println("Request Body: "+requestBody);
		System.out.println("Request Status: "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient apiClient = new APIClient();
        apiClient.sendRequest("/api.users");
        System.out.println("-------------");
        apiClient.sendRequest("/api.users","xyz", true);
	}
}
