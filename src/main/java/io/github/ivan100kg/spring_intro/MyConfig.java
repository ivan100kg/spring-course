package io.github.ivan100kg.spring_intro;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("io.github.ivan100kg.spring_intro")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
