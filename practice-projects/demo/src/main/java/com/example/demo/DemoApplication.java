package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JOptionPane;
import java.awt.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		if (!GraphicsEnvironment.isHeadless()) {
			String name = JOptionPane.showInputDialog("Enter your name");
			JOptionPane.showMessageDialog(null, "Hello " + name);
		} else {
			System.out.println("Running in headless mode");
		}

	}

}
