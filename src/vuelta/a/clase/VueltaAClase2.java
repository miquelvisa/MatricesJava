package vuelta.a.clase;

import java.util.*;

public class VueltaAClase2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int filas=sc.nextInt();
        System.out.print("Introduce el numero de col: ");
        int columnas=sc.nextInt();
        int[][] m=new int[filas][columnas];
        if(esCuadrada(m)){
            rellenarMR(m);
            mostrarMatriz(m);
            System.out.print("\n");
            if(comprobarM(m)){
                System.out.println("Tu matriz es simétrica.");
            }else{
                System.out.println("Tu matriz no es simétrica.");
            }
        }else{
            System.out.println("La matriz no es cuadrada.");
        }
    }
    
    public static boolean esCuadrada(int[][] m){
        return m.length==m[0].length;
    }
    public static void rellenarM(int[][] m){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m.length;i++){
            System.out.println("Rellena la fila "+(i+1)+":"); //Para que el usuario no se lie, la fila 0 se le muestra como 1.
            for(int j=0;j<m[i].length;j++){
                System.out.print("Dame un elemento: ");
                m[i][j]=sc.nextInt();
            }
            System.out.print("\n");
        }
    }
   public static boolean comprobarM(int[][] m){
       boolean comprobacion=true;
       for(int i=0;i<m.length && comprobacion;i++){
           for(int j=0;j<m[i].length && comprobacion;j++){
               if(m[i][j]!=m[j][i]){
                   comprobacion=false;
               }
           }
       }
       return comprobacion;
   }
       public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
      public static void rellenarMR(int[][] m){
          Random r= new Random(); //Para generar un numero aleatorio, siendo "r" el nombre.
          for(int i=0;i<m.length;i++){
              for(int j=0;j<m[i].length;j++){
                  m[i][j]=r.nextInt(9); //r.nextInt(numero_maximo) es una funcion para rellenar el espacio con numero aleatorios.
              }
          }
      }

}
