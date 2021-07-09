import java.util.Scanner;
class octal{
  public static void main(String[]Args){
    Scanner input=new Scanner(System.in);

    String numero="";
    int tamanho,verifica=0,b=1,c;
    double contador1=0,contador2=0,contador=0;

    System.out.println("Digite o numero em Octal");
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

      String parte1=vet[0];

      int tamanho1=parte1.length();

      String parte2=vet[1];

      int tamanho2=parte2.length();

      String subvetor1[]=parte1.split("");
     
      String subvetor2[]=parte2.split("");
      c=tamanho1-1;

      for(int i=0;i<tamanho1;i++){
        int aux=Integer.parseInt(subvetor1[i]);

       double a=Math.pow(8, c);
       c--;

       contador1=contador1+(a*aux);
     
      }

      for(int i=0;i<tamanho2;i++){

        int aux=Integer.parseInt(subvetor2[i]);

        int aux2=-1;

        double a=Math.pow(8, b*aux2);

        contador2=contador2+(a*aux);

        b++;

      }

      System.out.println(contador1+contador2);
    }else{
      c=tamanho-1;
      for(int i=0;i<tamanho;i++){
         int aux=Integer.parseInt(vetor[i]);

       double a=Math.pow(8, c);
       c--;

       contador=contador+(a*aux);
      }
      System.out.println(contador);
    }

    
  }
}