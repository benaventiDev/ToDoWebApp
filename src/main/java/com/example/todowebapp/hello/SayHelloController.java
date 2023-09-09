package com.example.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHTML(){
        return """
    <html>
    <head>
    <title>My First HTML page</title>
    </head>
    <body>
    <h1>My First HTML page</h1>
    </body>
    </html>
    """;
    }

    @RequestMapping(value = "say-hello-jsp", method = RequestMethod.GET)
    public String sayHelloJsp(){
        return "sayHello";
    }
}
