package com.api.crud.User;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String lastName;
    private String name;
    private String dni;
    private String birthdate;
    private String email;
    private String userName;
    private String password;
}