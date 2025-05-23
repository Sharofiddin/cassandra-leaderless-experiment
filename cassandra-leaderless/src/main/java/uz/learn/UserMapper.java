package uz.learn;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface UserMapper {
  @DaoFactory
  UserDao userDao();
}
