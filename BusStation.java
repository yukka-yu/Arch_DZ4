public class BusStation {
        TicketProvider ticketProvider;

        public BusStation(TicketProvider ticketProvider) {
                this.ticketProvider = ticketProvider;
        }

        public void checkTicket(String qrcode){
                try {
                        if (ticketProvider.checkTicket(qrcode)){
                                System.out.println("Проходите, пожалуйста!");
                        }
                } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                }
        }

}
