package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.java.com.todolist.util.DatabaseUtil;
import model.Todo;

public class TodoRepository {

    public List<Todo> findAll() {
        List<Todo> todos = new ArrayList<>();
        String sql = "SELECT * FROM todos";
        try (Connection conn = DatabaseUtil.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Todo todo = new Todo();
                todo.setId(rs.getInt("id"));
                todo.setDescription(rs.getString("description"));
                todo.setCompleted(rs.getBoolean("completed"));
                todos.add(todo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todos;
    }

    public Todo findById(int id) {
        String sql = "SELECT * FROM todos WHERE id = ?";
        Todo todo = null;
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                todo = new Todo();
                todo.setId(rs.getInt("id"));
                todo.setDescription(rs.getString("description"));
                todo.setCompleted(rs.getBoolean("completed"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todo;
    }

    public Todo save(Todo todo) {
        String sql = "INSERT INTO todos (description, completed) VALUES (?, ?) RETURNING id";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, todo.getDescription());
            pstmt.setBoolean(2, todo.isCompleted());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                todo.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todo;
    }

    public boolean deleteById(int id) {
        String sql = "DELETE FROM todos WHERE id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Todo todo) {
        String sql = "UPDATE todos SET description = ?, completed = ? WHERE id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, todo.getDescription());
            pstmt.setBoolean(2, todo.isCompleted());
            pstmt.setInt(3, todo.getId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
