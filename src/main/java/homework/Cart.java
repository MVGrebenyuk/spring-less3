package homework;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Cart {
    private List<Product> list = new ArrayList<>();

    public Cart() {
    }


    public List<Product> getList() {
        return list;
    }

    public void add(Product product){
        list.add(product);
    }

    public void remove(){
    }

}
