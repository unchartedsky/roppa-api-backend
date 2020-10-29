package roppa.apibackend.greeting.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import roppa.apibackend.greeting.model.Greeting;

import static org.junit.Assert.assertEquals;

/**
 * Created by y1sh on 5/6/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRoppaControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sayHello() throws Exception {
        Greeting responseBody = restTemplate.getForEntity("http://localhost:" + port + "/hello-roppa", Greeting.class, "").getBody();
        assertEquals(1, responseBody.getId());
        assertEquals("Hello, Roppa!", responseBody.getContent());
    }

}