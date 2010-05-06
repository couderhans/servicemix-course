package be.anova.course.servicemix.jbi;

import org.apache.camel.builder.RouteBuilder;

public class JbiRouteBuilder extends RouteBuilder {

    public void configure() {
    
    	from("jbi:endpoint:urn:be:anova:course:servicemix:jbi:camel:route")
    	    .to("jbi:endpoint:urn:be:anova:course:servicemix:jbi:file:out");

    }

}
