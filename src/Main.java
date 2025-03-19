import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        user.register();
//        user.login();
//        Product product = new Product();
//        product.createProduct(user);
//        System.out.println(Arrays.toString(user.getAllProducts()));

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Product product = new Product();

        System.out.println("""
                       Меню
                1.Register
                2.Login
                3.Add product
                4.Get All Products
                5.Exit       
                """);
        System.out.println("Choose method: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: user.register(); break;
            case 2: user.login();break;
            case 3: product.createProduct(user); break;
            case 4: user.getAllProducts(); break;
            default:
                System.out.println("Incorrect choice");
        }



    }
}