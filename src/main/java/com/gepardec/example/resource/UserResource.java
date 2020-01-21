package com.gepardec.example.resource;

import com.gepardec.example.rest.api.UserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/user")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {
        return Response.ok().build();
    }

    @GET
    @Path("/name/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getFullName(@PathParam("userId") Integer userId) {
        return Response.ok(userService.getFullUserNameById(userId)).build();
    }
}
