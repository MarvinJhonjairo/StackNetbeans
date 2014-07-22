
// ore13048@uvg -----------------------------------------------------
package stack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {  
private String juan;     

    public static void main(String[] args) {
        //int x = 47;
        //String s = "Hola";
       
   	try {	
			FileReader fr = new FileReader("LeerArchivo.txt");
			BufferedReader bf = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				System.out.println("La cadena es: "+sCadena);
                                System.out.println("Tamaño de la cadena: " +   sCadena.length() + " caracteres"); //tamaño de cadena
                                for (int i=0; i<=sCadena.length()-1;i++){
                                //System.out.println(sCadena.charAt(2)); comienza desde 0
                                    System.out.println(sCadena.charAt(i));//toma dato por dato, de la cadena
                                    // aqui hay que agregar instrucciones 
                                    // si es numero: enviarlo al stack
                                    // si es simbolo:sumar restaar, dividir y sacar del stack dos numeros
                                    
                                }       
			} 
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}   
    }
}
// fuente http://lineadecodigo.com/java/leer-fichero-de-texto-con-java/