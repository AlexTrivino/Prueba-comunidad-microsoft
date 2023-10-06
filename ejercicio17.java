
public class ejercicio17{
    
    public static void main (String[]args){
        int vector=0;
        int [] arreglo = {1,5,9,8};
        sumar56(arreglo);

        for (vector=0; vector<arreglo.length;vector++){
            System.out.println("Nuevo valor de la posicion: " + vector + "  --  " +arreglo[vector]);
        }
    }
    public static void sumar56 (int [] array){
        int vector=0;
        for (vector=0; vector<array.length; vector++){
            array[vector]=array[vector]+56;
        }
    }
}