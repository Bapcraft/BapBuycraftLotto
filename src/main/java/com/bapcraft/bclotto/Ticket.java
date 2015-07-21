package com.bapcraft.bclotto;

import java.math.BigDecimal;
import java.util.UUID;

public class Ticket {

	protected static BigDecimal TICKET_PRICE = new BigDecimal(1); // USD.  Changed in config.
	
	public final UUID player;
	
	public Ticket(UUID player) {
		
		this.player = player;
		
	}
	
	public static final BigDecimal getTicketPrice() {
		return TICKET_PRICE;
	}
	
}
