package org.quarkus.samples.petclinic.system;

import java.security.Principal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/")
public class SessionResource {

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/session")
    public Principal showSessionDetails() {
        return identity.getPrincipal();
    }

}
