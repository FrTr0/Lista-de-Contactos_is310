public class Persona implements Comparable<Persona>{
    public String nombre;
    public String apellido;
    public String telefono;
    public String direccion;
    public String correo;

    public Persona(String nombre, String apellido, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n\n";
    }

    @Override
    public int compareTo(Persona o) {
        if (this.nombre != o.getNombre()) {
            return this.nombre.compareTo(o.getNombre());
        }
        else{
            return this.apellido.compareTo(o.getApellido());
        } 
    }
}
