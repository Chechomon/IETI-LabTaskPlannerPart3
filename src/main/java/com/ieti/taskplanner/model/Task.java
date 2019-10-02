package com.ieti.taskplanner.model;
import java.util.Date;
/**
 *
 * @author Sergio
 */
public class Task {
    private String id;
    private User responsible;
    private String status;
    private Date dueDate;

    public Task() {
    }

    public Task(String id, User responsible, String status, Date dueDate) {
        this.id = id;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
