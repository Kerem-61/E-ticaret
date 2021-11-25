public class Main {

    public static void main(String[] args) {
    CustomerManager manager = new CustomerManager();
    Customer customer = new Customer();
    CustomerValidator validator = new CustomerValidator();

    customer.name = "Kerem";
    customer.surname = "Sahtiyan";
    customer.password = "12345";
    customer.email = "ksahtiyan@gmail.com";
    customer.id = 1;
    validator.isEmailValid(customer.email);
    validator.allValid(customer);
    manager.add(customer);

    }
}
