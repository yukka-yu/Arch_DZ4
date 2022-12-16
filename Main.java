import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Core core = new Core(); //Backend

        MobileApp mobileApp = new MobileApp(core.getCustomerProvider(), core.getTicketProvider()); //Frontend
        mobileApp.searchTicket(new Date());
        Collection<Ticket> tickets = mobileApp.getTickets();

        mobileApp.buyTicket("1000000000001111");
        mobileApp.buyTicket("1000000000001111");
        mobileApp.buyTicket("1000000000001111");

        core.getBusStation().checkTicket("q3");
        core.getBusStation().checkTicket("q1");
        core.getBusStation().checkTicket("q2");
        core.getBusStation().checkTicket("q0");
        core.getBusStation().checkTicket("q4");

    }
}
