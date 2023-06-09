import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    static Stack<Persona> PilaPersonas = new Stack<Persona>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nEscoge un número del menú");
            System.out.println("1. Método Push para agregar personas a la pila.");
            System.out.println("2. Método Pop para eliminar la persona del tope de la pila.");
            System.out.println("3. Método Peek para mostrar a la persona del tope de la pila.");
            System.out.println("4. Método Empty para ver si la pila está vacía osea sin personas.");
            System.out.println("5. Salir.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("***PUSH***");
                    CreatePushPersonsStack();
                    break;
                case 2:
                    System.out.println("***POP***");
                    PopPersonsStack();
                    break;
                case 3:
                    System.out.println("***PEEK***");
                    PeekPersonsStack();
                    break;
                case 4:
                    System.out.println("***EMPTY***");
                    EmptyPersonsStack();
                    break;
                case 5:
                    System.out.println("***SALIENDO***");
                    break;
            }
        }
    }

    private static void CreatePushPersonsStack() {
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
            PilaPersonas.push(persona);
            System.out.println("Se agregó a la pila*");
            System.out.println("Escriba si/no para seguir generando personas-");
            respuesta = scan.next();
        }
    }

    private static void PopPersonsStack() {
        System.out.println("***Eliminando Persona del Tope de la Pila***");
        System.out.println("La persona del tope a ser eliminada es: " + PilaPersonas.peek());
        PilaPersonas.pop();
    }

    private static void PeekPersonsStack() {
        System.out.println("***Mostrando a la Persona del Tope de la Pila***");
        System.out.println(PilaPersonas.peek());
    }

    private static void EmptyPersonsStack() {
        System.out.println(PilaPersonas);
        if (PilaPersonas.empty() == true) {
            System.out.println("La Pila no tiene ninguna persona.");
        } else {
            System.out.println("Si hay personas en la Pila");
        }
    }
}