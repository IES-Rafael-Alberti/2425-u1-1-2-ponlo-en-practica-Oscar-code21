import java.util.Scanner;

public class saludo {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombre = «»;

        System.out.print(«Ingresa tu nombre: «);

        nombre = input.nextLine();

        System.out.print(«Hola «+nombre+» Este programa esta hecho en: java»);

        input.close();

    }

}

