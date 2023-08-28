package atividade2.exercicio2;
import java.util.Scanner;
public class Conversor {
    
    public static void main(String[ ]args){
    double c,f;
    Scanner texto= new Scanner(System.in);
    int n;
    System.out.println("Digite 1 Se deseja converter de Celsius para Fahrenheit ou 2 de Fahrenheit para Celsius  ");
    n = texto.nextInt();
    if(n==2){
     c = n;
     System.out.println("Digite o valor");
     c=texto.nextInt();    
        System.out.println(pc(c));
    }else{
        f=n;
        System.out.println("Digite o valor");
       f=texto.nextInt();
         System.out.println(pf(f));
    }
    }

private static double pc(double c){

    c= (c-32)/1.8;
return c;
}
private static double pf(double f){

    f= f*1.8+32;
return f;
}










}
