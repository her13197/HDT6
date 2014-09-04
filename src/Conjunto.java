
import java.util.Set;
import javax.swing.JOptionPane;


public class Conjunto {
    //DATOS
    private Factory factor = new Factory();
    private int op;
    private int expe;
    private Boolean sub;
    private String subC;
    private String nombre;
    private Set<String> Java = null;
    private Set<String> Web = null;
    private Set<String> Cel = null;
    private Set<String> res1 = null;
    private Set<String> res2 = null;
    private Set<String> res3 = null;
    private Set<String> res4 = null;
    private Set<String> res5 = null;
    private Set<String> res6 = null;
        
    public Conjunto(){
        //MENU
        op=Integer.parseInt(JOptionPane.showInputDialog("Que implementación"
                + " desea usar:\n1)HashSet\n2)TreeSet\n3)LinkedHashSet"));
        //LISTAS
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
            expe=JOptionPane.showConfirmDialog(null,"Desea ingresar otra persona");
            if(expe==0){
                op=0;
            }
        }while(op!=1);
    }
    
    public void Resultados(){
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
        if(Java.size() > Web.size() ){
            if(Java.size() > Cel.size()){
                
            }
        }
    }
}
