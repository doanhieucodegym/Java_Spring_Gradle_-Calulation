package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_Calculation {
  @GetMapping("/home")
    public String goHome(){
      return  "calculation";
  }
  @PostMapping("/calculation")
  public ModelAndView result1(@RequestParam("number1")String num1,
                             @RequestParam("number2") String num2,
                             @RequestParam("opera")String opera){
        double result;
        double number1 =Double.parseDouble(num1);
        double number2 =Double.parseDouble(num2);
        switch(opera){
          case "addition":
            result =number1 +number2;
            break;

          case "subtraction":
            result =number1 - number2;
            break;
          case "multiplication":
            result = number1 * number2;
            break;
          case "division":
            result = number1/number2;
                    break;


          default:
            throw new IllegalStateException("Unexpected value: " + opera);
        }
        ModelAndView modelAndView =new ModelAndView("calculation");
        modelAndView.addObject("r",result);
        //r để nhận  giá trị  truyền vào file jsp  khi nhận , giá trị r
        //truyền giá  trị từ case vào file  jsp,
        return modelAndView;
  };

}
