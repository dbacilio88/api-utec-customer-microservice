package utec.bank.api.customer.microservice.customer.application.usecase;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;
import utec.bank.api.customer.microservice.customer.domain.port.in.ICustomerUseCase;
import utec.bank.api.customer.microservice.customer.domain.port.out.ICustomerRepositoryPort;

/**
 * CustomerUseCase
 * <p>
 * CustomerUseCase class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */
@Component

public class CustomerUseCase implements ICustomerUseCase {

    private final ICustomerRepositoryPort customerRepositoryPort;

    public CustomerUseCase(@Qualifier("ICustomerRepositoryPort") ICustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    @Transactional
    public Customer create(Customer model) {
        return this.customerRepositoryPort.save(model);
    }

    @Override
    public Customer find(int id) {
        return this.customerRepositoryPort.find(id);
    }
}


