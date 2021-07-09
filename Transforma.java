import java.util.Scanner;
class Transforma{
  public static void main(String[]Args){
    Scanner input=new Scanner(System.in);
    String numero=" ",parte1,parte2;
    int tamanho,tamanho1,tamanho2,b=0,d=0,verifica=0;
    double a=0,c=0; 

    
    System.out.println("Digite o número em Binário");
    numero=input.next();
     
     tamanho=numero.length();

    String vetor[]=numero.split("");

    for(int i=0;i<tamanho;i++){
      if(vetor[i].equals(",")){
         verifica=1;
      }
    }
    if(verifica==1){
    

    String vet[]=numero.split(",");

    parte1=vet[0];
    tamanho1=parte1.length();
    parte2=vet[1];
    tamanho2=parte2.length();

    String subvetor1[]=parte1.split("");
    for(String n:subvetor1){
      System.out.print(n);
    }
    String subvetor2[]=parte2.split("");
    System.out.println();
    for(String n: subvetor2){
      System.out.print(n);
    }
    
    System.out.println();
    for(int i=tamanho1-1;i>=0;i--){
      if(subvetor1[i].equals("1")){
          a=a+Math.pow(2,b);
      }
      b++;
      
    }
    for(int i=0;i<tamanho2;i++){
      d++;
      if(subvetor2[i].equals("1")){
        int aux=-1;
        c=c+Math.pow(2,d*aux);
      }
      
    }
    

   System.out.println(a+c);

   
    }else{
      for(int i=tamanho-1;i>=0;i--){
        if(vetor[i].equals("1")){
         a=a+Math.pow(2,b); 
        }
        b++;
      }
      System.out.println(a);
    }
  }
}