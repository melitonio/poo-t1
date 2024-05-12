package clasesobjetos;

import java.util.Calendar;

public class Persona {
    private String nombre;
    private String apellidos;
    private String FechaNacimiento; // formato dd/mm/aaaa
    private char sexo;
    private double peso;

    
    public Persona(String nombre, String apellidos, String fechaNacimiento, char sexo, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.FechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int edad(int a) {
        return a - Integer.parseInt(FechaNacimiento.substring(6, 10));
    }

public void imprimir() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("### DATOS PERSONALES ###");
        System.out.println("\tNombre: " + nombre + " " + apellidos);
        System.out.println("\tEdad:   " + edad(year));
        System.out.println("\tSexo:   " + sexo);
        System.out.println("\tPeso:   " + peso);
        System.out.println("### ### ### ### ### ###");
        System.out.println();
    }

}
