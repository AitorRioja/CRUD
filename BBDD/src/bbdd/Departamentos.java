package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Departamentos {

    private Connection conexion;
    private ArrayList<Departamento> departamentos;
 
    public Departamentos() { //Establece la conexion entre java y la base de datos

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");
        } catch (SQLException ex) {
            Logger.getLogger(Departamentos.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    public int Create(Departamento dep) throws SQLException { //metodo para crear la departamentos
        int filas;
        String sql = "INSERT INTO departamentos VALUES ( ?, ?, ? )";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, dep.getDept_nombre());
        sentencia.setString(2, dep.getDnombre());
        sentencia.setString(3, dep.getLoc());
        filas = sentencia.executeUpdate();
        return filas;
    }

    public int Update(int dep_no, Departamento dep) throws SQLException { // metodo para actualizar la tabla departamentos
        String sql = "UPDATE departamentos Dnombre = ?, Localidad = ?, WHERE dep_nombre";
        int filas;
        PreparedStatement sentencia = conexion.prepareCall(sql);
        sentencia.setString(1, dep.getDnombre());
        sentencia.setString(2, dep.getLoc());
        sentencia.setInt(3,dep_no);
        filas = sentencia.executeUpdate();
        return filas;
    }

    public  Departamento Read(String dep_nombre) throws SQLException { //metodo para leer las tablas
            Departamento dep = new Departamento();
            String sql = "SELECT * FROM departamentos WHERE dnombre = ?"; 
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString (1, dep_nombre);
            ResultSet rs = sentencia.executeQuery();
            rs.first();
            dep.setDept_nombre(rs.getInt(1));
            dep.setDnombre(rs.getString(2));
            dep.setLoc(rs.getString(3));
            return dep;
    }

    public int Delete(int dep_no) throws SQLException { // metodo para borrar  cosas de las tablas
            int filas;
            String sql = "DELETE * FROM departamentos WHERE dept_nombre = ?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, dep_no);
            filas = sentencia.executeUpdate();
            return filas;
    }
    public void Close() throws SQLException{ // cierra la conexion
        conexion.close();
    }
    
    public ArrayList <Departamento> ListarTodos() throws SQLException{ // metodos para listar todos los departamentos
        Departamento dep = new Departamento();
        ArrayList<Departamento> deps = new ArrayList<>();
        String sql = "SELECT * FROM departamentos";
        PreparedStatement sentencia = conexion .prepareStatement(sql);
        ResultSet rs = sentencia.executeQuery();
        while (rs.next()){
            dep = new Departamento();
            dep.setDept_nombre(rs.getInt(1));
            dep.setDnombre(rs.getString(2));
            dep.setLoc(rs.getString(3));
            deps.add(dep);
        }
        return deps;
    }
    
    public Departamento ListarUno (int dept_nombre) throws SQLException{ //metodos para listar los departamentos de uno en uno
       Departamento dep = new Departamento();
       String sql = "Select * from departamentos where dept_no = ?;";
       PreparedStatement sentencia = conexion.prepareStatement(sql);
       sentencia.setInt(1, dept_nombre);
       ResultSet rs = sentencia.executeQuery();
       rs.first();
       dep.setDept_nombre(rs.getInt(1));
       dep.setDnombre(rs.getString (2));
       dep.setLoc(rs.getString(3));
       return dep;
    }
    
    public Departamento BuscarUnoD(String dnombre) throws SQLException { // metodo para buscar un departamento por su nombre
        Departamento dep = new Departamento();
       String sql = "Select * from departamentos where dnombre = ?";
       PreparedStatement sentencia = conexion.prepareStatement(sql);
       sentencia.setString(1, dnombre);
       ResultSet rs = sentencia.executeQuery();
       rs.first();
       dep.setDept_nombre(rs.getInt(1));
       dep.setDnombre(rs.getString (2));
       dep.setLoc(rs.getString(3));
       return dep;
    }
    
    public int CreaDep (Departamento dep) throws SQLException { //metodo para crear un departamento 
        int filas;
        String sql = "INSERT INTO Departamentos VALUES (?, ?, ?)";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, dep.getDept_nombre());
        sentencia.setString(2, dep.getDnombre());
        sentencia.setString(3, dep.getLoc());
        filas = sentencia.executeUpdate();
        return filas;
    }
    
    public int BorrarDep (int dep) throws SQLException { // metodo para borrar un departamento
        String sql = "DELETE FROM Departamentos WHERE dept_nombre";
        int filas;
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, dep);
        filas = sentencia.executeUpdate();
        return filas;
    }
    public int CreaD(Departamento dep) throws SQLException {
        int filas;
        String sql = "INSERT INTO Departamentos VALUES (?,?,?)";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, dep.getDept_nombre());
        sentencia.setString(2, dep.getDnombre());
        sentencia.setString(3, dep.getLoc());
        filas = sentencia.executeUpdate();
        return filas;
    }
     public int BorraD(int dept_no) throws SQLException { // metodo para borrar departamentos
        String sql = "DELETE FROM Departamentos WHERE dept_no = ?";
        int filas;
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, dept_no);
        filas = sentencia.executeUpdate();
        return filas;
    }
}