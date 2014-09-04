//Clase:Conjunto.java
//Modela los diferentes conjuntos de desarrolladores y obtiene los
//resultados que se deben desplegar
//Hecho por:            Ma. Isabel Fernandez      Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Ana Bartra                Carnet: 13643
//Fecha: 04/09/2014
//***************************************************************
import java.util.*;
import javax.swing.*;


public class Conjunto { 
    //DATOS
    private Factory factor = new Factory();
    private int op; 
    private int expe;
    private Boolean sub;
    private String subC;
    private String nombre;
    private String NombreCon;
    private Set<String> Java = null;
    private Set<String> Web = null;
    private Set<String> Cel = null;
    private Set<String> res1 = null;
    private Set<String> res2 = null;
    private Set<String> res3 = null;
    private Set<String> res4 = null;
    private Set<String> res5 = null;
    private Set<String> res6 = null;
        
    public Conjunto(){ //inicializacion
        //MENU
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Que implementación"
                + " desea usar:\n1)HashSet\n2)TreeSet\n3)LinkedHashSet"));
        }while(op>0 && op<4);
        //LISTAS con factory
        Java = factor.getSet(op);
        Web = factor.getSet(op);
        Cel = factor.getSet(op);
        res1 = factor.getSet(op);
        res2 = factor.getSet(op);
        res3 = factor.getSet(op);
        res4 = factor.getSet(op);
        res5 = factor.getSet(op);
        res6 = factor.getSet(op);
    }
    
    public void ingresarP(){
        //Ingreso de personas
        do{
            nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
            
            //java
            expe=JOptionPane.showConfirmDialog(null,"Tiene experiencia en Java?");
            if(expe==0){
                Java.add(nombre);
            }
            
            //Web
            expe=JOptionPane.showConfirmDialog(null,"Tiene experiencia en desarrollo Web?");
            if(expe==0){
                Web.add(nombre);
            }
            
            //Celulares
            expe=JOptionPane.showConfirmDialog(null,"Tiene experiencia en desarrollo de celulares?");
            if(expe==0){
                Cel.add(nombre);
            }
            
            //agregar otro
            op=JOptionPane.showConfirmDialog(null,"Desea ingresar otra persona");
        }while(op!=1);
    }
    
    public void Resultados(){ //calcula y obtiene los resultados
        //RESULTADO 1
        res1.addAll(Java);
        res1.retainAll(Web);
        res1.retainAll(Cel);
        System.out.println("Los desarrolladores con experiencia en los tres campos:\n"+res1);
       
        //RESUTLADO 2
        res2.addAll(Java);
        res2.removeAll(Web);
        System.out.println("Desarrolladores Java que no sabe Web:\n"+res2);
        
        //RESULTADO 3
        res3.addAll(Web);
        res3.retainAll(Cel);
        res3.removeAll(Java);
        System.out.println("Desarrolladores Web y de Celulares que no saben Java:\n"+res3);
        
        //RESULTADO 4
        res4.addAll(Web);
        res4.addAll(Cel);
        res4.removeAll(Java);
        System.out.println("Desarrolladores Web o de Celulares que no saben Java:\n"+res4);
        
        //RESULTADO 5
        sub = Web.containsAll(Java);
        if(sub==true){
            subC="Si";
        }else{
            subC="No";
        }
        System.out.println("Es el conjunto de desarrollores Java suconjunto de los desarrolladores Web?" + subC);
        
        //RESULTADO 6 y 7
        
        //VERIFICAR CUAL ES EL CONJUNTO CON MAS DESARROLLADORES
        if(Java.size() > Cel.size() && Java.size() > Web.size()){
            NombreCon="Desarrolladores Java";
            res6=Java;
        }else if(Cel.size() > Java.size() && Cel.size() > Web.size()){
            NombreCon="Desarrolladores de celulares";
            res6=Cel;
        }else if(Web.size() > Cel.size() && Web.size() > Java.size()){
            NombreCon="Desarrolladores Web";
            res6=Web;
        } else {
            res6=null;
            System.out.println("Existen conjuntos del mismo tamaño");
        }
        
        //Imprimir resultados
        if(res6!=null){
            System.out.println("El conjunto más grande es el de los "+NombreCon+" y sus miembros son:\n"+res6);
            
            Set res6orden = new TreeSet(res6); //ordena la lista de nombres
            System.out.println("Lista ordenada:\n"+res6orden);
        }
    }
}
