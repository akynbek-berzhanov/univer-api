package kz.berzhanov.univerapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Group {
    private Integer id;

    private Student[] students;

    private Integer number;
}
