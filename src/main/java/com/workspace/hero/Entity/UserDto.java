package com.workspace.hero.Entity;


import com.workspace.hero.Entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    String firstName;
    String lastName;
    String email;
    double balance;
    Role role;
}
