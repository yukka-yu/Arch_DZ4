public class CustomerProvider {
    private final Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password){
        // Проверка логина и пароля
        //return database.getCustomers().stream().findFirst().get();
        return new Customer();
    }
}
