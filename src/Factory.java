
import java.util.*;
public class Factory<E>{
    public Set<E> getSet(int implementado){
        if(implementado==1){
            return new HashSet<E>(); //regresa HashSet
        }else if(implementado==2){
            return new TreeSet<E>(); //regresa TreeSet
        }else if(implementado==3){
            return new LinkedHashSet<E>(); //regresa LinkedHashSet
        }else{
            return null;
        }
    }
}
