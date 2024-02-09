package kz.berzhanov.univerapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Teacher {
    private Integer id;

    private String name;

    private Subjects[] subjects;

    private Integer experience;
}
