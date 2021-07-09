import java.util.Scanner;
import java.util.ArrayList;
class decimaloctal{
  public static void main(String[] Args){
    Scanner input= new Scanner(System.in);
    ArrayList<Integer> Octal=new ArrayList<Integer>();
    ArrayList<Integer> Octal1=new ArrayList<Integer>();
    //Declaração de variáveis
    String numero;
    int tamanho,verifica=0;
    
    System.out.println("Digite o valor em Decimal");
    //lendo o valor em decimal
    numero=input.next();
    //verificando se o numero é fracionado
    tamanho=numero.length();

    String vetor[]=numero.split("");

    for(int i=0;i<tamanho;i++){
      if(vetor[i].equals(",")){
        verifica=1;
      }
    }

    //Trabalhando com o numero caso seja Fracionado

    if(verifica==1){
      //Separando o valor inteiro do não inteiro.
      String vet[]=numero.split(",");
      //parte1 fica com o valor inteiro
      int parte1=Integer.parseInt(vet[0]);
      //parte2 fica com o valor fracionado
      int parte2=Integer.parseInt(vet[1]);
      //passando o tamanho da parte dois para poder usar sua potência quando necessário.
      int Tamanho2=vet[1].length();
      //transformando em octal a parte octal
      for(int i=0;i<1000000;i++){
        //pegando o resultado da divisão por 8
        int resultado=parte1/8;
        //pegando o resto da divisão entre parte1 e 8
        int resto=parte1%8;
        //atualizando o valor de parte1
        parte1=resultado;
        //guardando o valor do resto dentro do ArrayList
        Octal.add(resto);
        if(parte1<8){
          Octal.add(parte1);
          break;
        }
      }
      //Transformando em Octal a parte fracionoada
      double pot=Math.pow(10,Tamanho2);
      int apoio=Tamanho2;
      double valor=parte2/pot;
      double result;
      for(int i=0;i<apoio;i++){
        result=valor*8;
        //System.out.println(result);
        String string1=String.valueOf(result);

        String vetorstring[]=string1.split("");
        
       int valorsig= Integer.parseInt(vetorstring[0]);
       Octal1.add(valorsig);
       System.out.println(valorsig);
      
       result=result-valorsig;
       
       valor=result;
      
      }
      //Mostrando o resultado
      int a=0;
      for(Integer i: Octal){
        a++;
      }
      for(int i=a-1;i>=0;i--){
        System.out.print(Octal.get(i));
      }
      System.out.print(",");
      for(Integer i: Octal1){
        System.out.print(i);
      }

    }else{
      int numeral=Integer.parseInt(numero);

      for(int i=0;i<10000000;i++){
        int resultado=numeral/8;
        //pegando o resto da divisão entre parte1 e 8
        int resto=numeral%8;
        //atualizando o valor de parte1
        numeral=resultado;
        //guardando o valor do resto dentro do ArrayList
        Octal.add(resto);
        if(numeral<8){
          Octal.add(numeral);
          break;
        }
      }
       int b=0;
       for(Integer i:Octal){
         b++;
       }
       for(int i=b-1;i>=0;i--){
         System.out.print(Octal.get(i));
       }
    }




  }
}
