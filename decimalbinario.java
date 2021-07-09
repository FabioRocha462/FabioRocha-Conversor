import java.util.Scanner;
import java.util.ArrayList;
class decimalbinario{
  public static void main(String[] Args){
    Scanner input=new Scanner(System.in);
    ArrayList<Integer>Binario=new ArrayList<Integer>();
    ArrayList<Integer>Binario2=new ArrayList<Integer>();
    //Declaração de Variáveis
    String numero;
    int Verifica=0,resto,resultado=10;
    int numeral;
    
    //Recebendo o valor em Decimal
    System.out.println("Digite o valor em Decimal");
    numero=input.next();
    
    
    //Verificando se o número é fracionado
    int tamanho=numero.length();
    String vet[]=numero.split("");

    for(int i=0;i<tamanho;i++){
      if(vet[i].equals(",")){
        Verifica=1;
      }
    }

    //Caso o numero seja fracionado

  if(Verifica==1){
System.out.println("Aqui deu certo");
    //Dividindo os valores antes e após a virgula
    String vetor[]=numero.split(",");
    int parte1=Integer.parseInt(vetor[0]);
    int parte2=Integer.parseInt(vetor[1]);

    //Transformando em binário o valor Antes da Vírgula
    resultado=parte1;

    int Tamanho1=vetor[0].length();
    int Tamanho2=vetor[1].length();

    for(int i=0;i<1000000;i++){
       resultado=parte1/2;
       resto=parte1 % 2;
       
       parte1=resultado;
       Binario.add(resto);
       if(parte1==1){
         Binario.add(parte1);
         break;
       }
      
    }
    //Transfromando em Binário o pós vírgula
       double valor=parte2;
       int apoio=Tamanho2;
    for(int i=0;i<apoio;i++){
       //valor entra
       double pot=Math.pow(10,Tamanho2);
       
       //valor é Transformando em seu valor real
       valor=valor/pot;
       // verifica e coloca no ArrayList
       if(valor*2>1){
         Binario2.add(1);
       }else{
         Binario2.add(0);
       }
       //o valor volta para o tamanho que entra
       valor=valor*pot;
       //o valor é preparado para passar para a próxima etapa
       
       pot=Math.pow(10,Tamanho2-1);
       double aux=valor/pot;
       String string1=String.valueOf(aux);
      //Pegamos o valor mais significativo do número formado anteriormente
      //Coloco o valor em um vetor de String
       String sub[]=string1.split("");
      //Depois pego  a posição 0 do vetor, posição que aloca o digito que desejamos
       int valorsig=Integer.parseInt(sub[0]);

       //Fazemos uma subtração para retirar o digito que ja utilizamos

       valor=aux-valorsig;


       pot=Math.pow(10,Tamanho2-1);
      //voltamos o valor para que o ciclo possa seguir e fazer as operações
      valor=valor*pot;
      //o valor que controla as potências vai diminuindo com o decorrer das passagens do for.
      Tamanho2--;




       

    }
    //mostrando o resultado na Tela
    int a=0;
    for(Integer i: Binario){
      a++;
    }
    
    for(int i=a-1;i>=0;i--){
      System.out.print(Binario.get(i));
    }
    System.out.print(",");
    for(Integer i:Binario2){
      System.out.print(i);
    }
    
//Agpra considerando que o valor não é Fracionário
  }else{
    numeral=Integer.parseInt(numero);
     for(int i=0;i<100000000;i++){
       resultado=numeral/2;
       resto=numeral%2;
       
       numeral=resultado;
       Binario.add(resto);
       if(numeral==1){
         Binario.add(numeral);
         break;
       }
     }
     int b=0;
     for(Integer i:Binario){
       b++;
     }
     for(int i=b-1;i>=0;i--){
       System.out.print(Binario.get(i));
     }
  }


  }
}