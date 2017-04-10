package fizzbuzzapi.controller;

import fizzbuzzapi.service.FizzBuzz;
import fizzbuzzapi.service.FizzBuzzApi;
import fizzbuzzapi.service.FizzBuzzApiImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzApiController {

    private FizzBuzzApi fizzBuzzApi = new FizzBuzzApiImpl();


    @RequestMapping("/api/v1/fizzbuzz")
    public String process(@RequestParam(value="value" ) Integer value) {
        return fizzBuzzApi.process(value);
    }
}
