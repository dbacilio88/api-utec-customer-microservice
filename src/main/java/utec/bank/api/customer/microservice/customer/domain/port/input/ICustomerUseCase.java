package utec.bank.api.customer.microservice.customer.domain.port.input;

import utec.bank.api.customer.microservice.customer.domain.model.Customer;

/**
 * ICustomerUseCase
 * <p>
 * ICustomerUseCase interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */
public interface ICustomerUseCase {
    Customer create(Customer model);
    Customer find(int id);
}


