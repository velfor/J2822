package by.itstep.boot.service;

import by.itstep.boot.model.Book;
import by.itstep.boot.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class BookDaoServiceImpl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Book> getAllBook() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM book", (ResultSet rs, int rownum) -> {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setPrice(rs.getInt("price"));
            book.setTitle(rs.getString("title"));
            book.setPeople(getPeopleById(rs.getLong("people_id")));

            return book;
        });
        return books;
    }

    private String getPeopleById(Long people_id) {
        List<People> peoples = jdbcTemplate.query("SELECT * FROM users WHERE people.id=" + people_id,
                (ResultSet rs, int rowNun) -> {
                    People people = new People();
                    people.setId(rs.getLong("id"));
                    people.setFio(rs.getString("fio"));
                    people.setDescription(rs.getString("description"));
                    people.setEmail(rs.getString("email"));
                    people.setPhone(rs.getString("phone"));
                    people.setHref(rs.getString("href"));
                    return people;
                });
        return peoples.get(0).getFio();
    }
}
