package thread;

public class TicketMain {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("1",30);

        TicketThread ticketThread01 = new TicketThread(ticket);
        TicketThread ticketThread02 = new TicketThread(ticket);
        TicketThread ticketThread03 = new TicketThread(ticket);

        while (true){
            ticketThread01.start();
            ticketThread02.start();
            ticketThread03.start();
        }
    }
}
