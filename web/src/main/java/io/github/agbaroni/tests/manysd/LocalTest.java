package io.github.agbaroni.tests.manysd;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/local")
public class LocalTest {

    @Context
    private HttpServletRequest request;

    @EJB
    private Bean1 bean1;

    @EJB
    private Bean2 bean2;

    @GET
    public String getUsers() throws Exception {
	return String.format("%s / %s / %s\n",
			     request.getRemoteUser(),
			     bean1.getUser(),
			     bean2.getUser());
    }
}
