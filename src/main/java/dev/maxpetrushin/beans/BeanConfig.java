package dev.maxpetrushin.beans;


import dev.maxpetrushin.beans.wiring.Parrot;
import dev.maxpetrushin.beans.wiring.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"dev.maxpetrushin.beans.wiring", "dev.maxpetrushin.beans.stereotype"})
public class BeanConfig {
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Joko");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Dude");
        return person;
    }
}
