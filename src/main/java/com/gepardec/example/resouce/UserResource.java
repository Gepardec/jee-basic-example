package com.gepardec.example.resouce;

import com.gepardec.example.service.api.UserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/user")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Path("/name")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getFullName(Integer userId) {
        return Response.ok(userService.getFullUserNameById(userId)).build();
    }
}
