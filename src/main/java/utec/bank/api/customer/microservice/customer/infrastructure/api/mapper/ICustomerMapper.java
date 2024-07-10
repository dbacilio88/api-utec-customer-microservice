package utec.bank.api.customer.microservice.customer.infrastructure.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import utec.bank.api.customer.microservice.customer.infrastructure.persistence.entity.CustomerEntity;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;

import java.util.List;

/**
 * ICustomerMapper
 * <p>
 * ICustomerMapper class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 9/07/2024
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface ICustomerMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "state", source = "state")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "dob", source = "dateOfBirth")
    @Mapping(target = "type", source = "idType")
    @Mapping(target = "created", source = "registrationDate")
    Customer toDto(CustomerEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "state", source = "state")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "dateOfBirth", source = "dob")
    @Mapping(target = "idType", source = "type")
    @Mapping(target = "registrationDate", source = "created")
    CustomerEntity toEntity(Customer model);

    List<Customer> toList(Iterable<CustomerEntity> iterator);
}
