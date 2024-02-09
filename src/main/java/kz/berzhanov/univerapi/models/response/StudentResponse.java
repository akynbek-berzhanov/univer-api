package kz.berzhanov.univerapi.models.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class StudentResponse {
    private Integer id;

    private String name;

    private String surname;

    private LocalDate birthdate;

    private String phoneNumber;

    private Integer groupNumber;
}
