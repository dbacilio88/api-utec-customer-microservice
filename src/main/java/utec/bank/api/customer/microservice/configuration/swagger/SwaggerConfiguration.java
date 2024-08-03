package utec.bank.api.customer.microservice.configuration.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@OpenAPIDefinition(
        info = @Info(
                title = "api-utec-customer-microservice",
                version = "1.0.1",
                description = "api-utec-customer-microservice"

        )
)
public class SwaggerConfiguration {
}
