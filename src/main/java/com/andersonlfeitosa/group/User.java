package com.andersonlfeitosa.group;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<Group> groups = new ArrayList<>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addGroup(Group subGroup) {
        return getGroups().add(subGroup);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}