public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre= "javier";
        
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Javier\") = " + nombre.equals("Javier"));
        System.out.println("nombre.equals(\"Javier\") = " + nombre.equals("javier"));
        System.out.println("nombre.equalsIgnoreCase(\"javier\") = " + nombre.equalsIgnoreCase("javier"));
        System.out.println("nombre.compareTo(\"Javier\") = " + nombre.compareTo("Javier"));
        System.out.println("nombre.compareTo(\"Lagos\") = " + nombre.compareTo("Lagos"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        // el primer valor es inclive y el limite superior es exclusivo
        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";

        // replace entrega una nueva instancia,
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));

        // entrega la primera incidencia , aunque hayan mas coincidencias
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        // entrega la ultima incidencia
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('a'));

        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalenguas.contains("lengua"));

        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));

        System.out.println("trabalenguas = " + trabalenguas.trim());


    }
}
