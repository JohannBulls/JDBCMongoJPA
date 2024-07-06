package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterUserRepository extends MongoRepository<RegisterUser, String> {

  public RegisterUser findByFirstName(String firstName);
  public List<RegisterUser> findByLastName(String lastName);
  public List<RegisterUser> findByProgram(String program);
}