package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private RegisterUserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new RegisterUser("Alice", "Smith", new Date(), "alice.smith@example.com", "Science"));
        repository.save(new RegisterUser("Bob", "Smith", new Date(), "bob.smith@example.com", "Science"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (RegisterUser customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (RegisterUser customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

        System.out.println("Customers found with findByProgram('Science'):");
        System.out.println("--------------------------------");
        for (RegisterUser customer : repository.findByProgram("Science")) {
            System.out.println(customer);
        }
    }
}
