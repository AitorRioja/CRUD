package bbdd;

import java.time.LocalDate;

public class Departamento {
    private int dept_nombre;
    private String dnombre;
    private String loc;
    
    public int getDept_nombre() {
        return dept_nombre;
    }

    public void setDept_nombre(int dept_no) {
        this.dept_nombre = dept_no;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
        
    }
    
    public Departamento(int dept_no, String dnombre, String loc) {
        this.dept_nombre = dept_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    public Departamento() {
    }
    
}
