public class Persona implements Comparable<Persona>{
    public String nombre;
    public String apellido;
    public String telfono;
    public String dirreccion;
    public String correo;

    public Persona(String nombre, String apellido, String telfono, String dirreccion, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.dirreccion = dirreccion;
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

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre+
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
