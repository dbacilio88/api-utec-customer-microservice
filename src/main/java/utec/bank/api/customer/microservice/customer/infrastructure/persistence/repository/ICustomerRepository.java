package utec.bank.api.customer.microservice.customer.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utec.bank.api.customer.microservice.customer.infrastructure.persistence.entity.CustomerEntity;

/**
 * ICustomerRepository
 * <p>
 * ICustomerRepository class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 9/07/2024
 */
@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
