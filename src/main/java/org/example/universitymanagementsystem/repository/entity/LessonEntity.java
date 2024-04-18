package org.example.universitymanagementsystem.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.logging.log4j.CloseableThreadContext;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "lesson")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CourseEntity course;

    @OneToMany(mappedBy = "lesson",fetch = FetchType.LAZY)
    private List<AttendanceEntity> attendanceEntityList;

    @Column(nullable = false)
    private Instant startedAt;

    @Column(nullable = false)
    private Instant endedAt;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant modifiedAt;
}
