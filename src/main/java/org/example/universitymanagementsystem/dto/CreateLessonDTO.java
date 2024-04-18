package org.example.universitymanagementsystem.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CreateLessonDTO {
   private Long courseId;
   private Instant startedAt;
   private Instant endedAt;
}
