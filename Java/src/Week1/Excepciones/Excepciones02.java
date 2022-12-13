package Week1.Excepciones;

import java.util.*;

class Excepciones02{
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();
    public static void main(String[] args) {
        int random;
        int numero;
        do{
            random = rn.nextInt(11);
            numero = 1;
            System.out.print("Ingresa tu un número del 0 al 10: ");
            try{
                numero = sc.nextInt();
                if(numero < 0 || numero >10){
                System.out.println("No seas tramposo");
                 }
            }catch(Exception e){
                System.out.println("No ingresaste un número entero");
                break;
            }
                if(numero == random){
                    System.out.println("Felicidades, acertaste");
                    System.out.printf("El numero generado fue %d\n", random);
                }else{
                    System.out.printf("Ingresaste %d y el número generado fue %d\n", numero, random);
                    System.out.println("De nuevo");
                }
            
        }while(numero != random);   
    }
}