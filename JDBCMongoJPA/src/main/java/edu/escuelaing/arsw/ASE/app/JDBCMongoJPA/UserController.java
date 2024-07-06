package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private RegisterUserRepository repository;

    @GetMapping
    public List<RegisterUser> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public RegisterUser addUser(@RequestBody RegisterUser user) {
        return repository.save(user);
    }
}