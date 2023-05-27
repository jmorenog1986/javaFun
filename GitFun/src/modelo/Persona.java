package modelo;

public class Persona {

    private int documento;
    private String nombre;
    private String apellido;
    private String email;
    

    public Persona() {
       
    }

    public Persona(int documento, String nombre, String apellido) {
        this(documento, nombre, apellido, "No tiene");
    }

    public Persona(int documento, String nombre, String apellido, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }

    
}
