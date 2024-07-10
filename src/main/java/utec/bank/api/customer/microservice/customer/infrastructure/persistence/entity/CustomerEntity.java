package utec.bank.api.customer.microservice.customer.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * CustomerEntity
 * <p>
 * CustomerEntity class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 9/07/2024
 */

@Getter
@Setter
@Entity
@Table(name = "TBL_CUSTOMERS", schema = "DATABASE-GROUP-3")
public class CustomerEntity {

    @Id
    @Column(name = "CUSTOMER_ID")
    private Integer id;

    @Lob
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Lob
    @Column(name = "LAST_NAME")
    private String lastName;

    @Lob
    @Column(name = "ADDRESS")
    private String address;

    @Lob
    @Column(name = "CITY")
    private String city;

    @Lob
    @Column(name = "STATE")
    private String state;

    @Lob
    @Column(name = "COUNTRY")
    private String country;

    @Lob
    @Column(name = "PHONE")
    private String phone;

    @Lob
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Lob
    @Column(name = "ID_TYPE")
    private String idType;

    @Lob
    @Column(name = "REGISTRATION_DATE")
    private String registrationDate;

}