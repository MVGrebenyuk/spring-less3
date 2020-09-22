package homework;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name = "user")
    private List<Product> userProducts = new ArrayList<>();

    public List<Product> getUserProducts() {
        return userProducts;
    }

    public void add(Product prod){
        userProducts.add(prod);
    }

    public void setUserProducts(List<Product> userProducts) {
        this.userProducts = userProducts;
    }

    @Transient
    private Cart cart = new Cart();

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public User() {
    }

    public void addProduct(Product product){
        cart.add(product);
    }

    public void getAllProductFromCart(){
        cart.getList().toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
