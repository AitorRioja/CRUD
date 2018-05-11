package bbdd;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class BBDD {

    public static void main(String[] args) throws SQLException {
       DepConsola depConsole = new DepConsola();
       EmpConsola emConex = new EmpConsola();

        System.out.println("1. Listar departamentos \n" + 
                "2. Listar empleados \n" +
                "3. Buscar empleado por nombre \n" +
                "4. Buscar departamento por nombre \n" +
                "5. Crear empleado \n" + 
                "6. Crear departamento \n" +
                "7. Borrar empleado \n" +
                "8. Borrar departamento \n ");
        
        Scanner sc = new Scanner (System.in);
        int menu = sc.nextInt();
        
        switch (menu){
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
