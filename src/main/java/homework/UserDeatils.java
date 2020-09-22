/*package homework;

import javax.persistence.*;

@Entity
@Table(name = "users_products")
public class UserDeatils {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "product")
    private String product;

    @OneToOne(mappedBy = "userDeatils")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String products) {
        this.product = products;
    }

    @Override
    public String toString() {
        return product;
    }
}
*/