package com.sau.assignment;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RectangleConfig {

	@Bean
	public Rectangle rectangle() {
		return new Rectangle(50, 40);
	}

	@Bean(name = "point1")
	public Point point1() {
		return new Point(20, 30);
	}

	@Bean(name = "point2")
	public Point point2() {
		return new Point(0, 0);
	}

	@Bean(name = "point3")
	public Point point3() {
		return new Point(40, 50);
	}

	@Bean(name = "point4")
	public Point point4() {
		return new Point(0, 50);
	}

	@Bean(name = "list1")
	public List<String> strList() {
		return Arrays.asList("red", "blue", "green");
	}

}
