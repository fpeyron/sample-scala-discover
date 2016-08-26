package fr.sysf.sample.eurekadiscovery

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.context.annotation.ComponentScan

/**
  * Spring Boot Application object
  *
  * @author Florent Peyron at 25/03/2016
  * @version 1.0
  */

object Application extends App {
  SpringApplication.run(classOf[ApplicationConfig])
}

@EnableEurekaServer
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan
class ApplicationConfig