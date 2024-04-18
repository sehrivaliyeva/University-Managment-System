package org.example.universitymanagementsystem.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "instructor_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstructorProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String phoneNumber;
    private String adress;

    @Enumerated(EnumType.STRING)
    private MarriageStatus marriageStatus;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant modifiedAt;

    @OneToOne
    @JoinColumn(name="instructor_id")
    private InstructorEntity instructor;
}
