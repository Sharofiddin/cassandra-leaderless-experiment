package uz.learn;



import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {
    
	@Inject UserService userService;
	
	
    @GET
    public List<UserDto> getAll() {
        return userService.getAll().stream().map(this::convertToDto).toList();
    }
    
    @POST
    @Path("/{consistency}")
    public void add(@PathParam("consistency") String consistency, @QueryParam("name") String name) {
    	userService.save(consistency, name);
    }
    
    
	
	private UserDto convertToDto(User user) {
		return new UserDto(user.getName(), user.getLastUpdated().atOffset(ZoneOffset.UTC).toLocalDateTime());
	}
}
