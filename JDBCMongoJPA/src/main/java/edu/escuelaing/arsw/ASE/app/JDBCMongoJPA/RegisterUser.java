package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

/**
 * Represents a user registration document to be stored in the MongoDB collection "users".
 */
@Document(collection = "users") 
public class RegisterUser {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Date birthdate; 
    private String email;
    private String program;

    /**
     * Default constructor for creating an empty RegisterUser object.
     */
    public RegisterUser() {}

    /**
     * Parameterized constructor for creating a RegisterUser object with specified details.
     * @param firstName The first name of the user.
     * @param lastName The last name of the user.
     * @param birthdate The birthdate of the user.
     * @param email The email address of the user.
     * @param program The program in which the user is enrolled.
     */
    public RegisterUser(String firstName, String lastName, Date birthdate, String email, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.program = program;
    }

    // Getters and Setters

    /**
     * Gets the unique identifier of the user.
     * @return The user ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the user.
     * @param id The user ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the first name of the user.
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     * @param firstName The first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the user.
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     * @param lastName The last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the birthdate of the user.
     * @return The birthdate.
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the birthdate of the user.
     * @param birthdate The birthdate.
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets the email address of the user.
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     * @param email The email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the program in which the user is enrolled.
     * @return The program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the program in which the user is enrolled.
     * @param program The program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Returns a string representation of the RegisterUser object.
     * @return A string representation of the user details.
     */
    @Override
    public String toString() {
        return String.format(
                "RegisterUser[id=%s, firstName='%s', lastName='%s', birthdate=%s, email='%s', program='%s']",
                id, firstName, lastName, birthdate, email, program);
    }
}
