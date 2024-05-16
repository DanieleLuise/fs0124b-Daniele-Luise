package it.epicode.esercizio4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Pizza {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 20)
	private String name;
	@OneToMany(mappedBy = "pizza",fetch = FetchType.EAGER)
	@Builder.Default
	@ToString.Exclude
	private List<Topping> toppings = new ArrayList<>();




}
