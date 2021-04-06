package com.anson.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc

public class TestPostControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testValidSuccess() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/test")
                .param("amount", "1")
                .param("requestNo", "10")
                .param("phone", "123456789")

        ).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println(mvcResult.getResponse());
        System.out.println(content);
    }
    @Test
    void testValidFail() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/test")
                .param("amount", "1")
                .param("requestNo", "10")
                .param("phone", "12")

        ).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println(mvcResult.getResponse());
        System.out.println(content);
    }


    @Test
    void testJson() throws Exception {
        String json = "{\"amount\": 0, \"requestNo\":\"111\"}";
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/testJson")
                .contentType(MediaType.APPLICATION_JSON).content(json)
        ).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println(content);
    }

}