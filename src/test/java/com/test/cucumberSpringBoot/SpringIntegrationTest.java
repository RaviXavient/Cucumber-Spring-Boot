package com.test.cucumberSpringBoot;

import javax.swing.Spring;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ContextConfiguration
@SpringBootTest(classes = Application.class)
//@PropertySource("classpath:application-#{spring.profiles.active?:default}.properties")
public class SpringIntegrationTest extends TestComponentScan {

}
