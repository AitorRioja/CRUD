package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.sql.ResultSet;

public class Empleados {

    private ArrayList<Empleado> Empl;

    private Connection conexion;

    public Empleados() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");
        } catch (SQLException ex) {
            Logger.getLogger(Departamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int Create(Empleado emp) throws SQLException {
        int filas;
        String sql = "INSERT INTO empleados VALUES ( ?, ?, ?, ?, ?, ?, ?,? )";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, emp.getEmp_no());
        sentencia.setString(2, emp.getApellido());
        sentencia.setString(3, emp.getOficio());
        sentencia.setInt(4, emp.getDirector());
        sentencia.setDate(5,(emp.getFecha_alta()));
        sentencia.setFloat(6, emp.getSalario());
        sentencia.setFloat(7, emp.getComision());
        sentencia.setInt(8, emp.getDept_no());
        filas = sentencia.executeUpdate();
        return filas;
    }

    public int Update(Empleado emp) throws SQLException {
        String sql = "UPDATE empleados emp_no = ?, apellido = ?, oficio = ?, dir = ?, fecha_alt = ?, salario = ?, comision = ?, Num_departamento = ?, WHERE emp_no";
        int filas;
        PreparedStatement sentencia = conexion.prepareCall(sql);
        sentencia.setInt(1, emp.getEmp_no());
        sentencia.setString(2, emp.getApellido());
        sentencia.setString(3, emp.getOficio());
        sentencia.setInt(4, emp.getDirector());
        sentencia.setDate(5, emp.getFecha_alta());
        sentencia.setFloat(6, emp.getSalario());
        sentencia.setFloat(7, emp.getComision());
        sentencia.setInt(8, emp.getDept_no());
        filas = sentencia.executeUpdate();
        return filas;
    }

    public Empleado Read(int dep_no) {
        Empleado emp = null;
        
        return emp;
    }

    public void Delete(int dep_no) {

    }

    public void Close() throws SQLException {
        conexion.close();
    }
     public ArrayList <Empleado> ListarTodosEmp() throws SQLException{
        Empleado emp = new Empleado();
        ArrayList<Empleado> emps = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        PreparedStatement sentencia = conexion .prepareStatement(sql);
        ResultSet rs = sentencia.executeQuery();
        while (rs.next()){
            emp = new Empleado();
            emp.setEmp_no(rs.getInt(1));
            emp.setApellido(rs.getString(2));
            emp.setOficio(rs.getString(3));
            emp.setDirector(rs.getInt(4));
            emp.setFecha_alta(rs.getDate(5));
            emp.setSalario(rs.getFloat(6));
            emp.setComision(rs.getFloat(7));
            emp.setDept_no(rs.getInt(8));
            emps.add(emp);
        }
        return emps;
    }

     public Empleado ListarUnoEmp (int emp_no) throws SQLException{
       Empleado emp = new Empleado();
       String sql = "Select * from empleados where emp_no = ?";
       PreparedStatement sentencia = conexion.prepareStatement(sql);
       sentencia.setInt(1, emp_no);
       ResultSet rs = sentencia.executeQuery();
       rs.first();
       emp.setEmp_no(rs.getInt(1));
       emp.setApellido(rs.getString (2));
       emp.setOficio(rs.getString(3));
       emp.setDirector(rs.getInt(4));
       emp.setFecha_alta(rs.getDate(5));
       emp.setSalario(rs.getFloat(6));
       emp.setComision(rs.getFloat(7));
       emp.setDept_no(rs.getInt(8));
       return emp;
    }
     public Empleado BuscarUno (String Apellido) throws SQLException{
         Empleado emp = new Empleado();
         String sql = "Select * from empleados where apellido = ?";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, Apellido);
        ResultSet rs = sentencia.executeQuery();
        rs.first();
        emp.setEmp_no(rs.getInt(1));
        emp.setApellido(rs.getString (2));
        emp.setOficio(rs.getString(3));
        emp.setDirector(rs.getInt(4));
        emp.setFecha_alta(rs.getDate(5));
        emp.setSalario(rs.getFloat(6));
        emp.setComision(rs.getFloat(7));
        emp.setDept_no(rs.getInt(8));
        return emp;
     }
}


