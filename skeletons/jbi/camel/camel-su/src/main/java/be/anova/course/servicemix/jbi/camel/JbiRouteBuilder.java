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
package be.anova.course.servicemix.jbi.camel;

import org.apache.camel.builder.RouteBuilder;

/**
 * Routebuilder for routing between JBI endpoints
 */
public class JbiRouteBuilder extends RouteBuilder {

    public void configure() {
        //TODO: implement a Camel route that
        //      - exposes itself as service {urn:be:anova:course:servicemix:jbi:camel}router, endpoint endpoint
        //      - forwards the exchange to service {urn:be:anova:course:servicemix:jbi:camel}xslt, endpoint endpoint
        //        (you need to override the MEP to use in-out here)
        //      - forwards the exchange to service {urn:be:anova:course:servicemix:jbi:camel}file, endpoint out
    }

}
