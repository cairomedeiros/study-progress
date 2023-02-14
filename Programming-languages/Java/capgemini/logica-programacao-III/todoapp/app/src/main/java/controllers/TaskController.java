package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.connectionFactory;

public class TaskController {
    public void save(Task task){
        String sql = "INSERT INTO tasks (idProject"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES ()";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            
        }catch(){
            
        }
    }
    
    public void update(Task task){
        
    }
    
    public void removeById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE ID = ?";
        
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try{
            conn = connectionFactory.getConnection(); //pediu a conecção
            statement = conn.prepareStatement(sql); //preparou o sql
            statement.setInt(1, taskId); //setou o valor na interrogação q veio por parametro
            statement.execute(); //executou o comando delete
        }catch(SQLException ex){
            throw new SQLException("Erro ao deletar!");
        }finally{
            connectionFactory.closeConnection(conn);
        }
    }
    
    public List<Task> getAll(int idProject){
        
        return null;
        
    }
}
