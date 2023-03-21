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
	
	private LocalDateTime moment;   //dato de tpo fecha con la hora y fecha de creacion
	private OrderStatus status;		//el tipo OrderStatus va a ser un ENUM
	private Client client;
	private List<OrderItem> items;

}
