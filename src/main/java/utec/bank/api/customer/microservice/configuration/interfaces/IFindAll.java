package utec.bank.api.customer.microservice.configuration.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


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
public interface IFindAll<E> {
    Page<E> findAll(Pageable pageable);
    List<E> findAll();
}