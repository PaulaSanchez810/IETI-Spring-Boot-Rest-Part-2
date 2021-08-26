package co.edu.escuelaing.ieti.dto;

import co.edu.escuelaing.ieti.status.TaskStatus;

import java.util.Date;

public class TaskDto {

    private String name,description;
    TaskStatus status;
    private Date assignedTo, dueDate, created;

    public TaskDto(String name, String description, TaskStatus status, Date assignedTo, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Date getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setAssignedTo(Date assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
