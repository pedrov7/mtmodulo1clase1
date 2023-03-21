 package killer.com.firstclassmt01.model;

import java.time.LocalDate;

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
public class Client {
	
	private String name;
	private String email;
	private LocalDate birthDate;  //arguemnto de tipo fecha, de la libreria LocalDate

}
