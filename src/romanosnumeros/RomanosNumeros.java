
package romanosnumeros;

import java.util.Scanner;


public class RomanosNumeros {

    
    public static void main(String[] args) {
        int numero=0 ;
        Scanner entrada = new Scanner(System.in);
       
        String millares[]= {"","M","MM","MMM"};
        String centenas[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String decenas[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String unidad[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        do{
            System.out.println("Introduca un numero del 1 al 3999");
            
            numero = entrada.nextInt();
            
        }while(numero<1 || numero>=4000);
        
        System.out.println("El numero "+ numero +" en Romano es: "+millares[numero/1000]
                                                              +centenas[(numero/100)%10]
                                                              +decenas[(numero/10)%10]
                                                              +unidad [numero%10]);
        
        
        
    }

}
