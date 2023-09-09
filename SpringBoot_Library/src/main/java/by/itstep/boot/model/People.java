package by.itstep.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fio;

    private String phone;

    private String email;

    private String href;

    private String description;

    public People(String fio, String phone, String email, String href, String description) {
        this.fio = fio;
        this.phone = phone;
        this.email = email;
        this.href = href;
        this.description = description;
    }

    @OneToMany
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    private List<Book> bookList;

    private List<Book> getBookList() {
        return bookList;
    }

}
