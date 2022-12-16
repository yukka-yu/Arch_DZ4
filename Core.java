public class Core {
    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final PaymentProvider paymentProvider;
    private final Database database;

    private final BusStation busStation;

    public Core(){
        database = new Database();
        customerProvider = new CustomerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
        busStation = new BusStation(ticketProvider);
    }

    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public Database getDatabase() {
        return database;
    }

    public BusStation getBusStation() { return busStation; }
}
