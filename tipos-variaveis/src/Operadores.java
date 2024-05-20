public class Operadores {
   
    public static void main (String[] args){
	
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1";
//31
System.out.println(concatenacao);

concatenacao = 1+"1"+1+1;
//1111
System.out.println(concatenacao);

concatenacao = 1+"1"+1+"1";
//1111
System.out.println(concatenacao);

concatenacao = "1"+1+1+1;
//1111
System.out.println(concatenacao);

concatenacao = "1"+(1+1+1);
//13
System.out.println(concatenacao);

    }

}