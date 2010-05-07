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
package be.anova.course.servicemix.jbi.bean;

import org.apache.servicemix.jbi.listener.MessageExchangeListener;

import javax.annotation.Resource;
import javax.jbi.messaging.DeliveryChannel;
import javax.jbi.messaging.ExchangeStatus;
import javax.jbi.messaging.MessageExchange;
import javax.jbi.messaging.MessagingException;
import javax.jbi.messaging.NormalizedMessage;

/**
 * Simple bean to use in a JBI endpoint
 */
public class ListenerBean implements MessageExchangeListener {

    @Resource
    private DeliveryChannel channel;

    public void onMessageExchange(MessageExchange exchange) throws MessagingException {
        if (exchange.getStatus() == ExchangeStatus.ACTIVE) {
            NormalizedMessage message = exchange.getMessage("in");

            display("%nReceived exchange %s%n", exchange.getExchangeId());
            display("- service: %s%n", exchange.getService());

            display("- body: %s%n", message.getContent());
            display("- headers: %n");
            for (Object key : message.getPropertyNames()) {
                display("  +- %s: %s%n", key, message.getProperty(key.toString()));
            }

            exchange.setStatus(ExchangeStatus.DONE);
            channel.send(exchange);   
        }
    }

    private void display(String format, Object... parms) {
        System.out.printf(format, parms);
    }
}
