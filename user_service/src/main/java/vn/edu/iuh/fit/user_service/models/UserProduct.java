package vn.edu.iuh.fit.user_service.models;

public class UserProduct {
    private User user;
    private Product product;

    public UserProduct() {
    }

    public UserProduct(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserProduct{" +
                "user=" + user +
                ", product=" + product +
                '}';
    }
}
