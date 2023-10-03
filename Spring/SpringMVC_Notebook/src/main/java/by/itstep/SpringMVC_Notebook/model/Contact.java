package by.itstep.SpringMVC_Notebook.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contact {
    private Long id;
    @NotEmpty(message = "Name should be filled")
    @Size(min = 20, max = 50, message = "Incorrect full name legnth")
    private String fio;
    private String phone;
    @NotEmpty
    @Email(message = "Email incorrect")
    private String email;
    private String href;
    private String description;
}
