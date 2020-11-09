/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Services;

import Aplicacion.Models.BaseModel;
import Aplicacion.Interfaces.IGenericService;
import java.util.ArrayList;

/**
 *
 * @author Marty
 */
public class GenericService<T extends BaseModel> implements IGenericService<BaseModel> {

    protected T _item;
    protected ArrayList<T> _items;
    protected String _error;

    @Override
    public ArrayList GetAll() {
        try {
            if (_items.isEmpty()) {
                _error = "No hay Registros";
                return null;
            }
        } catch (Exception e) {
        }
        return _items;
    }

    @Override
    public BaseModel GetSingle(int id) {
        _item = null;
        for (int i = 0; i < _items.size(); i++) {
            if (_items.get(i).getId() == id) {
                _item = _items.get(i);
                break;
            }
        }
        if (_item == null) {
            _error = "Elemento no encontrado";
        }
        return _item;
    }

    @Override
    public boolean Add(BaseModel item) {
        boolean res = false;
        try {
            _items.add((T) item);
            res = true;
        } catch (Exception e) {
            _error = e.getMessage();
            res = false;
        }
        return res;
    }

    @Override
    public boolean Update(BaseModel item) {
        boolean res = false;
        try {
            for (int i = 0; i < _items.size(); i++) {
                if(_items.get(i).getId()== item.getId()){
                    _items.set(i, (T) item);
                    res = true;
                    break;
                }
            }
        } catch (Exception e) {
            res = false;
            _error = e.getMessage();
        }
        return res;
    }

    @Override
    public boolean Remove(int id) {
        boolean res = false;
        try {
            for (int i = 0; i < _items.size(); i++) {
                if(_items.get(i).getId()== id){
                    _items.remove(i);
                    res = true;
                    break;
                }
            }
        } catch (Exception e) {
            res = false;
            _error = e.getMessage();
        }
        return res; 
    }

    @Override
    public String GetError() {
        return  _error;
    }

}
