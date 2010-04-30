package be.anova.course.servicemix.nmr.receiver;

import org.apache.camel.builder.RouteBuilder;

public class Receiver extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("nmr:endpoint:incoming").to("log:exercise1");

		
	}
	
	
	
}