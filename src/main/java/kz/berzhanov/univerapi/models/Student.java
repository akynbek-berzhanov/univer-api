package kz.berzhanov.univerapi.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private Integer id;

    private String name;

    private String surname;

    private LocalDate birthdate;

    private String phoneNumber;
}
