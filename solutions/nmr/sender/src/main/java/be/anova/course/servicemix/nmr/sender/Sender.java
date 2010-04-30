package be.anova.course.servicemix.nmr.sender;

import org.apache.camel.builder.RouteBuilder;

public class Sender extends RouteBuilder {

	@Override
	public void configure() throws Exception {
        
		from("timer://foo?fixedRate=true&period=6000")
		  .setBody(constant("Excercise 1"))
		  .to("nmr:endpoint:incoming");
		
	}
	
	
}
