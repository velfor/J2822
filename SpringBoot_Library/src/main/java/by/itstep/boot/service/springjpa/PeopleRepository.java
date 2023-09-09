package by.itstep.boot.service.springjpa;

import by.itstep.boot.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
    @Transactional
    void deleteByFio(String fio);

    @Query("from People where href is not null and description is not null and description <> '' ")
    List<People> findPeopleWithAllData();
}
