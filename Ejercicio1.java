import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    static Stack<Integer> Cylinder1 = new Stack<Integer>();
    static Stack<Integer> Cylinder2 = new Stack<Integer>();
    static Stack<Integer> Cylinder3 = new Stack<Integer>();
    static int height1 = 0;
    static int height2 = 0;
    static int height3 = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, numCylinder;
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nEscoge un número del menú");
            System.out.println("1. Agregar elementos al cilindro.");
            System.out.println("2. Analizar las alturas de los cilindros para ver si son iguales");
            System.out.println("3. Eliminar elemento del cilindro.");
            System.out.println("4. Salir.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elige el número de pila de cilindro:");
                    numCylinder = scan.nextInt();
                    System.out.println("Elige el número de cilindro a poner");
                    number = scan.nextInt();
                    PushCylinder(numCylinder, number);
                    break;
                case 2:
                    System.out.println("***ANALIZANDO ALTURAS DE LAS PILAS***");
                    CylinderAnalythics();
                    break;
                case 3:
                    System.out.println("Elige el número de pila de cilindro para eliminar:");
                    numCylinder = scan.nextInt();
                    PopCylinder(numCylinder);
                    break;
                case 4:
                    System.out.println("Saliendo.");
                    break;
            }
        }

    }

    private static void PopCylinder(int numCylinder) {
        if (numCylinder == 1) {
            height1 = height1 - Cylinder1.peek();
            Cylinder1.pop();
        } else if (numCylinder == 2) {
            height2 = height2 - Cylinder2.peek();
            Cylinder2.pop();
        } else if (numCylinder == 3) {
            height3 = height3 - Cylinder3.peek();
            Cylinder3.pop();
        }
    }

    private static void CylinderAnalythics() {
        System.out.println(Cylinder1);
        System.out.println(Cylinder2);
        System.out.println(Cylinder3);
        if (height1 == height2 && height1 == height3) {
            System.out.println("Las alturas son iguales");
            System.out.println("Las 3 pilas ahora tienen altura: " + height1);
        } else {
            System.out.println("No son iguales");
        }
    }

    private static void PushCylinder(int numCylinder, int number) {
        if (numCylinder == 1) {
            Cylinder1.push(number);
            height1 = height1 + number;
            System.out.println(Cylinder1);
        } else if (numCylinder == 2) {
            Cylinder2.push(number);
            height2 = height2 + number;
            System.out.println(Cylinder2);
        } else if (numCylinder == 3) {
            Cylinder3.push(number);
            height3 = height3 + number;
            System.out.println(Cylinder3);
        }
    }
}