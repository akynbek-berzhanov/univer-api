package kz.berzhanov.univerapi.services;

import kz.berzhanov.univerapi.models.request.CreateUpdateStudentRequest;
import kz.berzhanov.univerapi.models.response.StudentResponse;

import java.util.List;

public interface StudentService {

    List<StudentResponse> getStudents();

    List<StudentResponse> getStudentsBySurnameName(String surname, String name);

    StudentResponse getStudent(Integer id);

    void createStudent(CreateUpdateStudentRequest request);

    void deleteStudent(Integer id);

    void updateStudent(CreateUpdateStudentRequest request);


}
