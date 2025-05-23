package uz.learn;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import com.datastax.oss.driver.api.core.ConsistencyLevel;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.querybuilder.QueryBuilder;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {
 @Inject UserDao userDao;
 @Inject CqlSession cqlSession;
 public void save(String consistency, String name) {
	 ConsistencyLevel cl = consistency.equalsIgnoreCase("QUORUM") ? ConsistencyLevel.QUORUM : ConsistencyLevel.ONE;
	 SimpleStatement stmt = QueryBuilder.insertInto("experiment", "users")
			 .value("id", QueryBuilder.literal(UUID.randomUUID()))
			 .value("name", QueryBuilder.literal(name))
			 .value("last_updated", QueryBuilder.literal(Instant.now()))
			 .build().setConsistencyLevel(cl);
	 cqlSession.execute(stmt);
 }
 
 public List<User> getAll(){
	 return userDao.findAll().all();
 }
}
