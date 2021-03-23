package com.example.cip;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class testParser implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        System.out.println("What is in header? : " + exchange.getIn().getHeaders());
        System.out.println("What is in body? : " + exchange.getIn().getBody());
        
        String body = exchange.getIn().getBody().toString();
        
        exchange.getIn().setBody(body);

    }
    
}
