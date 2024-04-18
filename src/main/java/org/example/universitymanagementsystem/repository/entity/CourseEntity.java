package org.example.universitymanagementsystem.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String code;
    private int credit;
    private boolean isDeleted;


    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant modifiedAt;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<StudentEntity> students;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorEntity instructor;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<LessonEntity> lessonEntities;


}
