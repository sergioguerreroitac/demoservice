package org.mycompany;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * 
 * @author Assert Solutions S.A.S
 *
 */
@Path("")
public interface FolRangosService {
    
    @GET
    @Consumes({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
    @Produces({ MediaType.APPLICATION_JSON + "; charset=UTF-8" })
    @Path("/employees/{id}/{sessio}")
    public String getRangos(@PathParam("id") String id,@PathParam("sessio") String session);
}
