
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Clase factory para generar HashSet, TreeSet o LikedHashSet.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 02.09.16
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
