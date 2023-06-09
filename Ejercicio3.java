import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio3 {
    static Queue<Persona> ColaPersonas = new LinkedList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nEscoge un número del menú");
            System.out.println("1. Método Offer para agregar personas a la Cola.");
            System.out.println("2. Método Poll para eliminar la persona a la cabeza de la Cola.");
            System.out.println("3. Método Peek para mostrar a la persona a la cabeza de la Cola.");
            System.out.println("4. Método isEmpty para ver si la Cola está vacía osea sin personas.");
            System.out.println("5. Salir.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("***OFFER***");
                    CreateOfferPersonsStack();
                    break;
                case 2:
                    System.out.println("***POLL***");
                    PollPersonsStack();
                    break;
                case 3:
                    System.out.println("***PEEK***");
                    PeekPersonsStack();
                    break;
                case 4:
                    System.out.println("***ISEMPTY***");
                    EmptyPersonsStack();
                    break;
                case 5:
                    System.out.println("***SALIENDO***");
                    break;
            }
        }
    }

    private static void CreateOfferPersonsStack() {
        String respuesta = "";
        String nombre, genero;
        int edad;
        double nota;
        System.out.println("***Crear objetos Persona***");
        System.out.println("Escriba si/no para seguir generando personas-");
        respuesta = scan.next();
        while (respuesta.equals("si")) {
            System.out.println("Ingrese el nombre / edad / género / nota , en ese orden.");
            nombre = scan.next();
            edad = scan.nextInt();
            genero = scan.next();
            nota = scan.nextDouble();
            Persona persona = new Persona(nombre, edad, genero, nota);
            ColaPersonas.offer(persona);
            System.out.println("Se agregó a la Cola*");
            System.out.println("Escriba si/no para seguir generando personas-");
            respuesta = scan.next();
        }
    }

    private static void PollPersonsStack() {
        System.out.println("***Eliminando Persona a la cabeza de la Cola***");
        System.out.println("La persona a la cabeza de la cola a ser eliminada es: " + ColaPersonas.peek());
        ColaPersonas.poll();
    }

    private static void PeekPersonsStack() {
        System.out.println("***Mostrando a la Persona a la cabeza de la Cola***");
        System.out.println(ColaPersonas.peek());
    }

    private static void EmptyPersonsStack() {
        System.out.println(ColaPersonas);
        if (ColaPersonas.isEmpty() == true) {
            System.out.println("La Cola no tiene ninguna persona.");
        } else {
            System.out.println("Si hay personas en la Cola");
        }
    }
}