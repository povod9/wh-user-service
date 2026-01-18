package com.workspace.hero.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.workspace.hero.Entity.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "clients")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonProperty("first_name")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @JsonProperty("last_name")
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "balance", nullable = false)
    private double balance;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

}