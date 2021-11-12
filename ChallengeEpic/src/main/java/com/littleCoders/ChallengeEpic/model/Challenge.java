package com.littleCoders.ChallengeEpic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Blob;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "challenge")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Challenge Name should not be empty.")
    @Size(min = 6, max = 40, message = "Challenge Name should be at least between 6 characters and 40 characters.")
    @Column(name = "name")
    private String challengeName;

    @NotBlank(message = "Details should not be empty.")
    @Size(min = 10, max = 4000, message = "Details should be at least between 10 characters and 4000 characters.")
    @Column(name = "details")
    private String details;

    @JsonIgnore
    private Blob outputVideo;
    @JsonIgnore
    private Blob image;
    @JsonIgnore
    private Blob resources;

    @Column(name = "challenge_type")
    private int challengeType;

    @Column(name = "status")
    private int status;

    @Column(name = "category_id")
    private int categoryId;

    @OneToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private UserEntity createdBy;

    @CreationTimestamp
    private Timestamp createdDate;

    @OneToOne
    @JoinColumn(name = "last_modified_by", referencedColumnName = "id")
    private UserEntity lastModifiedBy;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;
}
