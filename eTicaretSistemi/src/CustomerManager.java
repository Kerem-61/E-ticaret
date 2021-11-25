public class CustomerManager {
    CustomerValidator validator = new CustomerValidator();

    public void add(Customer customer){
        if (validator.isEmailValid(customer.email) && validator.allValid(customer)){
            System.out.println("Kullanıcı bilgileri geçerli");
            System.out.println("Hoşgeldiniz "+ customer.name + " Bey");
        }else {
            System.out.println("Kullanıcı bilgileri geçersiz.");
            System.out.println("Tekrar deneyiniz.");
        }
    }
}
