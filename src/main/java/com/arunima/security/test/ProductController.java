package com.arunima.security.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.arunima.security.test.Amount;

@RestController
@RequestMapping(path = "/employees")
public class ProductController {
    static int initialAmount=10000;
    static int balance= 10000;


    @GetMapping(path="/netAmount", produces = "application/json")
   /* public  int netAmount(@PathVariable("inputAmount") int inputAmount)*/
    public  int netAmount(@RequestParam int inputAmount)
    {
      /*  String uri = "http://localhost:8080/amount= ";
        RestTemplate restTemplate = new RestTemplate();*/
        balance = balance - inputAmount;

        if (inputAmount < balance)
        {
            return balance;

        }
        else{
            return balance = initialAmount+100;
        }
    }


}
