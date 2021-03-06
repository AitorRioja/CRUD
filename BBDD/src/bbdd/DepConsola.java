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
public class DepConsola {
    
    private String dep_nombr;
    
    public void listado() throws SQLException { //Para listar los depratamentos 1 o todos
        
        Departamentos dep = new Departamentos();
        Departamento dep1 = new Departamento();
        ArrayList<Departamento> deps = new ArrayList<>();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        System.out.println(" Pulsa 1 para listar todos los departamentos o 2 solo para listar de uno en uno  ");
        System.out.println( "+------------------------------------------------------------------------------+\n");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                dep.ListarTodos();
                deps = dep.ListarTodos();
                for (int i = 0; i < deps.size(); i++){
                System.out.println(deps.get(i).getDept_nombre() + " | " + deps.get(i).getDnombre() + " | " + deps.get(i).getLoc());
            }
            break;
            case 2:
                System.out.println("");
                System.out.println("Dime el numero del departamento que quieres listar");
                System.out.println( "+-------------------------------------------------+\n");
                dep1 = dep.ListarUno(Integer.parseInt(sc.nextLine()));
                System.out.println(dep1.getDept_nombre() + " | " + dep1.getDnombre()+ " | " + dep1.getLoc());
        }
    }
    public void BuscarDepartamento () throws SQLException { // Metodo para buscar departamentos
            Departamentos dep = new Departamentos();
            Departamento dep1= new Departamento();
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre del departamento que desea buscar para poder encontrarlo");
            System.out.println( "+---------------------------------------------------------------------------------+\n");
            dep1 = dep.BuscarUnoD(sc.nextLine());
            System.out.println(dep1.getDept_nombre() + " | " + dep1.getDnombre()+ " | " + dep1.getLoc() );
            
    }
    public void CrearD() throws SQLException { //Metodo para crear departamentos
        Departamentos dep = new Departamentos();
        Departamento dep1 = new Departamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Dime el id del departamento que desea crear");
                System.out.println( "+---------------------------------------------------------------------------------+\n");
        dep1.setDept_nombre(Integer.parseInt(sc.nextLine()));
        System.out.println("");
        System.out.println("Dime el nombre del departamento que desea crear");
                System.out.println( "+---------------------------------------------------------------------------------+\n");
        dep1.setDnombre(sc.nextLine());
        System.out.println("");
        System.out.println("Dime la localidad donde estara situado el departamento:");
                System.out.println( "+---------------------------------------------------------------------------------+\n");
        dep1.setLoc(sc.nextLine());
        dep.CreaDep(dep1);
    }
    public void EliminarD() throws SQLException { //Metodo para eliminar departamentos
        Departamentos dep = new Departamentos();

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Dime el departamento que deseas eliminar");
                System.out.println( "+---------------------------------------------------------------------------------+\n");

        dep.BorraD(sc.nextInt());
    }
}
