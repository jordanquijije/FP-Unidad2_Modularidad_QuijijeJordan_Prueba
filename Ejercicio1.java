public class Ejercicio1 {
static int f(int x) { return x * x; }
static int g(int x) { return f(x) + f(x + 1); }
public static void main(String[] a) {
int x = 2;
System.out.println(g(x) + " " + f(g(1)));
System.out.println(x);
}
}/*La respuestas que retorna de g(x) es 13 , la de f(g(1)) es 25 y 
por ultimo el valor establecido de x que es 2*/