package atividade2.Exercicio1;
import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[ ]args){
    Scanner numero= new Scanner(System.in);
    float n,n1;
    int op;

    System.out.println("Digite o primeiro número");
    n = numero.nextInt();
    System.out.println("Digite o segundo número");
    n1 = numero.nextInt();
    System.out.println("Digite a operação: 1 para soma 2 para subtração 3 para multiplicação e 4 para divisão");
    op = numero.nextInt();
    if(op==1){
        soma(n, n1);
        System.out.println(soma(n, n1));
    }else{
        if(op==2){
        sub(n, n1);
        System.out.println(sub(n, n1));
    }else{
        if(op==3){
        mult(n, n1);
        System.out.println(mult(n, n1));
    }else{
        if(op==4){
        div(n, n1);
        System.out.println(div(n, n1));
    }
    }
    }
    }
    }
private static float soma(float n,float n1){
float resultado;
   resultado= n+n1;
   return resultado;
}

private static float sub(float n,float n1){
float resultado;
   resultado= n-n1;
   return resultado;
}

private static float mult(float n,float n1){
float resultado;
   resultado= n*n1;
   return resultado;
}
private static float div(float n,float n1){
float resultado;
   resultado= n/n1;
   return resultado;
}
}
