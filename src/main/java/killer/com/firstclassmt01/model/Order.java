package killer.com.firstclassmt01.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

	private LocalDateTime moment; // dato de tipo fecha con la hora y fecha de creacion
	private OrderStatus status; // el tipo OrderStatus va a ser un ENUM
	private Client client;
	private List<OrderItem> items;

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public double total() {
		double sum = 0;
		// for enhacement
		for (OrderItem it : items) {
			sum += it.getPrice() * it.getQuantity();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Order moment: ");
		sBuilder.append(moment).append("\n");
		sBuilder.append("Order status: ");
		sBuilder.append(status).append("\n");
		sBuilder.append(client).append("\n");
		sBuilder.append("Order items: \n");

		for (OrderItem it : items) {
			sBuilder.append(it).append("\n");
		}

		sBuilder.append("Total price: $");
		sBuilder.append(String.format("%.2f", total()));
		return sBuilder.toString();
	}

//	@Override
//	public String toString() {
//		return "Order ["
//				+ "moment=" + moment + 
//				", status=" + status + 
//				", client=" + client + 
//				", items=" + items + "]";
//	}

}
