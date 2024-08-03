package utec.bank.api.customer.microservice.customer.application.service;

import org.springframework.stereotype.Service;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;
import utec.bank.api.customer.microservice.customer.domain.port.input.ICustomerUseCase;

/**
 * CustomerService
 * <p>
 * CustomerService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */

@Service
public class CustomerService {
    private final ICustomerUseCase customerUseCase;

    public CustomerService(final ICustomerUseCase customerUseCase) {
        this.customerUseCase = customerUseCase;
    }

    public Customer create(Customer model) {
        return customerUseCase.create(model);
    }

    public Customer find(int id) {
        return this.customerUseCase.find(id);
    }
}


