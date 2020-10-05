package promcsv;                                                                 //Paquete principa

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Promcsv {                                                           //Clase publica que alberga metodos 

	public static final String delimiter = ",";                              //Creacion de una constante de una clase.
	   
	   public static void read(String csvFile) {                             //Metodo main, aquel que ejecuta el codigo del programa.
	      try {                                                              //Se usa cuando se desea tener excepciones en el transcurso de la ejecucion.
	         File file = new File(csvFile);                                  //Nuevo archivo tipo csv.
	         FileReader fr = new FileReader(file);                            //Permite leer archivos, en este caso csv.
	         BufferedReader br = new BufferedReader(fr);                      //Lee un texto secuencial almacenandolo en el bufer.
	         String line = "";                                               //Declaracion de variables tipo texto.
	         String[] tempArr;                                                //Declaracion de variables tipo texto.
	         float promT = 0;                                                   //Declaracion de una variable tipo numerica con decimales.
	         int cont = 1;                                                 //Declaracion de una variable tipo entero.
	         while((line = br.readLine()) != null) {                           //Ciclo repetitivo hasta que acabe la operacion
	        	 
	        	 float num = 0;                                           //Declaracion de una variable tipo numerica con decimales.
	        	 tempArr = line.split(delimiter);                          //Operaciones
	        	 for(int i = 2; i<=5;i++) {                                //Estrutura de control de un  programa
	                num += Float.parseFloat(tempArr[i]);                         //Operacion del programa
	            }
	        	 
	          float promedio = num /4;                                        //Operaciones del programa
	          System.out.println("Promedio estudiante "+cont+": "+promedio);   //Imprimir el resultado
	          promT += promedio;                                               //Operaciones del programa
	          cont ++;                                                         //Devuelve un valor
	         }
	         float promeTotal = promT / 19;                                    //Operaciones del programa
	         System.out.println("Promedio total del salón es: "+promeTotal);     //Imprimir el resultado
	         br.close();                                                 //Ciere de operacion
	         
	         } catch(IOException ioe) {   //Señala instrucciones a intentar dentro del try.
	            ioe.printStackTrace();    //Imprime
	         }

	   }
	   
	   public static void main(String[] args) {                                 //Metodo principal que leera el archivo csv.
	      String csvFile = "C:\\Users\\maria_000\\Desktop\\salpicon_java\\promcsv\\PromedioCSV.csv";   //Direccion de la ubicacion del archivo
	      Promcsv.read(csvFile);                                                   //Lectura del archivo csv
	      
	   }
	}

