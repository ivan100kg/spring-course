package io.github.ivan100kg.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("io.github.ivan100kg.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
