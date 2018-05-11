package bbdd;

import java.sql.Date;
import java.time.LocalDate;


public class Empleado {
    private int emp_no;
    private String apellido;
    private String oficio;
    private int director;
    private Date fecha_alta;
    private float salario;
    private float comision;
    private int dept_no;

    public Empleado(int emp_no, String apellido, String oficio, int director, Date fecha_alta, float salario, float comision, int dept_no) {
        this.emp_no = emp_no;
        this.apellido = apellido;
        this.oficio = oficio;
        this.director = director;
        this.fecha_alta = fecha_alta;
        this.salario = salario;
        this.comision = comision;
        this.dept_no = dept_no;
    }


    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int num_empleado) {
        this.emp_no = num_empleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int num_departamento) {
        this.dept_no = num_departamento;
    }

    public Empleado() {
    }
    
}
