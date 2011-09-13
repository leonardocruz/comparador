package br.com.cancompare.comparador;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/members")
@RequestScoped
public class MemberResourceRESTService
{
   //placeholder to confirm JAX-RS is working as expected.  
   @GET
   @Produces("text/plain")
   public String ping()
   {
      return "Hello World";
   }
}
