package pooclasesabstractas.form;

import pooclasesabstractas.form.elementos.ElementoForm;
import pooclasesabstractas.form.elementos.InputForm;
import pooclasesabstractas.form.elementos.SelectForm;
import pooclasesabstractas.form.elementos.TextareaForm;
import pooclasesabstractas.form.elementos.select.Opcion;
import pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm(" clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador())
                .addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("text",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        lenguaje.addOpcion(new Opcion("1", "Java"));
        lenguaje.addOpcion(new Opcion("2","Python").setSelected());
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","typeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" +this.nombre+"' value =\"" +this.valor+ "\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado ");

        username.setValor("javier.lagos");
        password.setValor("a1b3");
        email.setValor("javier@correo.cl");
        edad.setValor("28");
        experiencia.setValor("...... junior entrenando.... ");
       // java.setSelected(true);

        // Una forma mas facil de hacer listas
        List<ElementoForm> elementoForms = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar
        );

        // Uso de Streams , para modernizar el codigo
        elementoForms.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementoForms.forEach(e -> {
            if (!e.esValido()){
              //e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": "+err));
              // Forma moderma de escribir el foreach si vamos a imprimir el mismo parametro
                // no es necesario pasarlo al sout() , ya que se puede hacer un "atajo"
                // metodo de referencia
              e.getErrores().forEach(System.out::println);
            }
        });

    }
}

