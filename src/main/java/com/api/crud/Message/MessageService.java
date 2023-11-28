package com.api.crud.Message;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {
    
    private final MessageRepository messageRepo;

    public void createMessage(Message message){
        messageRepo.save(message);
    }
}
