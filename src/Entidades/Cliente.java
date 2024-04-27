/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona {
    private String codCliente;
    
    public Cliente(){}

    public Cliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    } 
    @Override
    
    public String getText(){
        return "Cliente: "+ this.getNombre()
                + " " + this.getApellido()+ "  |  DNI-CLI: "
                +this.getDni();
    }
    public static Cliente fromPersona(Persona per){
        Cliente cli = new Cliente();
        cli.setNombre(per.getNombre());
        cli.setApellido(per.getApellido());
        cli.setDni(per.getDni());
        return cli;
    }
}
