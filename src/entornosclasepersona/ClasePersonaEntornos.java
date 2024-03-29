/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornosclasepersona;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author david
 */
public class ClasePersonaEntornos {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public ClasePersonaEntornos (String apellidos) {
        if ("".equals(nombre) || "".equals(apellidos)) {
            throw new IllegalArgumentException();
        } else {
            this.nombre = nombre;
            this.apellidos = apellidos;
            
        }

       System.out.println("Esto es el comentario del commit #5");
       System.out.println("Probando github desktop");
       System.out.println("Probando branh en GITHUB Desktop");

       System.out.println("Probando 1");
    }

    public ClasePersonaEntornos ( String apellidos, String fecha) throws IllegalArgumentException {
        if ("".equals(nombre) || "".equals(apellidos)) {
            throw new IllegalArgumentException();
        } else {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = generarFecha(fecha);
        }
     
     System.out.println("Esto el comentario del commit #4");
     
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void setNombre() {

        this.nombre = nombre;

    }

    public void setApellidos() {

        this.apellidos = apellidos;

    }

    public String getFechaNacimiento() {
        return getFechaNacimiento('-');
    }

    public void setFechaNacimiento(String fechaNacimiento) throws IllegalArgumentException {
        this.fechaNacimiento = generarFecha(fechaNacimiento);

    }

    public String getFechaNacimiento(char separador) {
        String fecha = null;
        if (separador != '-' && separador != '/') {
            throw new IllegalArgumentException();
        } else {
            if (this.fechaNacimiento != null) {
            fecha = fechaNacimiento.getDayOfMonth() + Character.toString(separador) + fechaNacimiento.getMonthValue() + Character.toString(separador) + fechaNacimiento.getYear();
            }
        }
        return fecha;
    }

    private LocalDate generarFecha(String fecha) {
        LocalDate resultado;
        int dia, mes, anyo;

        String regex = "([0][1-9]|[12][0-9]|3[01])(\\/|-)([0][1-9]|[1][0-2])\\2(\\d{4})";
        if (!fecha.matches(regex)) {
            throw new IllegalArgumentException();
        } else {

            try {
                dia = Integer.parseInt(fecha.substring(0, 2));
                mes = Integer.parseInt(fecha.substring(3, 5));
                anyo = Integer.parseInt(fecha.substring(6, 10));
                resultado = LocalDate.of(anyo, mes, dia);
            } catch (NumberFormatException | DateTimeException ex) {
                throw new IllegalArgumentException();
            }
        }

        return resultado;
    }
}
