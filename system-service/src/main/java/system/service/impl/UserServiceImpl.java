package system.service.impl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.accept.ServletPathExtensionContentNegotiationStrategy;

import system.entity.User;
import system.mapper.UserMapper;
import system.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Inject
	private SqlSessionFactory sqlSessionFactory;
	
	@Inject
	private MapperScannerConfigurer mapperScannerConfigurer;
	
	@Inject
	private UserMapper userMapper;
	public User getById(long userId) {
		/*User user = null;
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
//			testUser = (User)context.getBean("user");
			sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
			mapperScannerConfigurer = (MapperScannerConfigurer)context.getBean("mapperScannerConfigureer");
			System.out.println("aaa");
			System.out.println(sqlSessionFactory == null);
			System.out.println(mapperScannerConfigurer == null);
//			System.out.println(testUser == null);
//			System.out.println(testUser.getUserName());
			//SqlSessionFactory sessionFactory = sqlSessionFactoryBean.getObject();
			//SqlSession session = sessionFactory.openSession();
			//User user = session.selectOne("system.mapper.UserMapper.getById", userId);
			//return user;
			SqlSession session = sqlSessionFactory.openSession();
			user = session.selectOne("system.mapper.UserMapper.getById", userId);
			System.out.println(user.getUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		User user = userMapper.getById(userId);
		return user;
	}

}
