//Clase:Factory.java
//Clase factory que permite escoger entre las diferentes implementaciones
//Hecho por:            Ma. Isabel Fernandez      Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Ana Bartra                Carnet: 13643
//Fecha: 04/09/2014
//***************************************************************
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
