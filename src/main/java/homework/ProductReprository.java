package homework;

import java.util.ArrayList;
import java.util.List;

public class ProductReprository {

    private List<Product> list = new ArrayList<>();

    public ProductReprository(List<Product> list) {
        this.list = list;
    }

    public ProductReprository() {
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
