package io.github.davepkennedy.helloworld

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import io.dropwizard.setup.{Bootstrap, Environment}
import io.dropwizard.{Application, Configuration}

/**
 * Created by dakennedy on 29/10/2014.
 */
object HelloWorldApplication extends Application[Configuration] {
  def main (args: Array[String]) = run(args)

  override def initialize(bootstrap: Bootstrap[Configuration]): Unit = {
    bootstrap.getObjectMapper.registerModule(DefaultScalaModule)
  }

  override def run(configuration: Configuration, environment: Environment): Unit = {
    environment.jersey.register(HelloWorldResource)
    environment.healthChecks().register("hello-world", HelloWorldHealthCheck)
  }
}