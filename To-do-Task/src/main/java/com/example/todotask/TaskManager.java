package com.example.todotask;

import com.example.todotask.DBConnector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    // Method to add a task to the database
    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (title, description, deadline, priority, category, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, task.getTitle());
            pstmt.setString(2, task.getDescription());
            pstmt.setDate(3, Date.valueOf(task.getDeadline()));
            pstmt.setString(4, task.getPriority());
            pstmt.setString(5, task.getCategory());
            pstmt.setString(6, task.getStatus());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to mark a task as done in the database
    public void markTaskAsDone(int taskId) {
        String sql = "UPDATE tasks SET status = 'Done' WHERE id = ?";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, taskId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get all tasks from the database
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks ORDER BY deadline";

        try (Connection conn = DBConnector.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                Date deadline = rs.getDate("deadline");
                String priority = rs.getString("priority");
                String category = rs.getString("category");
                String status = rs.getString("status");

                tasks.add(new Task(id, title, description, deadline.toLocalDate(), priority, category, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasks;
    }

    // Method to get upcoming tasks (due after today)
    public List<Task> getUpcomingTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks WHERE deadline > CURRENT_DATE ORDER BY deadline";

        try (Connection conn = DBConnector.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                Date deadline = rs.getDate("deadline");
                String priority = rs.getString("priority");
                String category = rs.getString("category");
                String status = rs.getString("status");

                tasks.add(new Task(id, title, description, deadline.toLocalDate(), priority, category, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasks;
    }

    // Method to get overdue tasks (due before today and still pending)
    public List<Task> getOverdueTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks WHERE deadline < CURRENT_DATE AND status = 'Pending' ORDER BY deadline";

        try (Connection conn = DBConnector.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                Date deadline = rs.getDate("deadline");
                String priority = rs.getString("priority");
                String category = rs.getString("category");
                String status = rs.getString("status");

                tasks.add(new Task(id, title, description, deadline.toLocalDate(), priority, category, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasks;
    }
}

