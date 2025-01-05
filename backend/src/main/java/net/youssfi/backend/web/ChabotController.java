package net.youssfi.backend.web;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ChabotController {
    private ChatClient chatClient;
    private VectorStore vectorStore;

    public ChabotController(ChatClient.Builder chatClient, VectorStore vectorStore) {
        this.chatClient = chatClient
                //.defaultAdvisors(new MessageChatMemoryAdvisor(new InMemoryChatMemory()))
                .defaultAdvisors(new QuestionAnswerAdvisor(vectorStore))
                .build();
        this.vectorStore = vectorStore;
    }
    @GetMapping("/chat")
    public String chat(String message){
        return chatClient.prompt()
                .user(message)
                .call().content();
    }
}
