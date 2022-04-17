package es.iespto.wenhui;
import java.util.Scanner;

public class App {

    static String titulo;
    static boolean validarTitulo;
    static String texto;
    static boolean validarTexto;
    static boolean logo;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
            int opcion;
            boolean salgo = false;
        System.out.println("------------------------------");
        System.out.println("quieres generar un documento");
        System.out.println("------------------------------");
        System.out.println("1) si");
        System.out.println("2) no");
        System.out.println("------------------------------");
        int sino= sc.nextInt();
        switch (sino) {
            case 1:
            while (!salgo) {
                System.out.println("----------------------------");
                System.out.println("1) poner titulo");
                System.out.println("2) escribir texto");
                System.out.println("3) poner logo de java");
                System.out.println("4) Salir");
                System.out.println("----------------------------");
                System.out.println("Escribe una de las opciones");
                System.out.println("----------------------------");
                opcion = sc.nextInt();sc.nextLine();
     
                switch (opcion) {
                    case 1:
                    System.out.println("-------------------");
                    System.out.println("Escriba el título");
                    System.out.println("-------------------");
                    titulo = sc.nextLine();
                    validarTitulo = true;
                        break;
    
                    case 2:
                        System.out.println("-----------------------------------");
                        System.out.println("escriba el texto que quieres poner");
                        System.out.println("-----------------------------------");
                        texto = sc.nextLine();
                        validarTexto = true;
                        break;
    
                    case 3:
                        logo = true;
                        break;
    
                    case 4:
                        salgo = true;
                        break;
                        
                    default:
                        System.out.println("-------------------------");
                        System.out.println("Solo números entre 1 y 4");
                        System.out.println("-------------------------");
                }
            }
            GenerarDocumento.generarDocumento();
                break;

            case 2:
                System.out.println("------------");
                System.out.println("hasta luego");
                System.out.println("------------");
                break;
            default:
                    System.out.println("-------------------------");
                    System.out.println("Solo números entre 1 y 2");
                    System.out.println("-------------------------");
            }
        
       
 
    }
        //GenerarDocumento.generarDocumento();
    }
    

