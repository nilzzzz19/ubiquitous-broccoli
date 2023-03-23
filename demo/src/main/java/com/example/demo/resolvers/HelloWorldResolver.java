package com.example.demo.resolvers;

//import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class HelloWorldResolver implements GraphQLQueryResolver {

    public String hello() {
        return "Hello, world!";
    }
}
