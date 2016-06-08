package ea.java.TriviaServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ea.java.dao.PlayerDAO;
import ea.java.model.Player;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource
{

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt()
	{
		return "Got it!";
	}

	@Path("players/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPlayerById(@PathParam("id") int id)
	{
		PlayerDAO pd = PlayerDAO.getInstance();
		Player p = pd.getPlayerById(id);
		return Response.status(Status.OK).entity(p).build();
	}

}
