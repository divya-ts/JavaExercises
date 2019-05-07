//Additional file created to overcome the Springboot and Mongo Connection to port 27071. (Expose MongoClient as a bean in context.) 

package io.codementor.gtommee.rest_tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
 
import com.mongodb.MongoClient;
 
@Configuration
public class SpringMongoDBConfiguration {
	
	public SpringMongoDBConfiguration() {
		System.out.println("CONFIG -- CONFIG -- CONFIG");
	}
 
	@Bean
	public MongoDbFactory getMongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient("localhost",27017), "rest_tutorial");
	}

	@Bean (name="mongoTemplate")
	public MongoTemplate getMongoTemplate() throws Exception {
		MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
		return mongoTemplate;
	}
}
