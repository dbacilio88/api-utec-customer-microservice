package utec.bank.api.customer.microservice.customer.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * Customer
 * <p>
 * Customer class.
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
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 5342023362807264070L;

    private long id;
    private String name;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phone;
    private String dob;
    private String type;
    private String created;
}


