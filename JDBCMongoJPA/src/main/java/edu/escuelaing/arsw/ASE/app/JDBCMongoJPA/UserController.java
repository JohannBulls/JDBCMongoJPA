package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * REST controller for managing user registrations.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private RegisterUserRepository repository;

    /**
     * Retrieves all users from the repository.
     * @return A list of RegisterUser objects.
     */
    @GetMapping
    public List<RegisterUser> getAllUsers() {
        return repository.findAll();
    }

    /**
     * Adds a new user to the repository.
     * @param user The user to be added.
     * @return The added RegisterUser object.
     */
    @PostMapping
    public RegisterUser addUser(@RequestBody RegisterUser user) {
        return repository.save(user);
    }
}
