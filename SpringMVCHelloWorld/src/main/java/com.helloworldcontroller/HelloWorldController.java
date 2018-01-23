package com.helloworldcontroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController
{

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public ModelAndView gethello()
   {
        String msg= " Hello world from spring mvc rest";
        return new ModelAndView("helloworld","message",msg);
   }
}