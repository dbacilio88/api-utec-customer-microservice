package utec.bank.api.customer.microservice.customer.infrastructure.persistence.repository.implementations;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;
import utec.bank.api.customer.microservice.customer.domain.port.output.ICustomerRepositoryPort;
import utec.bank.api.customer.microservice.customer.infrastructure.api.mapper.ICustomerMapper;
import utec.bank.api.customer.microservice.customer.infrastructure.persistence.entity.CustomerEntity;
import utec.bank.api.customer.microservice.customer.infrastructure.persistence.repository.ICustomerRepository;

import java.util.Optional;

/**
 * CustomerRepositoryAdapter
 * <p>
 * CustomerRepositoryAdapter class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */
@Log4j2
@Component
@RequiredArgsConstructor
public class CustomerRepositoryAdapter implements ICustomerRepositoryPort {

    private final ICustomerRepository repository;
    private final ICustomerMapper mapper;

    @Override
    public Customer save(Customer model) {
        final CustomerEntity entity = this.mapper.toEntity(model);
        return Optional.of(this.repository.save(entity))
                .map(e -> mapper.toDto(e))
                .get();
    }

    @Override
    public Customer update(Customer model) {
        final CustomerEntity entity = this.mapper.toEntity(model);
        return Optional.of(this.repository.save(entity))
                .map(e -> mapper.toDto(e))
                .get();
    }

    @Override
    public Customer find(int id) {
        log.info("customer_id {}", id);
        CustomerEntity entity = this.repository.findById(id).orElse(null);
        log.info("entity {}", entity);
        return this.mapper.toDto(entity);
    }
}


