package com.example.day39.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "age must not be null")
    @Column(columnDefinition = "int not null")
    private Integer age;
    @Email(message = "please enter correct email")
    @NotEmpty(message = "email must not be null")
    @Column(columnDefinition = "varchar(30) not null")
    private String email;
    @NotNull(message = "salary must not be null")
    @Column(columnDefinition = "int not null")
    private Integer salary;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "teacher")
    @PrimaryKeyJoinColumn
    private Address address;
}
