/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.ServicesTest;

import Aplicacion.Models.Person;
import Aplicacion.Services.PersonService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Marty
 */
public class PersonServiceTest {
    @Test
    public void GetSingleTestSuccsses(){
        PersonService service = new PersonService();
        Person person = (Person) service.GetSingle(1);
        Assert.assertEquals("Martin", person.getNombre());
    }
    
    @Test
    public void GetSingleTestNull(){
        PersonService service = new PersonService();
        Person person = (Person) service.GetSingle(6);
        Assert.assertNull(person);
    }
    
    @Test
    public void GetAllTest(){
        PersonService service = new PersonService();
        int size = service.GetAll().size();
        Assert.assertTrue(size == 5);
    }
    @Test
    public void AddPersonTest(){
        PersonService service = new PersonService();
        Person person = new Person(6, "Maria", "Estrada", "73", "Femenino", 165);
        boolean res = service.Add(person);
        int size = service.GetAll().size();
        Assert.assertTrue(res);
        Assert.assertTrue(size == 6);
    }
    @Test
    public void UpdatePersonTes(){
        PersonService service = new PersonService();
        Person person = new Person(6, "Maria", "Estrada", "73", "Femenino", 165);
        boolean res = service.Add(person);
        int size = service.GetAll().size();
        person.setApellido("Estrada Silva");
        boolean update = service.Update(person);
        Assert.assertTrue(res);
        Assert.assertTrue(size == 6);
        Assert.assertTrue(update);        
    }
    
    @Test
    public void RemovePersonTest(){
        PersonService service = new PersonService();
        boolean res = service.Remove(3);
        int size = service.GetAll().size();
        Assert.assertTrue(size == 4);
        Assert.assertTrue(res);
    }
    
    
}
