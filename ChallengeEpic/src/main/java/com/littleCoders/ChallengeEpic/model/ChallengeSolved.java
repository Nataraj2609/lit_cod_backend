package com.littleCoders.ChallengeEpic.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "challenge_solved")
public class ChallengeSolved {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private UserEntity student;

    @OneToOne
    @JoinColumn(name = "challengeId", referencedColumnName = "id")
    private Challenge challengeSolved;

    @Column(name = "solvedLink")
    private String solvedLink;

    @Column(name = "isCurrent")
    private boolean isCurrent;

    @Column(name = "isApproved")
    private boolean isApproved;

    @Column(name = "isSubmittedBefore")
    private boolean isSubmittedBefore;

    @Column(name = "needsRework")
    private boolean needsRework;

    @Column(name = "comments")
    private String comments;

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
