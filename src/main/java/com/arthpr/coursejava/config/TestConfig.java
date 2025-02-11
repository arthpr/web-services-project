package com.arthpr.coursejava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arthpr.coursejava.entities.Category;
import com.arthpr.coursejava.entities.Order;
import com.arthpr.coursejava.entities.Product;
import com.arthpr.coursejava.entities.User;
import com.arthpr.coursejava.enums.OrderStatus;
import com.arthpr.coursejava.repositories.CategoryRepository;
import com.arthpr.coursejava.repositories.OrderRepository;
import com.arthpr.coursejava.repositories.ProductRepository;
import com.arthpr.coursejava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository urep;
	
	@Autowired
	private OrderRepository orep;
	
	@Autowired
	private CategoryRepository catrep;
	
	@Autowired
	private ProductRepository prodrep;

	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID ,u1);
		
		prodrep.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		urep.saveAll(Arrays.asList(u1, u2));
		orep.saveAll(Arrays.asList(o1, o2, o3));
		catrep.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
