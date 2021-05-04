package com.example.demoJPAMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJpaManyApplication
{

	public static void main(String[] args)
	{
		SpringApplication app = new SpringApplication(DemoJpaManyApplication.class);
		try
		{
			app.run(args);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
}
