package utec.bank.api.customer.microservice.customer.domain.port.output;

import org.springframework.stereotype.Component;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;

/**
 * ICustomerRepositoryPort
 * <p>
 * ICustomerRepositoryPort interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */

@Component(value = "customerRepositoryPort")
public interface ICustomerRepositoryPort {
    Customer save(Customer model);

    Customer update(Customer model);

    Customer find(int id);
}
