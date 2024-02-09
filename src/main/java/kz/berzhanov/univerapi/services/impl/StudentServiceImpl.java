package kz.berzhanov.univerapi.services.impl;

import kz.berzhanov.univerapi.models.Group;
import kz.berzhanov.univerapi.models.request.CreateUpdateStudentRequest;
import kz.berzhanov.univerapi.models.response.StudentResponse;
import kz.berzhanov.univerapi.repos.GroupRepository;
import kz.berzhanov.univerapi.repos.StudentRepository;
import kz.berzhanov.univerapi.services.StudentService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    public List<StudentResponse> getStudents() {
        return studentRepository.getStudents().stream().map(s -> StudentResponse.builder()
                .id(s.getId())
                .name(s.getName())
                .surname(s.getSurname())
                .birthdate(s.getBirthdate())
                .phoneNumber(s.getPhoneNumber())
                .groupNumber(groupRepository.getGroupByStudentId(s.getId()).orElse(new Group()).getNumber())
                .build()).collect(Collectors.toList());
    }

    @Override
    public List<StudentResponse> getStudentsBySurnameName(String surname, String name) {
        return null;
    }

    @Override
    public StudentResponse getStudent(Integer id) {
        return null;
    }

    @Override
    public void createStudent(CreateUpdateStudentRequest request) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public void updateStudent(CreateUpdateStudentRequest request) {

    }
}
