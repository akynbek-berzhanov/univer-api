package kz.berzhanov.univerapi.models.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class CreateUpdateStudentRequest {
    private String name;

    private String surname;

    private LocalDate birthdate;

    private String phoneNumber;
}
