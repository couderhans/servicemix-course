package be.anova.course.servicemix.nmr.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.servicemix.nmr.api.Exchange;
import org.apache.servicemix.nmr.api.event.ExchangeListener;


public class ExchangeListenerImpl implements ExchangeListener {
	
    private static final transient Log LOG = LogFactory.getLog(ExchangeListenerImpl.class);

	public void exchangeDelivered(Exchange exchange) {

		LOG.debug("Exchange Delivered: " + exchange);
		
	}

	public void exchangeFailed(Exchange exchange) {
		
		LOG.debug("Exchange Failed: " + exchange);
		
	}

	public void exchangeSent(Exchange exchange) {

		LOG.debug("Exchange Send: " + exchange);
		
	}
	
	
	
}
