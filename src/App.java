import java.util.Scanner;

public class App {
    public static void main(String args []) {
        // Requisito 1 Pedir o lado do quadadro
        Scanner sc = new Scanner(System.in);
        // pedir em metros
        System.out.print("Entre com a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();
        //Requisito 2 calcular a area do quadrado
        int area = lado * lado;

        //Requisito 3 Calcular e mostrar o dobro da area do quadrado
        int dobro = area * 2;
        
        System.out.println("O dobro da area do quadrado de lado " + lado + " é igual a " + dobro);
    
    }

}