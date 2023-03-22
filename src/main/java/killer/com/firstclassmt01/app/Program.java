package killer.com.firstclassmt01.app;

import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import killer.com.firstclassmt01.model.Client;
import killer.com.firstclassmt01.model.Order;
import killer.com.firstclassmt01.model.OrderItem;
import killer.com.firstclassmt01.model.OrderStatus;
import killer.com.firstclassmt01.model.Product;

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

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data");
		System.out.println("Status");

		OrderStatus status = OrderStatus.valueOf(scanner.nextLine());

		Order order = new Order(LocalDateTime.now(), status, client, new ArrayList<>()); // LocalDateTime saca la fecha
																							// del sistema

		System.out.println("How many items to this order?");

		int numberOfItems = scanner.nextInt();

		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter # " +i+ " item data =>");
			System.out.println("Product name: ");
			scanner.nextLine(); 		//artificio para que leer el teclado sin que se salte la primera lectura
			String productName = scanner.nextLine();
			System.out.println("Product price: ");
			double productPrice = scanner.nextDouble();
			System.out.println("Quantity: ");
			int quantity = scanner.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantity, productPrice, product);
			
			order.addItem(item);
		}
		
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		scanner.close();

	}

}
