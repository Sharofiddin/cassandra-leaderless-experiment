package uz.learn;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;

@Dao
public interface UserDao {

	@Update
	void update(User user);
	
	@Select
	PagingIterable<User> findAll();
}
