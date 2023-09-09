package by.itstep.boot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_approved")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String login;
    private String password;
}
