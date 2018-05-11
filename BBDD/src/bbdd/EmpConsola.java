/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class EmpConsola {
        public void listado2() throws SQLException {
        
       Empleados emp = new Empleados();
        Empleado emp1 = new Empleado();
        ArrayList<Empleado> emps = new ArrayList<>();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Pulsa 1 para listar todos los empleados o 2 solo para listar de uno en uno");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                emp.ListarTodosEmp();
                emps = emp.ListarTodosEmp();
                for (int i = 0; i < emps.size(); i++){
                System.out.println(emps.get(i).getEmp_no()+ " | " + emps.get(i).getApellido() + " | " + emps.get(i).getOficio()+ " | " + emps.get(i).getDirector()+ " | " + emps.get(i).getFecha_alta()+ " | " + emps.get(i).getSalario()+ " | " + emps.get(i).getComision()+ " | " + emps.get(i).getDept_no() );
            }
            break;
            case 2: 
                emp1 = emp.ListarUnoEmp(Integer.parseInt(sc.nextLine()));
                System.out.println(emp1.getEmp_no() + " | "  + emp1.getApellido() + " | " + emp1.getOficio()+ " | " + emp1.getDirector()+ " | " + emp1.getFecha_alta()+ " | " + emp1.getSalario()+ " | " + emp1.getComision()+ " | " + emp1.getDept_no() );
    }
        }
  public void BuscarEmp() throws SQLException {
            Empleados emp = new Empleados();
            Empleado emp1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre del empleado que desea buscar para poder encontrarlo");
            emp1 = emp.BuscarUno(sc.nextLine());
            System.out.println(emp1.getEmp_no() + " | "  + emp1.getApellido() + " | " + emp1.getOficio()+ " | " + emp1.getDirector()+ " | " + emp1.getFecha_alta()+ " | " + emp1.getSalario()+ " | " + emp1.getComision()+ " | " + emp1.getDept_no() );
           
                   
        }
   public void CrearEmpleado() throws SQLException {
            Empleados emp = new Empleados();
            Empleado emp1 = new Empleado();
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el numero de empleado que va a tener el nuevo empleado");
            emp1.setEmp_no(Integer.parseInt(sc.nextLine()));
            System.out.println("Dime el apellido del nuevo empleado ");
            emp1.setApellido(sc.nextLine());
            System.out.println("Dime el oficio que va a tener el nuevo empleado");
            emp1.setOficio(sc.nextLine());
            System.out.println("Dime el numero del director que va a tener");
            emp1.setDirector(Integer.parseInt(sc.nextLine()));
            System.out.println("Dime la fecha de alta del nuevo empleado");
            java.sql.Date jsqlD = java.sql.Date.valueOf(sc.nextLine());
            System.out.println("Dime el salario que va a tener el nuevo empleado");
            emp1.setSalario(Float.parseFloat(sc.nextLine()));
            System.out.println("Dime la comision que va a cobrar el nuevo empleado");
            emp1.setComision(Float.parseFloat(sc.nextLine()));
            System.out.println("Dime el numero de departamento en el que va a estar el nuevo empleado");
            emp1.setDept_no(Integer.parseInt(sc.nextLine()));
            
            emp.CrearEmpleado(emp1);
            
    }
   public void EliminarE() throws SQLException {
        Empleados emp = new Empleados();

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el id del empleado que desea eliminar");

        emp.BorraE(Integer.parseInt(sc.nextLine()));
    }
}
