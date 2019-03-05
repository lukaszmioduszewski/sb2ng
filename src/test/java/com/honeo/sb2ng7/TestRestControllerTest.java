package com.honeo.sb2ng7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class TestRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenRequest_ThenStatusOk() throws Exception{
        this.mockMvc.perform(get("/test"))
                .andExpect(status().isOk());
    }

    @Test
    public void whenRequest_ThenExpectedString() throws Exception{
        this.mockMvc.perform(get("/test"))
                .andExpect(content().string("hello"));
    }

    @Test
    public void whenRequest_ThenExpectedContentType() throws Exception{
        this.mockMvc.perform(get("/test"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));
    }
}