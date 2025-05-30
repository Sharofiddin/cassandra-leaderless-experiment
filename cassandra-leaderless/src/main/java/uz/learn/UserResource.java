package uz.learn;



import java.time.ZoneOffset;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

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
