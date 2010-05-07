/*
 * (c) 2010, anova r&d bvba.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package be.anova.course.servicemix.nmr.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.servicemix.nmr.api.Exchange;
import org.apache.servicemix.nmr.api.event.ExchangeListener;

/**
 * Our own ExchangeListener implementation
 */
public class ExchangeListenerImpl implements ExchangeListener {
	
    private static final transient Log LOG = LogFactory.getLog(ExchangeListenerImpl.class);

	public void exchangeDelivered(Exchange exchange) {
		log("delivered", exchange);
	}

	public void exchangeFailed(Exchange exchange) {
		log("failed", exchange);
	}

	public void exchangeSent(Exchange exchange) {
		log("sent", exchange);
	}

    private void log(String event, Exchange exchange) {
        //TODO: for every exchange, log the
        //      - exchange id
        //      - in message body
        //      - exchange status
    }

}
