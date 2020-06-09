package com.infiniteskills.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyResourceReader {

	@Autowired
	@Value("file:E:\\IdeaProjects\\Learning_Spring_Programming\\Chapter 6\\26_Resolving_Resources2\\src\\main\\resources\\test.txt")
	private Resource resource;
	
	public void print() {
		System.out.println(resource.getClass().getSimpleName());
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			
			for(String line = reader.readLine(); line != null; line = reader.readLine()) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
