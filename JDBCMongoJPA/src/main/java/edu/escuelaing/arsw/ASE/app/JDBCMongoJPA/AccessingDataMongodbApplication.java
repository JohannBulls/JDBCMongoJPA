package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

/**
 * Main application class for accessing MongoDB data using Spring Boot and MongoDB repositories.
 */
@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private RegisterUserRepository repository;

    /**
     * Main method to run the Spring Boot application.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    /**
     * Method to perform operations on MongoDB data upon application startup.
     * @param args Command-line arguments.
     * @throws Exception If an error occurs while running the application.
     */
    @Override
    public void run(String... args) throws Exception {

        // Clear all existing data
        repository.deleteAll();

        // Save a couple of users
        repository.save(new RegisterUser("Alice", "Smith", new Date(), "alice.smith@example.com", "Science"));
        repository.save(new RegisterUser("Bob", "Smith", new Date(), "bob.smith@example.com", "Science"));

        // Fetch all users
        System.out.println("Users found with findAll():");
        System.out.println("-------------------------------");
        for (RegisterUser user : repository.findAll()) {
            System.out.println(user);
        }
        System.out.println();

        // Fetch an individual user by first name
        System.out.println("User found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        // Fetch users by last name
        System.out.println("Users found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (RegisterUser user : repository.findByLastName("Smith")) {
            System.out.println(user);
        }

        // Fetch users by program
        System.out.println("Users found with findByProgram('Science'):");
        System.out.println("--------------------------------");
        for (RegisterUser user : repository.findByProgram("Science")) {
            System.out.println(user);
        }
    }
}
