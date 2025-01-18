package loicMangele.Direct237.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "voyages")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Voyages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Origin is required")
    private String origin;

    @NotBlank(message = "Destination is required")
    private String destination;

    @NotNull(message = "Date is required")
    private LocalDate date;

    @NotNull(message = "Maximum weight is required")
    private Double maxWeight;

    private Double availableWeight;
}
