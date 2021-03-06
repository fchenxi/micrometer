/**
 * Copyright 2017 Pivotal Software, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micrometer.jersey2.server.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.micrometer.core.annotation.Timed;

/**
 * @author Michael Weirauch
 */
@Path("/class")
@Produces(MediaType.TEXT_PLAIN)
@Timed(extraTags = { "on", "class" })
public class TimedOnClassResource {

    @GET
    @Path("inherited")
    public String inherited() {
        return "inherited";
    }

    @GET
    @Path("on-method")
    @Timed(extraTags = { "on", "method" })
    public String onMethod() {
        return "on-method";
    }

}
