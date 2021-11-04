package com.littleCoders.ChallengeEpic.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String role;

    @Column(name = "name")
    private String userName;

    @Column
    private Date dob;

    @Column
    private String location;

    @OneToOne
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "created_by", referencedColumnName = "id")
//    private UserEntity createdBy;
    @Column
    private int createdBy;

    @CreationTimestamp
    private Timestamp createdDate;

//    @OneToOne
//    @JoinColumn(name = "last_modified_by", referencedColumnName = "id")
//    private UserEntity lastModifiedBy;
    @Column
    private int lastModifiedBy;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;
}
