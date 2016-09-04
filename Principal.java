import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Nájera
 */
public class Principal {
    static boolean primerDato = false;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Set DesarrolladoresJ = null; 
        Set DesarrolladoresW= null;
        Set DesarrolladoresC = null;
        Factory datos = new Factory();
        int opcion=0;
        
        
        while (opcion!= 4)
        {
            opcion = menu(); 
            switch (opcion)
            {
                case 1: 
                    int respuesta = SeleccionSet();
                    DesarrolladoresJ = datos.Factory(respuesta);
                    DesarrolladoresW = datos.Factory(respuesta);
                    DesarrolladoresC = datos.Factory(respuesta);
                    
                    break;
                case 2:
                    System.out.println("");
                    
                    switch(DatosDesarrollador()){
                        case 1:
                            DesarrolladoresJ.add(sc.next());
                            break;
                        case 2:
                            DesarrolladoresW.add(sc.next());
                            break;
                        case 3:
                            DesarrolladoresC.add(sc.next());
                            break;
                        
                    }
                    break;
                case 3: 
                    Iterator Javaitr = DesarrolladoresJ.iterator();
                    Iterator Webitr = DesarrolladoresW.iterator();
                    Iterator Celitr = DesarrolladoresC.iterator();
                    switch(Operaciones()){
                        
                        case 1:
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Java, Web y Celular:");
                            System.out.print("\n");
                            while(Javaitr.hasNext()) {
                                Object element = Javaitr.next();
                                System.out.print(element + ",");
                            }
                            while(Webitr.hasNext()) {
                                Object element = Webitr.next();
                                System.out.print(element + ",");
                            } 
                            while(Celitr.hasNext()) {
                                Object element = Celitr.next();
                                System.out.print(element + ",");
                            } 
                            System.out.print("\n");
                            break;
                            
                            
                        case 2:
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Java pero sin experiencia Web:");
                            System.out.print("\n");
                            while(Javaitr.hasNext()) {
                                Object element = Javaitr.next();
                                System.out.print(element + ",");
                            } 
                            System.out.print("\n");
                            break;
                            
                            
                        case 3:
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Web y celular");
                            System.out.print("\n");
                            while(Webitr.hasNext()) {
                                Object element = Webitr.next();
                                System.out.print(element + ",");
                            } 
                            while(Celitr.hasNext()) {
                                Object element = Celitr.next();
                                System.out.print(element + ",");
                            }
                            System.out.print("\n");
                            break;
                        
                        case 4:
                            
                            break;
                         
                        case 5:
                            
                            break;
                        
                        case 6:
                            
                            break;
                            
                        case 7:
                            
                            break;
                    }
                    
                    break;
            }
        }
    }
    
        
    
    public static int menu() {
        
        
        Scanner sc = new Scanner(System.in);
        int respuesta=0;
        if (primerDato==false){
            primerDato=true;
            respuesta =1;
        }
        else{
            System.out.println("");
            System.out.println("Menu: ");
            System.out.println("1. Seleccionar el tipo de SET que utilizará ");
            System.out.println("2. Ingresar datos desarrolladores ");
            System.out.println("3. Operaciones ");
            System.out.println("4. Salir "); 
            respuesta = sc.nextInt();
        }
        
        
        return respuesta;
    }
    
    
    public static int SeleccionSet() {
        Scanner sc = new Scanner(System.in);
        int respuesta=0;
        System.out.println("");
        System.out.println("Seleccione el tipo de SET que utilizará ");
        System.out.println("1.HashSet ");
        System.out.println("2.TreeSet ");
        System.out.println("3.LinkedHashSet ");
        respuesta = sc.nextInt();
        return respuesta;
    }
    
    
    public static int DatosDesarrollador() {
        Scanner sc = new Scanner(System.in);
        int entrada;
        
        System.out.println("");
        System.out.println("Seleccione la opción de desarrollador que desea seguido de su nombre: ");
        System.out.println("1. Desarrollador Java");
        System.out.println("2. Desarrollador web");
        System.out.println("3. Desarrollador de celulares ");
        entrada = sc.nextInt();
        
        return entrada;
    }
    
    public static int Operaciones() {
        Scanner sc = new Scanner(System.in);
        int entrada;
        
        System.out.println("");
        System.out.println("Seleccione el resultado que desea: ");
        System.out.println("1. Desarrolladores con experiencia Java, Web y Celular");
        System.out.println("2. Desarrolladores con experiencia Java");
        System.out.println("3. Desarrolladores con experiencia Celular y Web ");
        System.out.println("3. Desarrolladores con experiencia Celular y Web ");
        System.out.println("4. Desarrolladores con experiencia Celular o Web ");
        System.out.println("5. ¿El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web? ");
        System.out.println("6. Grupo con mayor cantidad de desarrolladores ");
        System.out.println("7. Lista integrantes del grupo con mayor cantidad de desarrolladores ");
        entrada = sc.nextInt();
        
        return entrada;
    }
    
}
