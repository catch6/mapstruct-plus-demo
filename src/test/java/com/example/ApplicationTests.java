package com.example;

import io.github.linpeilie.Converter;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Catch
 * @since 2024-12-09
 */
@Slf4j
@SpringBootTest
public class ApplicationTests {

	@Resource
	private Converter converter;

	@Test
	public void contextLoads() {
		VO1 vo1 = new VO1();
		vo1.setRoles("1,2,3");

		VO2 vo2 = converter.convert(vo1, VO2.class);
		log.info("vo2: {}", vo2);

		VO1 vo11 = converter.convert(vo2, VO1.class);
		log.info("vo11: {}", vo11);
	}

}
