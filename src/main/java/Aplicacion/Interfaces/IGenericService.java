/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Interfaces;


import Aplicacion.Models.BaseModel;
import java.util.ArrayList;

/**
 *
 * @author Marty
 */
public interface IGenericService<T extends BaseModel>{
    
    ArrayList<T> GetAll(); 
    T GetSingle(int id);
    boolean Add(T item);
    boolean Update(T item);
    boolean Remove(int id);
    String GetError();
    
}
