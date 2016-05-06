package roppa.apibackend.greeting.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import roppa.apibackend.RoppaConfiguration;
import roppa.apibackend.greeting.model.Greeting;

import static org.junit.Assert.*;

/**
 * Created by y1sh on 5/6/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RoppaConfiguration.class)
@WebIntegrationTest
public class HelloRoppaControllerTest {

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void sayHello() throws Exception {
        Greeting responseBody = restTemplate.getForEntity("http://localhost:8080/hello-roppa", Greeting.class, "").getBody();
        assertEquals(1, responseBody.getId());
        assertEquals("Hello, Roppa!", responseBody.getContent());
    }

}