package com.ns.gwttoken.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

  @Id
  private String _email;
  private String _password;
  private String _role;

}
