package by.itstep.boot.service;

import by.itstep.boot.model.People;

import java.util.List;

public interface PeopleDaoService {
    List<People> getAllPeople();
    void addPeople(People people);
    People findPeopleById(Long id);
}
