package utec.bank.api.customer.microservice.configuration.interfaces;


/**
 * Data
 * <p>
 * Data class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 9/07/2024
 */
public interface IUpdate<E, I> {
    E update(I id);
}