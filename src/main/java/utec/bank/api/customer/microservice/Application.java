package utec.bank.api.customer.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Data
 * <p>
 * Data class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 * <p>
 * Este proyecto se trabaja en una arquitectura hexagonal (puertos y adaptadores) + vertical slicing
 * Infrastructure puede conocer a Domain y Application.
 * Application solo puede conocer a Domain y no a Infrastructure.
 * Domain no conoce a nadie.
 * El acceso a la lógica del dominio desde el exterior está disponible a través de puertos y adaptadores.
 * La arquitectura hexagonal define la parte interna y la externa.
 * Application (exterior), dominio(interior) e infraestructura (exterior)
 * A través de la capa de aplicación, el usuario o cualquier otro programa interactúa con la aplicación.
 * En la capa de dominio, guardamos el código que toca e implementa la lógica de negocios.
 * La capa de infraestructura es la parte que contiene lo que la aplicación necesita para funcionar.
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 9/07/2024
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
