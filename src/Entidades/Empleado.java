/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona {
    private String codEmpleado;

    public Empleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Empleado() {}
    
    public String getCodEmpleado() {
        return codEmpleado;
    }
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }   
    @Override
    public String getText(){
    return "EMPLEADO:  "+ this.getNombre()+ "  " +
            this.getApellido()+ "  |  DNI: "+ 
            this.getDni();
    }
    public static Empleado fromPersona(Persona per){
        Empleado empleado = new Empleado();
        empleado.setNombre(per.getNombre());
        empleado.setApellido(per.getApellido());
        empleado.setDni(per.getDni());
        return empleado;
    }
}
