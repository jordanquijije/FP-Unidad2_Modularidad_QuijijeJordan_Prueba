public class Ejercicio2 {
    static int pot(int b, int e) { if (e == 0) return 1; return b * pot(b, e - 1); }
public static void main(String[] args){
    System.out.println(pot(4, 6));

}
}/*Aqui la salida e que sale es 4096 con respecto "b" la base se le 
da un valor de 4 y "e" que es el exponente con un valor de 6 pero
esto es si e es diferente de 0 porque sino da 1*/
