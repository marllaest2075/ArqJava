/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Models;

/**
 *
 * @author Marty
 */
public class Person extends BaseModel{
    private String _nombre;
    private String _apellido;
    private String _edad;
    private String _sexo;
    private int _estatura;

    public Person(int id, String nombre, String apellido, String edad, String sexo, int estatura) {
        super(id);
        _nombre = nombre;
        _apellido = apellido;
        _edad = edad;
        _sexo = sexo;
        _estatura = estatura;
    }

    
    
    
    public String getNombre() {
        return _nombre;
    }
    
    public void setNombre(String nombre) {
        this._nombre = nombre;
    }
    
    public String getApellido() {
        return _apellido;
    }
    
    public void setApellido(String apellido) {
        this._apellido = apellido;
    }
    
    public String getEdad() {
        return _edad;
    }
    
    public void setEdad(String edad) {
        this._edad = edad;
    }
    
    public String getSexo() {
        return _sexo;
    }
    
    public void setSexo(String sexo) {
        this._sexo = sexo;
    }
    
    public int getEstatura() {
        return _estatura;
    }
    
    public void setEstatura(int estatura) {
        this._estatura = estatura;
    }
}
