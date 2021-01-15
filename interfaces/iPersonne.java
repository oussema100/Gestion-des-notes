/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db3a3.interfaces;

import java.util.List;

/**
 *
 * @author PC
 */
public interface iPersonne<T> {
    public void ajouterPersonne(T t);
    public void supprimerPersonne(T t);
    public void modifierPersonne(T t);
    public List <T> personList();
    
}
