import com.aaronspringapitest.springtest.HelloResource;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
/*
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
*/

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
//https://medium.com/backend-habit/integrate-junit-and-mockito-unit-testing-for-controller-layer-91bb4099c2a5
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloResourceTest {

    /**
     * This mockMVc will be instantiated by setUp
     * we are building  mockMvc hy MockMvcBuilder by the help of standaloneSetup
     */
    private MockMvc mockMvc;
    /**
     * This HelloResource Controller will be injected by Mockito @InjectMocks
     */
    @InjectMocks
    private HelloResource helloResource;

    /**
     * this setUp method is the setUp or before  each methods
     */
    @Before
    public void setUp() {
      /*  mockMvc = MockMvcBuilders
                .standaloneSetup(helloResource)
                .build();*/
        //or
        mockMvc = standaloneSetup(helloResource).build();


    }

    @Test
    public void testHelloWorld() throws Exception {
        /*mockMvc.perform(
                MockMvcRequestBuilders.get("/hello")

        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
        */
        mockMvc.perform(
                get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));


    }

    /**
     * this test method will test the testHelloWorldJson method.
     * @throws Exception : the exception may be throws by the method
     */
    @Test
    public void testHelloWorldJson() throws Exception{
        // on demand concept
        mockMvc.perform(get("/hello/json").accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.greetings", Matchers.is("Greetings")))// parsing to all json key and value
                .andExpect(jsonPath("$.hello_world",Matchers.is("Hello World")))
                 .andExpect(jsonPath("$.*",Matchers.hasSize(2)));
    }
}