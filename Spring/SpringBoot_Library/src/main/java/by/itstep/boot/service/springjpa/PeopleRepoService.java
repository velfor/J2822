package by.itstep.boot.service.springjpa;

import by.itstep.boot.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleRepoService {
    @Autowired
    private PeopleRepository peopleRepository;

    public void addPeople(People people) {
        peopleRepository.save(people);
    }

    public List<People> getAllPeoples() {
        return peopleRepository.findAll();
    }

    public void deleteByFio(String fio) {
        peopleRepository.deleteByFio(fio);
    }

    public List<People> findPeopleWithAllData() {
        return peopleRepository.findPeopleWithAllData();
    }
}
