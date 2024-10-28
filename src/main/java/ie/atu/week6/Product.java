package ie.atu.week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotBlank
    private String id;

    @NotBlank(message = "Name cannot be Blank")
    private String name;

    @Min(0)
    private int price;

}
