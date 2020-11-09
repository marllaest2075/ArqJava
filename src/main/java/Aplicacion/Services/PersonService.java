/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Services;

import Aplicacion.Models.Person;
import java.util.ArrayList;

/**
 *
 * @author Marty
 */
public class PersonService extends GenericService<Person>  {
    //private final ArrayList<Person> people;

    public PersonService() {
        _items = new ArrayList<>();
        _items.add(new Person(1,"Martin","Llamas","45","Masculino",180));
        _items.add(new Person(2,"Amanda","Servin","42","Femeino",178));
        _items.add(new Person(3,"Jose","Llamas","20","Masculino",165));
        _items.add(new Person(4,"Cielo","Llamas","19","Femeino",170));
        _items.add(new Person(5,"Martincito","Llamas","16","Masculino",175));
        
    }
    
   
    
}
