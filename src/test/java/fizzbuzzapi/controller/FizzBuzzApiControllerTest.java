package fizzbuzzapi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FizzBuzzApiControllerTest {

    @LocalServerPort
    private int port;

    private TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    public void fizzBuzzApiTest() throws Exception {
        ResponseEntity<String> result = testRestTemplate.getForEntity("http://localhost:" + port + "/api/v1/fizzbuzz?value=3", String.class);
        assertThat(result.getBody(), is("FIZZ"));

        result = testRestTemplate.getForEntity("http://localhost:" + port + "/api/v1/fizzbuzz?value=5", String.class);
        assertThat(result.getBody(), is("BUZZ"));

        result = testRestTemplate.getForEntity("http://localhost:" + port + "/api/v1/fizzbuzz?value=15", String.class);
        assertThat(result.getBody(), is("FIZZBUZZ"));

        result = testRestTemplate.getForEntity("http://localhost:" + port + "/api/v1/fizzbuzz?value=8", String.class);
        assertThat(result.getBody(), is("8"));

        result = testRestTemplate.getForEntity("http://localhost:" + port + "/api/v1/fizzbuzz?value=0", String.class);
        assertThat(result.getBody(), is("0"));
    }
}
