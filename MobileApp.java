import java.util.Collection;
import java.util.Date;

public class MobileApp {
    private final Customer customer;
    private final TicketProvider ticketProvider;


    public MobileApp(CustomerProvider customerProvider, TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
        customer = customerProvider.getCustomer("login", "password");
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void buyTicket(String cardNo){
        ticketProvider.buyTicket(customer.getId(), cardNo);
    }
}
