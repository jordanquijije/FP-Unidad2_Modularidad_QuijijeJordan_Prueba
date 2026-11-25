public class Ejercicio3 {
    static void m(int a, int[] v) {
         a++; 
         v[1] += a; 
        }
public static void main(String[]args){ 
    int a = 5;
     int[] v = {1, 2, 3}; 
     m(a, v); 
     System.out.println(a + " " + v[1]);
}
}/*Aqui se muestra el valor de "a" que es 5 y
 se le establece un arreglo a "v" el cual con la opercion que tiene en el metodo
 da 8 pero esto cambia segun l posicion de v[] que escojamos*/
