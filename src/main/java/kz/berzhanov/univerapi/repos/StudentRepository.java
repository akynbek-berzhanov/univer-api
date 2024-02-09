package kz.berzhanov.univerapi.repos;

import kz.berzhanov.univerapi.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return students;
    }


}
