package by.itstep.boot.config;

import by.itstep.boot.model.People;

import by.itstep.boot.service.springjpa.PeopleRepoService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    private PeopleRepoService peopleRepoService;

    @Override
    public void run(String... args) throws Exception {
        //peopleRepoService.addPeople(new People("fio222", "+37529123", "email", "http://itstep.by", ""));
//       peopleRepoService.getAllPeoples()
//               .forEach(people -> System.out.println(people.getFio()));
//       peopleRepoService.deleteByFio("fio");
        peopleRepoService.findPeopleWithAllData()
                .forEach(people -> System.out.println(people.getFio()));


        //for (int i = 0; i < 5; i++) {
         //   addNewPeople(new People("fio", "+37529123", "email", "http://itstep.by", ""));
         //   deleteById(4l);
       // }
    }

    private void addNewPeople(People people) {
        Session session = entityManagerFactory.createEntityManager().unwrap(Session.class);
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(people);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
    }

    private void deleteById(Long id) {
        Session session = entityManagerFactory.createEntityManager().unwrap(Session.class);
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            People forDelete = session.find(People.class, id);
            if (forDelete != null) {
                session.remove(forDelete);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
    }
}
