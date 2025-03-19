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
        boolean isTrue = true;
        boolean isAuthenticated = false;

        while (isTrue) {
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
            switch (choice) {
                case 1:
                    user.register();
                    break;
                case 2:
                    if (user.login()){ // true // false
                        isAuthenticated = true;
                    }else {
                        System.out.println("Пройдите через логин!!");
                    }
                    break;
                case 3:
                    if (isAuthenticated){
                        System.out.println(isAuthenticated);
                        product.createProduct(user);
                    }else {
                        System.out.println("Вы не прошли антентификацию!");
                    }
                    break;
                case 4:
                    if (isAuthenticated){
                        System.out.println(Arrays.toString(user.getAllProducts()));
                    }else {
                        System.out.println("Вы не прошли антентификацию!");
                    }
                    break;
                case 5: isTrue= false; break;
                default:
                    System.out.println("Incorrect choice");

            }
        }
    }
}