package killer.com.firstclassmt01.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import killer.com.firstclassmt01.model.Client;
import killer.com.firstclassmt01.model.Order;
import killer.com.firstclassmt01.model.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = scanner.nextLine();
		System.out.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Birth date: (YYYY-MM-DD)");
		String birthDateString = scanner.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateString);
		
		Client client= new Client(name, email, birthDate);
		
		System.out.println("Enter order data");
		System.out.println("Status");
		
		OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
		
		Order order = new Order(LocalDateTime.now(), status, client, new ArrayList<>());
		
		

	}

}
