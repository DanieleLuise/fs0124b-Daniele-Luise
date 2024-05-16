package it.epicode.esercizio4.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Topping {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Column(length = 255)
	private String description;
	@ManyToOne
	private Pizza pizza;

}
