package stack;
// falta poner tiempo, uml, cambiar nombre de .txt

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {

    
    public static void main(String[] args) {
    long tiempoInicio = System.currentTimeMillis(); 
    int numero = 0;
    Stack<String> calculadora = new StackVector<String>();
    
    try {	
	FileReader fr = new FileReader("Datos.txt");
	BufferedReader bf = new BufferedReader(fr);
	String cadena;
        char caracter;
        String operando;
        int resultado=0;
        
        cadena = bf.readLine();
        while (cadena !=null){
            for(int i=0;i<=cadena.length()-1;i++){
                caracter = cadena.charAt(i);
                operando= caracter+"";
                if (caracter != ' '){
                    if(calculadora.size()== 2){
                        if(operando.equals("+")){
                            resultado = (Integer.parseInt(calculadora.pop()))+(Integer.parseInt(calculadora.pop()));
                        }
                        if(operando.equals("-")){
                            numero = Integer.parseInt(calculadora.pop());
                            resultado = (Integer.parseInt(calculadora.pop()))-(numero);                   
                        }
                        if(operando.equals("*")){
                            resultado = (Integer.parseInt(calculadora.pop()))*(Integer.parseInt(calculadora.pop()));
                        }
                        if(operando.equals("/")){
                            numero = Integer.parseInt(calculadora.pop());
                            resultado = (Integer.parseInt(calculadora.pop()))/(numero);
                        }
                        calculadora.push(Integer.toString(resultado));
                    }else{
                        calculadora.push(operando);
                    }
                }
            }
            System.out.println("El resultado es: " + resultado);
            cadena = bf.readLine();
        }
    } catch (FileNotFoundException fnfe){
	fnfe.printStackTrace();
    } catch (IOException ioe){
	ioe.printStackTrace();
    }
    
    long totalTiempo = System.currentTimeMillis() - tiempoInicio;
    System.out.println("El tiempo total de la ejecución es :" + totalTiempo + " miliseg"); 
    }
    //profiling : http://omniumpotentior.wordpress.com/2009/08/23/profiling-de-java-en-netbeans/
}
