package org.client;

import org.client.dto.Address;
import org.client.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// это продюсер
@RestController
@RequestMapping("msg")
public class MsgController {

    @Autowired
    private KafkaTemplate<Long, UserDto> kafkaTemplate; // Для того, чтобы отправлять сообщения, нам потребуется объект KafkaTemplate<K, V>

//    @PostMapping
//    public void sendOrder(String msgId, String msg){
//        kafkaTemplate.send("msg", msgId, msg);       // send(String topic, K key, V data).
//    }

    // Контроллер мапится на localhost:8080/msg, в теле запроса передаётся ключ и само сообщение

//@PathVariable(value="icp") String icp
    @PostMapping("/{msgId}")
    public void sendMsg(@PathVariable(value="msgId") Long msgId, @RequestBody UserDto msg){
//        msg.setAddress(new Address("Rus", "Msk", "Lenina", 1L, 1L));
//        msg.setName("jon");
        ListenableFuture<SendResult<Long, UserDto>> future = kafkaTemplate.send("msg2", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }

}
