/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Regina Vazquez 173803
 * 
 */
public class Recursion {

    public static int sumaElementosArreglo(Integer[] arreglo, int total){
        return sumaElementosArreglo(arreglo, total, 0);
    }
    
    private static int sumaElementosArreglo(Integer[] arreglo, int total, int indice){
        if(indice == total)
            return 0;
        return arreglo[indice] + sumaElementosArreglo(arreglo, total, indice + 1);
    }
    
    public static String imprimeComponentesIzquierda(Integer[] arreglo, int total){
        return imprimeComponentesIzquierda(arreglo, total, 0);
    }
    
    private static String imprimeComponentesIzquierda(Integer[] arreglo, int total, int indice){
        if(total == indice)
            return "";
        return Integer.toString(arreglo[indice]) + " " + imprimeComponentesIzquierda(arreglo, total, indice + 1);
    }
    
    public static String imprimeComponentesDerecha(Integer[] arreglo, int total){
        return imprimeComponentesDerecha(arreglo, total, total - 1);
    }
    
    private static String imprimeComponentesDerecha(Integer[] arreglo, int total, int indice){
        if(indice == -1)
            return "";
        return Integer.toString(arreglo[indice]) + " " + imprimeComponentesDerecha(arreglo, total, indice - 1);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(sumaElementosArreglo(arreglo, 10));
        System.out.println(imprimeComponentesIzquierda(arreglo, 10));
        System.out.println(imprimeComponentesDerecha(arreglo, 10));
        
        System.out.println(sumaElementosArreglo(arreglo, 0));
        System.out.println(imprimeComponentesIzquierda(arreglo, 0));
        System.out.println(imprimeComponentesDerecha(arreglo, 0));
    }
    
}
