package com.memorynotfound.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/monitor")
@Produces(MediaType.APPLICATION_JSON)
public class MonitorRestService {

    @GET
    @Path("/check")
    public String checkMonitor() {
        throw new RuntimeException("Monitor not available");
    }

}
