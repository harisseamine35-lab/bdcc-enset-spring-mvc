package net.amine.bdccensetspringmvc.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder // builder d'un construction d'un objet
public class Products {
    @Id @GeneratedValue
    private long id ;
    @NotEmpty // pour la validation
    @Size(min = 3, max = 50)
    private  String name;
    @Min(0)
    private double price;
    @Min(1)
    private double quantity;
}

