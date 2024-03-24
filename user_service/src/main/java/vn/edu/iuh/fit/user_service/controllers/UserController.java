package vn.edu.iuh.fit.user_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.user_service.models.Product;
import vn.edu.iuh.fit.user_service.models.User;
import vn.edu.iuh.fit.user_service.models.UserProduct;
import vn.edu.iuh.fit.user_service.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/user-and-product")
    public UserProduct getAllUserAndProduct(){
        User user = new User(1L, "Võ Quốc Thịnh");
        Product product = userService.getProduct();
        UserProduct userProduct = new UserProduct(user, product);
        return userProduct;
    }
}
