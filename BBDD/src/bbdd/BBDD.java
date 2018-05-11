package bbdd;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class BBDD {

    public static void main(String[] args) throws SQLException {
       DepConsola depConsole = new DepConsola(); // Esto es para hacer la conexion con la clase "DepConsola"
       EmpConsola emConex = new EmpConsola(); //Esto es para hacer la conexion conla clase "EmpConsola"

        System.out.println(
                " +----------------------------------------+\n" +
                " |  1. Listar departamentos               | \n" + 
                " |  2. Listar empleados                   | \n" +
                " |  3. Buscar empleado por nombre         | \n" +
                " |  4. Buscar departamento por nombre     | \n" +
                " |  5. Crear empleado                     | \n" + 
                " |  6. Crear departamento                 | \n" +
                " |  7. Borrar empleado                    | \n" +
                " |  8. Borrar departamento                | \n "+
                "+----------------------------------------+\n");
        
        Scanner sc = new Scanner (System.in);
        int menu = sc.nextInt();
        
        switch (menu){ //El switch desde don de llamamos a las clases donde etensmos los metodos pata crear, listar y borrar 
            case 1:
                depConsole.listado();
                break;
            case 2: 
                emConex.listado2();
                break;
                
            case 3:
                emConex.BuscarEmp();
                break;
            case 4:
                depConsole.BuscarDepartamento();
            case 5:
                emConex.CrearEmpleado();
            case 6:
                depConsole.CrearD();
            case 7: 
                emConex.EliminarE();
            case 8:
                depConsole.EliminarD();
        }

        
        
    }

}
