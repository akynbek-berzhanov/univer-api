package kz.berzhanov.univerapi.repos;

import kz.berzhanov.univerapi.models.Group;
import kz.berzhanov.univerapi.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GroupRepository {

    private final List<Group> groups = new ArrayList<>();

    public List<Group> getGroups(){
        return groups;
    }

    public Optional<Group> getGroupByStudentId(Integer id){
        return groups.stream().filter(gr -> Arrays.stream(gr.getStudents()).filter(s -> s.getId().equals(id)).count()>1).findFirst();
    }

}
