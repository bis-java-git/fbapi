package fizzbuzzapi.service;

public class FizzBuzzApiImpl implements FizzBuzzApi{

    private FizzBuzz fizzBuzz = new FizzBuzz();

    public String process(Integer number) {
        return fizzBuzz.process(number);
    }
}
