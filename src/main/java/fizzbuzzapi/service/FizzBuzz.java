package fizzbuzzapi.service;

/**
 * Created by Toshiba on 07/04/2017.
 */
public class FizzBuzz {

    public String process(Integer number) {

        if ( number==null || number==0 ) {
            return "0";
        }
        if (number % 15 == 0) {
            return "FIZZBUZZ";
        }
        if (number % 3 == 0) {
            return "FIZZ";
        } else if (number % 5 ==0 ) {
            return "BUZZ";
        }
        return number.toString();
    }
}
