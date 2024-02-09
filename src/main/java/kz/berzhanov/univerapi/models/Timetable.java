package kz.berzhanov.univerapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Timetable {
    private Integer id;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Group group;

    private Teacher teacher;

}
