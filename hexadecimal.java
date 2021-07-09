import java.util.Scanner;
class hexadecimal{
  public static void main(String[]Args){
    Scanner input=new Scanner(System.in);

    String numero;
    int tamanho,verifica=0,e=1;
    double potencia,potencia1,controle=0,controle1=0,controle2=0;
    double a=0;

    System.out.println("Digite o numero em Hexadecimal");
    numero=input.next();

    tamanho=numero.length();

    String vet[]=numero.split("");

    for(int i=0;i<tamanho;i++){
      if(vet[i].equals(",")){
        verifica=1;
      }
    }

    if(verifica==1){

      String vetor[]=numero.split(",");

      String parte1=vetor[0];
      int tamanho1=parte1.length();

      String parte2=vetor[1];
      int tamanho2=parte2.length();

      String subvetor1[]=parte1.split("");
      String subvetor2[]=parte2.split("");
     
      potencia1=tamanho1-1;
      
      
      for(int i=0;i<tamanho1;i++){
        if((subvetor1[i].equals("A"))||(subvetor1[i].equals("B"))||(subvetor1[i].equals("C"))||(subvetor1[i].equals("D"))||(subvetor1[i].equals("E"))||(subvetor1[i].equals("F"))){
         if(subvetor1[i].equals("A")){
             a=10;
         }
         if(subvetor1[i].equals("B")){
           a=11;
         }
         if(subvetor1[i].equals("C")){
           a=12;
         }
         if(subvetor1[i].equals("D")){
           a=13;
         }
         if(subvetor1[i].equals("E")){
           a=14;
         }
         if(subvetor1[i].equals("F")){
           a=15;
         }
        }else{
          a=Integer.parseInt(subvetor1[i]);
        }

        double aux=Math.pow(16,potencia1);
        potencia1--;

        controle1=controle1+(a*aux);
 

      }

      for(int i=0;i<tamanho2;i++){
           if((subvetor2[i].equals("A"))||(subvetor2[i].equals("B"))||(subvetor2[i].equals("C"))||(subvetor2[i].equals("D"))||(subvetor2[i].equals("E"))||(subvetor2[i].equals("F"))){
         if(subvetor2[i].equals("A")){
             a=10;
         }
         if(subvetor2[i].equals("B")){
           a=11;
         }
         if(subvetor2[i].equals("C")){
           a=12;
         }
         if(subvetor2[i].equals("D")){
           a=13;
         }
         if(subvetor2[i].equals("E")){
           a=14;
         }
         if(subvetor2[i].equals("F")){
           a=15;
         }
        }else{
          a=Integer.parseInt(subvetor2[i]);
        }
        double aux=Math.pow(16,-1*e);
        e++;

        controle2=controle2+(aux*a);
       
       
      }

     System.out.println(controle1+controle2);
    }else{
      potencia=tamanho-1;
      for(int i=0;i<tamanho;i++){
        if((vet[i].equals("A"))||(vet[i].equals("B"))||(vet[i].equals("C"))||(vet[i].equals("D"))||(vet[i].equals("E"))||(vet[i].equals("F"))){
         if(vet[i].equals("A")){
             a=10;
         }
         if(vet[i].equals("B")){
           a=11;
         }
         if(vet[i].equals("C")){
           a=12;
         }
         if(vet[i].equals("D")){
           a=13;
         }
         if(vet[i].equals("E")){
           a=14;
         }
         if(vet[i].equals("F")){
           a=15;
         }
        }else{
          a=Integer.parseInt(vet[i]);
        }
        double aux=Math.pow(16,potencia);
        potencia--;
        controle=controle+(aux*a);
      }
      System.out.println(controle);
    }
  }
}