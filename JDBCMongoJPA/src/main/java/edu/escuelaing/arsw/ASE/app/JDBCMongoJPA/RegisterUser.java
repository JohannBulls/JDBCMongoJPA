package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "users") 
public class RegisterUser {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Date birthdate; 
    private String email;
    private String program;

    // Constructor, getters y setters
    public RegisterUser() {}

    public RegisterUser(String firstName, String lastName, Date birthdate, String email, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.email = email;
        this.program = program;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return String.format(
                "RegisterUser[id=%s, firstName='%s', lastName='%s', birthdate=%s, email='%s', program='%s']",
                id, firstName, lastName, birthdate, email, program);
    }
}
