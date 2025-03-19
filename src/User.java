import java.util.Arrays;
import java.util.Scanner;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Product [] products = new Product[10];

    public User() {
    }

    public User(long id, String firstName, String lastName, String email, String password, Product[] products) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    Scanner scannerForInt = new Scanner(System.in);
    Scanner scannerForString = new Scanner(System.in);

//    -Register
    // Bul bizdin Baza Dannyh
    User [] users  = new User[10];

    int count = 0;
    public void register(){ // 1 2
        // Dannyi berip aldyk
        User user = new User();
        System.out.println("Write id: ");
        user.setId(scannerForInt.nextInt());
        System.out.println("Write firstName: ");
        user.setFirstName(scannerForString.nextLine());
        System.out.println("Write lastName: ");
        user.setLastName(scannerForString.nextLine());
        System.out.println("Write email: ");
        user.setEmail(scannerForString.nextLine());
        System.out.println("Write password: ");
        user.setPassword(scannerForString.nextLine());

        if (count < users.length){
            users[count++] = user;
            System.out.println("Success!");
        }else {
            System.out.println("Error!");
        }

        System.out.println(Arrays.toString(users));
    }
//    -Login
    public boolean login(){
        System.out.println("Write email: ");
        String email = scannerForString.nextLine();
        System.out.println("Write password: ");
        String password = scannerForString.nextLine();

        for (int i = 0; i < count; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)){
               return true;
            }
        }
        return false;
    }

    // add product
    int productCount =0;
    public void addProductToArray(Product product){
        if (productCount < products.length){
            products[productCount++] = product;
        }else {
            System.out.println("Error");
        }
    }

    public Product[] getAllProducts(){
        return products;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
