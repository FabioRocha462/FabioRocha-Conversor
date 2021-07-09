import java.util.Scanner;
import java.util.ArrayList;
class decimalhexa{
   public static void main(String[] Args){
    Scanner input=new Scanner(System.in);
    ArrayList<String>Hexa1=new ArrayList<String>();
    ArrayList<String>Hexa2=new ArrayList<String>();
    //Declaração de Variáveis
    String numero;
    int Verifica=0;
    int tamanho;

    System.out.println("Digite o valor em Decimal");
    //lendo o valor em decimal
    numero=input.next();
    
    //verificando se o numero é fracionado
    tamanho=numero.length();
    String vet[]=numero.split("");

    for(int i=0;i<tamanho;i++){
      if(vet[i].equals(",")){
        Verifica=1;
      }
    }
    //Trabalhando com o numero caso seja Fracionado
    if(Verifica==1){
         //Separando o valor inteiro do não inteiro.
      String vetor[]=numero.split(",");
      //parte1 fica com o valor inteiro
      int parte1=Integer.parseInt(vetor[0]);
      //parte2 fica com o valor fracionado
      int parte2=Integer.parseInt(vetor[1]);
      //passando o tamanho da parte dois para poder usar sua potência quando necessário.
      int Tamanho2=vetor[1].length();
     // System.out.println(Tamanho2);
      //transformando em hexadecimal a parte inteira
      for(int i=0;i<1000000;i++){
        //pegando o resultado da divisão por 16
        int resultado=parte1/16;
        //pegando o resto da divisão entre parte1 e 16
        int resto=parte1%16;
        //atualizando o valor de parte1
        parte1=resultado;
        //guardando o valor do resto dentro do ArrayList
       
        if(resto==0){
           Hexa1.add("0");
        }
        if(resto==1){
          Hexa1.add("1");
        }
        if(resto==2){
          Hexa1.add("2");
        }
        if(resto==3){
          Hexa1.add("3");
        }
        if(resto==4){
          Hexa1.add("4");
        }
        if(resto==5){
          Hexa1.add("5");
        }
        if(resto==6){
          Hexa1.add("6");
        }
        if(resto==7){
          Hexa1.add("7");
        }
        if(resto==8){
          Hexa1.add("8");
        }
        if(resto==9){
          Hexa1.add("9");
        }
        if(resto==10){
          Hexa1.add("A");
        }
        if(resto==11){
          Hexa1.add("B");
        }
        if(resto==12){
          Hexa1.add("C");
        }
        if(resto==13){
          Hexa1.add("D");
        }
        if(resto==14){
          Hexa1.add("E");
        }
        if(resto==15){
          Hexa1.add("F");
        }
        if(parte1<16){
          if(parte1==0){
           Hexa1.add("0");
        }
        if(parte1==1){
          Hexa1.add("1");
        }
        if(parte1==2){
          Hexa1.add("2");
        }
        if(parte1==3){
          Hexa1.add("3");
        }
        if(parte1==4){
          Hexa1.add("4");
        }
        if(parte1==5){
          Hexa1.add("5");
        }
        if(parte1==6){
          Hexa1.add("6");
        }
        if(parte1==7){
          Hexa1.add("7");
        }
        if(parte1==8){
          Hexa1.add("8");
        }
        if(parte1==9){
          Hexa1.add("9");
        }
        if(parte1==10){
          Hexa1.add("A");
        }
        if(parte1==11){
          Hexa1.add("B");
        }
        if(parte1==12){
          Hexa1.add("C");
        }
        if(parte1==13){
          Hexa1.add("D");
        }
        if(parte1==14){
          Hexa1.add("E");
        }
        if(parte1==15){
          Hexa1.add("F");
        }
          break;
        }
      }
      //Transformando em Octal a parte fracionoada
      double pot=Math.pow(10,Tamanho2);
      int apoio=Tamanho2;
      double valor=parte2/pot;
      //System.out.println(valor);
      double result;
       for(int i=0;i<=apoio;i++){
        result=valor*16;
        System.out.println(result);
        
     

        
       double valorsig= Math.floor(result);
      
       
           if(valorsig==0){
           Hexa2.add("0");
        }
        if(valorsig==1){
          Hexa2.add("1");
        }
        if(valorsig==2){
          Hexa2.add("2");
        }
        if(valorsig==3){
          Hexa2.add("3");
        }
        if(valorsig==4){
          Hexa2.add("4");
        }
        if(valorsig==5){
          Hexa2.add("5");
        }
        if(valorsig==6){
          Hexa2.add("6");
        }
        if(valorsig==7){
          Hexa2.add("7");
        }
        if(valorsig==8){
          Hexa2.add("8");
        }
        if(valorsig==9){
          Hexa2.add("9");
        }
        if(valorsig==10){
          Hexa2.add("A");
        }
        if(valorsig==11){
          Hexa2.add("B");
        }
        if(valorsig==12){
          Hexa2.add("C");
        }
        if(valorsig==13){
          Hexa2.add("D");
        }
        if(valorsig==14){
          Hexa2.add("E");
        }
        if(valorsig==15){
          Hexa2.add("F");
        }
      
       result=result-valorsig;
       
       
       valor=result;
      
      }
      int a=0;
      for(String i: Hexa1){
        a++;
      }
      for(int i=a-1;i>=0;i--){
        System.out.print(Hexa1.get(i));
      }
      System.out.print(",");
      for(String i: Hexa2){
        System.out.print(i);
      }
    }else{
     int numeral=Integer.parseInt(numero);

       for(int i=0;i<1000000;i++){
        //pegando o resultado da divisão por 8
        int resultado=numeral/16;
        //pegando o resto da divisão entre parte1 e 8
        int resto=numeral%16;
        //atualizando o valor de parte1
        numeral=resultado;
        //guardando o valor do resto dentro do ArrayList
       
        if(resto==0){
           Hexa1.add("0");
        }
        if(resto==1){
          Hexa1.add("1");
        }
        if(resto==2){
          Hexa1.add("2");
        }
        if(resto==3){
          Hexa1.add("3");
        }
        if(resto==4){
          Hexa1.add("4");
        }
        if(resto==5){
          Hexa1.add("5");
        }
        if(resto==6){
          Hexa1.add("6");
        }
        if(resto==7){
          Hexa1.add("7");
        }
        if(resto==8){
          Hexa1.add("8");
        }
        if(resto==9){
          Hexa1.add("9");
        }
        if(resto==10){
          Hexa1.add("A");
        }
        if(resto==11){
          Hexa1.add("B");
        }
        if(resto==12){
          Hexa1.add("C");
        }
        if(resto==13){
          Hexa1.add("D");
        }
        if(resto==14){
          Hexa1.add("E");
        }
        if(resto==15){
          Hexa1.add("F");
        }
        if(numeral<16){
          if(numeral==0){
           Hexa1.add("0");
        }
        if(numeral==1){
          Hexa1.add("1");
        }
        if(numeral==2){
          Hexa1.add("2");
        }
        if(numeral==3){
          Hexa1.add("3");
        }
        if(numeral==4){
          Hexa1.add("4");
        }
        if(numeral==5){
          Hexa1.add("5");
        }
        if(numeral==6){
          Hexa1.add("6");
        }
        if(numeral==7){
          Hexa1.add("7");
        }
        if(numeral==8){
          Hexa1.add("8");
        }
        if(numeral==9){
          Hexa1.add("9");
        }
        if(numeral==10){
          Hexa1.add("A");
        }
        if(numeral==11){
          Hexa1.add("B");
        }
        if(numeral==12){
          Hexa1.add("C");
        }
        if(numeral==13){
          Hexa1.add("D");
        }
        if(numeral==14){
          Hexa1.add("E");
        }
        if(numeral==15){
          Hexa1.add("F");
        }
          break;
        }
      }
      int b=0;
      for(String i:Hexa1){
        b++;
      }
      for(int i=b-1;i>=0;i--){
        System.out.print(Hexa1.get(i));
      }
    }
   }
}