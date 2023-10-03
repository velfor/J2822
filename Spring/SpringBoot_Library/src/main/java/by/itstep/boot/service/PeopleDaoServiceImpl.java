package by.itstep.boot.service;

import by.itstep.boot.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleDaoServiceImpl implements PeopleDaoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static List<People> peopleList = new ArrayList<>();

    static {
        peopleList.add(new People(1l, "Иванов", "+375291112233", "mail@mail.ru", "https://mvnrepository.com/search?q=lombok", "", null));
        peopleList.add(new People(2l, "Петров", "+375299876523", "ttt@mail.ru", "https://www.thymeleaf.org/doc/articles/standardurlsyntax.html", "-", null));
    }

    @Override
    public List<People> getAllPeople() {
        List<People> peoples = jdbcTemplate.query("SELECT * FROM users", (ResultSet rs, int rownum) -> {
            People people = new People();
            people.setId(rs.getLong("id"));
            people.setFio(rs.getString("fio"));
            people.setDescription(rs.getString("description"));
            people.setEmail(rs.getString("email"));
            people.setPhone(rs.getString("phone"));
            people.setHref(rs.getString("href"));
            return people;
        });
        return peoples;
    }

    @Override
    public void addPeople(People people) {
        peopleList.add(people);
    }

    @Override
    public People findPeopleById(Long id) {
        return peopleList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
