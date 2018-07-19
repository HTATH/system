
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import system.entity.User;
import system.mapper.UserMapper;

public class UserMapperImpl implements UserMapper{

	public User getById(long userId){
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		User user = session.selectOne("system.mapper.UserMapper.getNameById", userId);
		return user;
	}
	public static void main(String args[]){
		UserMapperImpl userMapperImpl = new UserMapperImpl();
		try {
			User user = userMapperImpl.getById(10011);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}