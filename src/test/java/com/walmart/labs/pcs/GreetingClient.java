package com.walmart.labs.pcs;

/**
 * Created by pzhong1 on 12/11/14.
 */

import com.walmart.labs.pcs.model.Greeting;
import org.springframework.web.client.RestTemplate;

public class GreetingClient {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Greeting greeting = restTemplate.getForObject("http://localhost:9000/greeting?name=test", Greeting.class);
        System.out.println(greeting.toString());
    }
}
