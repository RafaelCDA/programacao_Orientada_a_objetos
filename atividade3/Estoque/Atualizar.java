package atividade3.Estoque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Atualizar { 
    
public static void main(String [] args){
    Scanner sn= new Scanner(System.in);
    String op;
    inventario inventario = new inventario();
    while(true){
   System.out.println("deseja cadastrar,remover,listar,editar quantia de itens ou deseja encerrar?");
op=sn.nextLine();
 if(op.contains("cadastrar")){
 System.out.println("Digite o nome do item");
String nitem = sn.nextLine();
System.out.println("Digite a quantidade de itens");
int iqtd=sn.nextInt();
 inventario.add(nitem,iqtd);
 }else{
   if(op.contains("remover")){
      System.out.println("Qual item deseja remover?");
      String remitem=sn.nextLine();
      inventario.rem(remitem);
   }else{
      if(op.contains("listar")){
            System.out.println("Quantidade de itens no inventário:");
            inventario.listar();
      }else{
         if(op.contains("editar")){
            System.out.println("Digite o nome do item:");
            String iat= sn.nextLine();
            System.out.println("Digite a nova quantidade de itens");
            int noqtd =sn.nextInt();
            inventario.atualizar(iat, noqtd);
         }else{
            if(op.contains("encerrar")){
               System.out.println("Encerrando");
               sn.close();
               System.exit(0);
            }
         }
      }
   }
 }

    }

   


}



  




}