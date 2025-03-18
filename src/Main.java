import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.register();
        user.login();
        Product product = new Product();
        product.addProduct(user);
        System.out.println(Arrays.toString(user.getAllProducts()));
    }
}