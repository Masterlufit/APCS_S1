public class _TicketDriver {
	public static void main(String[] args) {
		Ticket adv = new Advance(10);
		Ticket s_adv = new StudentAdvance(10);
		Ticket w = new Walkup();

		p(adv.toString());
		p(s_adv.toString());
		p(w.toString());
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
}