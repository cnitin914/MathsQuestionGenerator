package com.mathsQuestionGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class MathsQuestionGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathsQuestionGeneratorApplication.class, args);
	}
}
