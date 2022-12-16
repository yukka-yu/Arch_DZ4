import java.util.Collection;

public class Customer {
    private static int counter;
    private int id;
    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

}
