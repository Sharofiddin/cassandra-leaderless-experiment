package uz.learn;

import java.time.Instant;
import java.util.UUID;

import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import com.datastax.oss.driver.api.mapper.annotations.PropertyStrategy;

@Entity
@PropertyStrategy(mutable = false)
@CqlName("users")
public class User {

    @PartitionKey
    private final UUID id;
    
    private final String name;
    
    @CqlName("last_updated")
    private final Instant lastUpdated;
    
    public User(UUID id, String name, Instant lastUpdated) {
    	this.id = id;
    	this.name = name;
    	this.lastUpdated = lastUpdated;
    }

	public String getName() {
		return name;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}
	
	public UUID getId() {
		return id;
	}
    
    
}
