package org.fusesource.camel.process;

import org.springframework.stereotype.Component;
import java.util.Calendar;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Component
public class GenerateSession implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Calendar ca = Calendar.getInstance();
		String mi = Integer.toString(ca.get(Calendar.MILLISECOND));
		String se = "";
		se = se.concat("AAB");
		se = se.concat(mi);
		exchange.getIn().setHeader("session",se);			
	}

}
