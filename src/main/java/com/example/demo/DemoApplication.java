package com.example.demo;

import org.datavec.image.loader.NativeImageLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public void run(String... args) throws Exception {
		System.load("C:\\Users\\Rita\\Downloads\\opencv\\build\\java\\x64\\opencv_java346.dll");
	}
}
