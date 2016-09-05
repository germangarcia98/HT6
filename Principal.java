import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;


/**
 * Clase para ingresar datos y mostrar resultados.
 * @author German Garcia 15008.
 * @author Luis Nájera 15581.
 * version 02.09.16
 */


public class Principal {
    static boolean primerDato = false;
    
    /**
     * Método main, utilizado para ingreso y salida de datos.
     * @param args 
     */
    public static void main(String args[]) {
        Set DesarrolladoresJ = null; 
        Set DesarrolladoresW= null;
        Set DesarrolladoresC = null;
        Set Auxiliar1 = null;
        Set Auxiliar2 = null;
        Set Auxiliar3 = null;
        SortedSet<String> tree = new TreeSet<>();
        Factory datos = new Factory();
        int opcion=0;
        
        
        while (opcion!= 4)
        {
            opcion = menu(); 
            switch (opcion)
            {
                case 1: /*Inicializa la opción SET elegida por el usuario.*/
                    int respuesta = SeleccionSet();
                    DesarrolladoresJ = datos.Factory(respuesta);
                    DesarrolladoresW = datos.Factory(respuesta);
                    DesarrolladoresC = datos.Factory(respuesta);
                    Auxiliar1 = datos.Factory(respuesta);
                    Auxiliar2 = datos.Factory(respuesta);
                    Auxiliar3 = datos.Factory(respuesta);
                    break;
                    
                case 2:/*Muestra el menu de desarrolladores al usuario*/
                    Scanner dc = new Scanner(System.in);
                    String entrada;
                    String entradaNombre;
                    
                    System.out.println("");
                    System.out.println("Seleccione la opción de desarrollador que desea seguido de su nombre: ");
                    System.out.println("1. Desarrollador Java");
                    System.out.println("2. Desarrollador web");
                    System.out.println("3. Desarrollador de celulares ");
                    System.out.println("Para ingresar más de un dato coloque una coma entre cada número");
                    System.out.println("Ej. 1,2,3....");
                    entrada = dc.nextLine(); /*'Entrada' guarda la opción elegida por el usuario*/
     
                    StringTokenizer token = new StringTokenizer(entrada, ",");  /*Se utiliza StringTokenizer para separar la respuesta*/
                    
                    System.out.println("Ingrese el nombre del desarrollador: ");
                    entradaNombre = dc.nextLine(); /*'EntradaNombre' guarda el nombre del desarrollador.*/
                    
                    while (token.hasMoreTokens()){
                        int dato = Integer.parseInt(token.nextToken());
                        
                        if (dato==1){   /*Si el dato ingresado es igual a 1, el nombre se guarda como desarrollador Java*/
                            DesarrolladoresJ.add(entradaNombre);
                            Auxiliar1.add(entradaNombre);
                        }
                        if (dato==2){   /*Si el dato ingresado es igual a 2, el nombre se guarda como desarrollador Web*/
                            DesarrolladoresW.add(entradaNombre);
                            Auxiliar2.add(entradaNombre);
                        }
                        if (dato==3){   /*Si el dato ingresado es igual a 3, el nombre se guarda como desarrollador Celular*/
                            DesarrolladoresC.add(entradaNombre);
                            Auxiliar3.add(entradaNombre);
                        }
                    }
                    break;
                    
                    
                    
                case 3: /*Se muestra el resultado de la opción seleccionada por el usuario en el menu de Operaciones*/
                    Iterator Javaitr = DesarrolladoresJ.iterator();
                    Iterator Webitr = DesarrolladoresW.iterator();
                    Iterator Celitr = DesarrolladoresC.iterator();
                    
                    switch(Operaciones()){
                        
                        case 1:/*Se muestra la intersección de desarrolladores Jeva,Web y Celular*/
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Java, Web y celular");
                            System.out.print("\n");
                            Auxiliar2.addAll(Auxiliar3);
                            Auxiliar1.addAll(Auxiliar2);
                            System.out.print(Auxiliar1);
                            System.out.print("\n");
                            break;
                            
                            
                        case 2:/*Se muestra el conjunto de desarrolladores java.*/
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Java pero sin experiencia Web:");
                            System.out.print("\n");
                            while(Javaitr.hasNext()) {
                                Object element = Javaitr.next();
                                System.out.print(element + ",");
                            } 
                            System.out.print("\n");
                            break;
                            
                            
                        case 3:/*Se muestra la intersección entre los desarrolladores Web y Celular*/
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Web y celular");
                            System.out.print("\n");
                            Auxiliar2.addAll(Auxiliar3);
                            System.out.print(Auxiliar2);
                            break;
                        
                        case 4:/*Se muestra la union entre los desarrolladores Web y Celular*/
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia Web: \n");
                            while(Webitr.hasNext()) {
                                Object element = Webitr.next();
                                System.out.print(element + ",");
                            } 
                            System.out.print("\n");
                            System.out.print("Desarrolladores con experiencia celular: \n");
                            while(Celitr.hasNext()) {
                                Object element = Celitr.next();
                                System.out.print(element + ",");
                            } 
                            System.out.print("\n");
                            
                            
                            break;
                         
                        case 5:/*Se muestra si el conjunto java es subconjunto de web*/
                            if (DesarrolladoresW.containsAll(DesarrolladoresJ)==true){
                                System.out.println("El conjunto java SI es subconjunto del conjunto Web");
                            }
                            else{
                                System.out.println("El conjunto java NO es subconjunto del conjunto Web");
                            }
                            
                            break;
                        
                        case 6:/*Se muestra el conjunto con mayor cantidad de desarrolladores*/
                            int java=0;
                            int web=0;
                            int cel=0;
                            Iterator Javaitr2 = DesarrolladoresJ.iterator();
                            Iterator Webitr2 = DesarrolladoresW.iterator();
                            Iterator Celitr2 = DesarrolladoresC.iterator();
                            
                            
                            while(Javaitr.hasNext()) {
                                Object element = Javaitr.next();
                                java=java+1;
                            }
                            while(Webitr.hasNext()) {
                                Object element = Webitr.next();
                                web=web+1;
                            } 
                            while(Celitr.hasNext()) {
                                Object element = Celitr.next();
                                cel=cel+1;
                            } 
                            
                            if (((java>=web) && (java>cel)) || ((java>web) && (java>=cel))){
                                System.out.print("\n");
                                System.out.print("El conjuto Java contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                tree.addAll(DesarrolladoresJ);
                                while(Javaitr2.hasNext()) {
                                    Object element2 = Javaitr2.next();
                                    System.out.print(element2 + ",");
                                } 
                                System.out.print("\n"); 
                            }
                            
                            if (((web>=java) && (web>cel)) || ((web>java) && (web>=cel))){
                                System.out.print("\n");
                                System.out.print("El conjuto Web contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                while(Webitr2.hasNext()) {
                                    Object element2 = Webitr2.next();
                                    System.out.print(element2 + ",");
                                }
                                System.out.print("\n"); 
                            }
                            
                            if (((cel>=java) && (cel>web)) || ((cel>java) && (cel>=web))){
                                System.out.print("\n");
                                System.out.print("El conjuto Celular contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                while(Celitr2.hasNext()) {
                                    Object element2 = Celitr2.next();
                                    System.out.print(element2 + ",");
                                } 
                                System.out.print("\n"); 
                            }
                            
                            if ((java==web)&&(java==cel)){
                                System.out.print("\n");
                                System.out.print("Los tres conjuntos tienen la misma cantidad de desarrolladores");
                                System.out.print("\n");
                            }
                            break;
                            
                        case 7:/*Se muestra el conjunto con mayor cantidad de desarrolladores en orden ascendente*/
                            int java2=0;
                            int web2=0;
                            int cel2=0;
                            Iterator Javaitr3 = DesarrolladoresJ.iterator();
                            Iterator Webitr3 = DesarrolladoresW.iterator();
                            Iterator Celitr3 = DesarrolladoresC.iterator();
                            
                            
                            while(Javaitr.hasNext()) {
                                Object element = Javaitr.next();
                                java2=java2+1;
                            }
                            while(Webitr.hasNext()) {
                                Object element = Webitr.next();
                                web2=web2+1;
                            } 
                            while(Celitr.hasNext()) {
                                Object element = Celitr.next();
                                cel2=cel2+1;
                            } 
                            
                            if (((java2>=web2) && (java2>cel2)) || ((java2>web2) && (java2>=cel2))){
                                System.out.print("\n");
                                System.out.print("El conjuto Java contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                tree.addAll(DesarrolladoresJ);
                                Iterator Ordenado = tree.iterator();
                                while(Ordenado.hasNext()) {
                                    Object element3 = Ordenado.next();
                                    System.out.print(element3 + "\n");
                                } 
                                System.out.print("\n"); 
                            }
                            
                            if (((web2>=java2) && (web2>cel2)) || ((web2>java2) && (web2>=cel2))){
                                System.out.print("\n");
                                System.out.print("El conjuto Web contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                tree.addAll(DesarrolladoresW);
                                Iterator Ordenado = tree.iterator();
                                while(Ordenado.hasNext()) {
                                    Object element3 = Ordenado.next();
                                    System.out.print(element3 + "\n");
                                }
                                System.out.print("\n"); 
                            }
                            
                            if (((cel2>=java2) && (cel2>web2)) || ((cel2>java2) && (cel2>=web2))){
                                System.out.print("\n");
                                System.out.print("El conjuto Celular contiene el mayor número de desarrolladores, los cuales son :");
                                System.out.print("\n");
                                tree.addAll(DesarrolladoresC);
                                Iterator Ordenado = tree.iterator();
                                while(Ordenado.hasNext()) {
                                    Object element3 = Ordenado.next();
                                    System.out.print(element3 + "\n");
                                } 
                                System.out.print("\n"); 
                            }
                            
                            if ((java2==web2)&&(java2==cel2)){
                                System.out.print("\n");
                                System.out.print("Los tres conjuntos tienen la misma cantidad de desarrolladores");
                                System.out.print("\n");
                            }
                            break;
                    }
                    
                    break;
            }
        }
    }
    
        
    /**
     * Método menu, utilizado para mostrar el menu principal al usuario.
     * @return devuelve la opción seleccionada por el usuario.
     */
    public static int menu() {
        
        
        Scanner sc = new Scanner(System.in);
        int respuesta;
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
    
    /**
     * Método SeleccionSet, utilizado para mostrar el menu con opciones Set a elegir.
     * @return devuelve la opción seleccionada por el usuario.
     */
    public static int SeleccionSet() {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println("");
        System.out.println("Seleccione el tipo de SET que utilizará ");
        System.out.println("1.HashSet ");
        System.out.println("2.TreeSet ");
        System.out.println("3.LinkedHashSet ");
        respuesta = sc.nextInt();
        return respuesta;
    }
    
    
    /**
     * Método Operaciones, utilizado para mostrar el menu con opciones de respuestas al usuario.
     * @return devuelve la opción elegida por el usuario.
     */
    public static int Operaciones() {
        Scanner sc = new Scanner(System.in);
        int entrada;
        
        System.out.println("");
        System.out.println("Seleccione el resultado que desea: ");
        System.out.println("1. Desarrolladores con experiencia Java, Web y Celular");
        System.out.println("2. Desarrolladores con experiencia Java");
        System.out.println("3. Desarrolladores con experiencia Celular y Web ");
        System.out.println("4. Desarrolladores con experiencia Celular o Web ");
        System.out.println("5. ¿El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web? ");
        System.out.println("6. Grupo con mayor cantidad de desarrolladores ");
        System.out.println("7. Lista integrantes del grupo con mayor cantidad de desarrolladores ");
        entrada = sc.nextInt();
        
        return entrada;
    }
    
}
