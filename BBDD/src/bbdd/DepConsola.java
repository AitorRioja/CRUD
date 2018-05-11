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
    
    public void listado() throws SQLException {
        
        Departamentos dep = new Departamentos();
        Departamento dep1 = new Departamento();
        ArrayList<Departamento> deps = new ArrayList<>();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Pulsa 1 para listar todos los departamentos o 2 solo para listar de uno en uno");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                dep.ListarTodos();
                deps = dep.ListarTodos();
                for (int i = 0; i < deps.size(); i++){
                System.out.println(deps.get(i).getDept_nombre() + " | " + deps.get(i).getDnombre() + " | " + deps.get(i).getLoc());
            }
            break;
            case 2: 
                System.out.println("Dime el numero del departamento que quieres listar");
                dep1 = dep.ListarUno(Integer.parseInt(sc.nextLine()));
                System.out.println(dep1.getDept_nombre() + " | " + dep1.getDnombre()+ " | " + dep1.getLoc());
        }
        dep1= dep.BuscarUno(Intege)
    }
}
