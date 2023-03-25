import java.util.Collections;
import java.util.LinkedList;


public class Lista_Contactos{
    public static void main(String[] args) {
        LinkedList<Persona> contactos = new LinkedList<>();
        Persona p1 = new Persona("Emilio","Molina","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p2 = new Persona("Cristian","Molina","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p3 = new Persona("Oscar","ALMENDAREZ","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        Persona p4 = new Persona("Angie","NUNEZ","8744-5450","Barrio Buenos Aires","Emiliomolina266@gmail.com");
        contactos.add(p1);
        contactos.add(p2);
        contactos.add(p3);
        contactos.add(p4);



        System.out.println(contactos.toString());
        Ordenar(contactos);
        System.out.println(contactos.toString());

    }

   public static void Ordenar(LinkedList<Persona> lista){
       Collections.sort(lista);

   }


}
