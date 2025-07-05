package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JOptionPane;
import java.awt.*;

@SpringBootApplication
public class RockPaperScissor {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String name = JOptionPane.showInputDialog("Enter your name");
        try{
            JOptionPane.showMessageDialog(null,"Hello "+name);
        } catch (HeadlessException e) {
            throw new RuntimeException(e);
        }
    }

}
