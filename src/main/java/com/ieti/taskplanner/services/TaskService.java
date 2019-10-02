package com.ieti.taskplanner.services;

import com.ieti.taskplanner.model.Task;
import com.ieti.taskplanner.model.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface TaskService {
    public List<Task> geTasksList();

    public Task getTaskById(String id);

    public List<Task> getTasksByUserId(String userId);

    public Task assignedTaskToUser(String taskId, User user);

    public void removeTask(String taskId);

    public Task updateTask(String id, User responsible, String status, Date dueDate);
}
