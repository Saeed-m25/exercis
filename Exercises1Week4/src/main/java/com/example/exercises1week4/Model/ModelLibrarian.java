package com.example.exercises1week4.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ModelLibrarian {
    @Id
    @NotNull
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String username;
    @NotEmpty
    @Pattern(regexp = "use pattren")
    private String password;
    @NotEmpty
    @Email(message = "valid email")
    @Column(columnDefinition = "check unique")
    private String email;


//    password :String (use pattren)
//
//    email :String (valid email) (check unique)
//

}
