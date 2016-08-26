package fr.sysf.sample.eurekaconfig

import fr.sysf.sample.eurekadiscovery.ApplicationConfig
import org.junit.runner.RunWith
import org.junit.{Assert, Test}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
  * @author Florent Peyron at 27/03/2016
  */
@RunWith(classOf[SpringJUnit4ClassRunner])
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Array(classOf[ApplicationConfig]))
class DiscoveryServiceApplicationTest {

  @Autowired
  private val restTemplate: TestRestTemplate = null

  @Test
  def catalogLoads() {

    val response = restTemplate.getForEntity("/eureka/apps", classOf[String])
    Assert.assertEquals(HttpStatus.OK, response.getStatusCode)
  }

  @Test
  def adminLoads() {
    val response = restTemplate.getForEntity("/env", classOf[String])
    Assert.assertEquals(HttpStatus.OK, response.getStatusCode)
  }
}
