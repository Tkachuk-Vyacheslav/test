package org.client;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.client.dto.UserDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

/*  CONCUMER ПОТРЕБИТЕЛЬ
 теперь создадим слушателя.
Spring так же позволяет cделать это без особых усилий.
 Достаточно создать метод и пометить его аннотацией @KafkaListener,
  в параметрах которой можно указать только топик, который будет слушаться. В нашем случае это выглядит так.

  Класс, в котором будет создаваться консьюмер необходимо пометить аннотацией @EnableKafka.
 */

//@EnableKafka
@SpringBootApplication
public class SimpleKafkaExampleApplication {
//
//    @KafkaListener(topics="msg2")
//    public void orderListener(ConsumerRecord<Long, UserDto> record){  // public void msgListener(String msg){ System.out.println(msg);}
//        System.out.println(record.partition()  + "   это партиция, она пока не задана");
//        System.out.println(record.key());
//        System.out.println(record.value());
//        UserDto userDto2 = record.value();
//
//    }

    public static void main(String[] args) {

        SpringApplication.run(SimpleKafkaExampleApplication.class, args);
// s.substring(0,1)) this is +
        //s.substring(0,2) +7  ,    s.substring(1,2)  7  , s.substring(1)  79053398607

        String s = "89093398680";
//        System.out.println(s.substring(1));
//        System.out.println(s.chars().allMatch(Character::isDigit));
        // если нулевой символ +, первый симв 7, длина строки 12, и все симв, кроме нулевого- цифры
        if (s.charAt(0) == '+' && s.charAt(1) == '7' && s.length() == 12
        && s.substring(1).chars().allMatch(Character::isDigit) == true) {
            System.out.println("continius");
        // если нулевой символ 8, длина строки 11, и все симв, кроме нулевого- цифры
        } else if(s.charAt(0) == '8' &&  s.length() == 11 &&
                s.substring(1).chars().allMatch(Character::isDigit) == true) {
            //Заменим 8 на +7 через StringBuilder
           String s2 = new StringBuilder(s).replace(0, 1, "+7").toString();
            System.out.println("continius too  " + s2);
        } else {
            System.out.println("wrong number");
        }




    }

}
