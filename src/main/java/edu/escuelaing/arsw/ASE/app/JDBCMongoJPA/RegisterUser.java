package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.data.annotation.Id;

public class RegisterUser {

  @Id
  public String id;

  public String firstName;
  public String lastName;
  public int age;
  public String email;
  public String program;

  public RegisterUser() {}

  public RegisterUser(String firstName, String lastName, int age, String email, String program) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.email = email;
    this.program = program;
  }

  @Override
  public String toString() {
    return String.format(
        "RegisterUser[id=%s, firstName='%s', lastName='%s', age=%d, email='%s', program='%s']",
        id, firstName, lastName, age, email, program);
  }
}