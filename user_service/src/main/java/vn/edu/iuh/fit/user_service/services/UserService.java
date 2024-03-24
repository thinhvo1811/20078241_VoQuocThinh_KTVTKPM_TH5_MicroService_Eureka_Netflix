package vn.edu.iuh.fit.user_service.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.user_service.models.Product;

@Service
public class UserService {
    private final String apiGetProduct = "http://localhost:8081/product";

    RestTemplate restTemplate = new RestTemplate();

    public Product getProduct(){
        ResponseEntity<Product> responseEntity = restTemplate.exchange(
                apiGetProduct,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Product>() {}
        );
        return responseEntity.getBody();
    }
}
