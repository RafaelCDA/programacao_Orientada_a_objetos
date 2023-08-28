import java.util.Scanner;
public class verificaNumeroPrimo{


public static void main(String[ ]args){
Scanner numero = new Scanner(System.in);
int n;
 System.out.println("Digite o Numero");
n = numero.nextInt();
verificaNumeroPrimo(n);
if(verificaNumeroPrimo(n)==false){
System.out.println(0);
}else{
    System.out.println(1);
}

}

private static boolean verificaNumeroPrimo(int n ){

for(int j = 2; j < n; j++){
    if(n%j==0) 
    return false;
}
return true; 

   
}
}