public class Persona {
    private String name;
    private int age;
    private String gender;
    private double nota;

    public Persona(String name, int age, String gender, double nota) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nota = nota;
    }

    public String toString() {
        return "Nombre: " + name + "\nEdad: " + age + "\nGénero: " + gender + "\nNota: " + nota;
    }
}