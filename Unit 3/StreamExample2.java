//  w a p to create product class and initialize , id , name , price 
// another class  add at least 5 product in your array list 
//apply filter to sell only the product of whose price are > 30000 . select the price of the product only add that array 

//   return product name which price is grater than 30000 


import java.util.*;
import java.util.stream.*;


class Product {
    int id;
    String name;
    double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
    return price;
    }
}


public class StreamExample2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 25000));
        products.add(new Product(2, "Product 2", 35000));
        products.add(new Product(3, "Product 3", 15000));
        products.add(new Product(4, "Product 4", 45000));
        products.add(new Product(5, "Product 5", 50000));

        products.stream()
                .filter(product -> product.getPrice() > 30000)

                .map(Product::getPrice)

                .forEach(System.out::println);
                // retrun product name which price is grater than 30000
                 products.stream()
                .filter(product -> product.getPrice() > 30000) 
                .map(product -> product.name)
                .forEach(System.out::println); 










    }
}
    




    