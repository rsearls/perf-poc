package org.jboss.perf;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Radim Vansa &ltrvansa@redhat.com&gt;
 */
@ApplicationPath("/test")
public class Activator extends Application {
   /** rls
   public static final String ROOT_PATH = "/web-benchmark/test";

   @Provider
   public static class QuietNotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {
      @Override
      public Response toResponse(NotFoundException exception) {
         return Response.status(Response.Status.NOT_FOUND).build();
      }
   }
   **/
   private Set<Class<?>> classes = new HashSet<Class<?>>();
   @Override
   public Set<Class<?>> getClasses() {
      classes.add(TextHandler.class);
      classes.add(PojoHandler.class);
      classes.add(ParamHandler.class);
      classes.add(JaxbHandler.class);
      classes.add(BytesHandler.class);
      return classes;
   }
}
