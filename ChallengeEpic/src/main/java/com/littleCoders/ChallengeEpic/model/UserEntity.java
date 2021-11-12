package com.littleCoders.ChallengeEpic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Email
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Password should not be empty.")
    @Size(min = 6, max = 40, message = "Password should be at least between 6 characters and 40 characters.")
    @Column(name = "password")
    private String password;

    @Pattern(regexp = "ROLE_TEACHER|ROLE_STUDENT", message = "Role can be either ROLE_TEACHER or ROLE_STUDENT")
    @Column(name = "role")
    private String role;

    @NotBlank(message = "User name should not be empty.")
    @Size(min = 6, max = 40, message = "User name should be at least between 6 characters and 40 characters.")
    @Column(name = "name")
    private String userName;

    @Column(name = "dob")
    private Date dob;

    @JsonIgnore
    @Column(name = "location")
    private Blob location;

    @OneToOne
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;

    @Column(name = "created_by")
    private int createdBy;

    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "last_modified_by")
    private int lastModifiedBy;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;
}
