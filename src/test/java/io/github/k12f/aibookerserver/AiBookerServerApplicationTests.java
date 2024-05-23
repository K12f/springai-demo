package io.github.k12f.aibookerserver;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.ChatClient;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiBookerServerApplicationTests {

    @Resource
    ChatClient chatClient;

    @Test
    void contextLoads() {

        var response = chatClient.call("What is the meaning of life?");

        System.out.println(response);
    }

}
