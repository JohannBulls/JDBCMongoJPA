package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository interface for performing CRUD operations on RegisterUser documents in MongoDB.
 */
public interface RegisterUserRepository extends MongoRepository<RegisterUser, String> {

    /**
     * Finds a user by their first name.
     * @param firstName The first name of the user.
     * @return A RegisterUser object with the specified first name.
     */
    public RegisterUser findByFirstName(String firstName);

    /**
     * Finds users by their last name.
     * @param lastName The last name of the users.
     * @return A list of RegisterUser objects with the specified last name.
     */
    public List<RegisterUser> findByLastName(String lastName);

    /**
     * Finds users by their program.
     * @param program The program in which the users are enrolled.
     * @return A list of RegisterUser objects with the specified program.
     */
    public List<RegisterUser> findByProgram(String program);

    /**
     * Finds users by their birthdate.
     * @param birthdate The birthdate of the users.
     * @return A list of RegisterUser objects with the specified birthdate.
     */
    public List<RegisterUser> findByBirthdate(Date birthdate);
}
