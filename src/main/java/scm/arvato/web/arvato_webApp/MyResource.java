package scm.arvato.web.arvato_webApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("text/analyze")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ProductsData textAnalyze( List<Product> products) {
    	ProductsData productsData = new ProductsData();
    	productsData = ProductsData.analyze(products);
    	System.out.println(products);
    	System.out.println(productsData);
        return productsData;  
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String textMessage( ) {
    	 return ("PLease pass the productsData to be analyzed");
    }
}
