package com.nithin.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "tasks")
public class Task {
    @Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    private Date startTime;
    private String specialProperty;

    public Task() {
    }

    public Task(String id, String name, String assignee, String project, Date startTime, String specialProperty) {
        this.id = id;
        this.name = name;
        this.assignee = assignee;
        this.project = project;
        this.startTime = startTime;
        this.specialProperty = specialProperty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getSpecialProperty() {
        return specialProperty;
    }

    public void setSpecialProperty(String specialProperty) {
        this.specialProperty = specialProperty;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", assignee='" + assignee + '\'' +
                ", project='" + project + '\'' +
                ", startTime=" + startTime +
                ", specialProperty='" + specialProperty + '\'' +
                '}';
    }
}
