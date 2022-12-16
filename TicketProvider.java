import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

public class TicketProvider {
    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider){
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId, Date date){
        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : database.getTickets()){
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date))
                tickets.add(ticket);
        }
        return tickets;
    }

    public void buyTicket(int clientId, String cardNo){
        double amount = database.getTicketAmount();
        int orderId = database.createTicketOrder(clientId);
        if (paymentProvider.buy(orderId, cardNo, amount)) {
            int id = database.getTickets().size() + 1;
            Date date = new Date();
            Random r = new Random();
            String qrcode = "q" + r.nextInt(5);
            database.addTicket(new Ticket(id, clientId, date, qrcode,  true));
        }
    }

    public boolean checkTicket(String qrcode){

        if(qrcode.length() > 3) {
            throw new RuntimeException("qrcode недействителен");
        }

        for (Ticket ticket : database.getTickets()){
            if (ticket.getQrcode().equals(qrcode) && ticket.getEnable()){
                ticket.setEnable(false);
                return true;
            }
        }

        throw new RuntimeException("Проход запрещён");
    }
}
