package utec.bank.api.customer.microservice.customer.infrastructure.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utec.bank.api.customer.microservice.customer.application.service.CustomerService;
import utec.bank.api.customer.microservice.customer.domain.model.Customer;

/**
 * CustomerController
 * <p>
 * CustomerController class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE UTEC APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author utec
 * @author dbacilio88@outllok.es
 * @since 10/07/2024
 */
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> addCustomer(final Customer customer) {

        return new ResponseEntity<>(this.customerService.create(customer), HttpStatus.CREATED);
    }

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<Customer> find(@PathVariable("id") int id) {

        return new ResponseEntity<>(this.customerService.find(id), HttpStatus.OK);
    }
}


