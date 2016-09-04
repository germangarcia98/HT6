
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author German Garcia
 * @author Luis Nájera
 */
public class Factory {

    public Set Factory(int respuesta) {
        
        switch(respuesta)
        {
            case 1:
                return new java.util.HashSet();            
            case 2:
                return new TreeSet();            
            case 3:
                return new LinkedHashSet();            
            default:
                return null;
        }
        
         
    }
    
    
}
