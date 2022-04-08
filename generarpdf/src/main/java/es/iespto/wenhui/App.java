package es.iespto.wenhui;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
            int opcion;
            boolean salir = false;

        System.out.println("quieres generar un documento");
        System.out.println("1) si");
        System.out.println("2) no");
        int sino= sc.nextInt();
        switch (sino) {
            case 1:
            GenerarDocumento.generarDocumento();
            while (!salir) {
 
                System.out.println("1) poner titulo");
                System.out.println("2. Opcion 2");
                System.out.println("3. Opcion 3");
                System.out.println("4. Salir");
     
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
     
                switch (opcion) {
                    case 1:
                    GenerarDocumento.generarDocumento();
                        break;
    
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
    
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
    
                    case 4:
                        salir = true;
                        break;
                        
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            }
                break;

            case 2:
                System.out.println("hasta luego");
                break;
            default:
                    System.out.println("Solo números entre 1 y 2");
            }
       
 
    }
        //GenerarDocumento.generarDocumento();
    }
    

