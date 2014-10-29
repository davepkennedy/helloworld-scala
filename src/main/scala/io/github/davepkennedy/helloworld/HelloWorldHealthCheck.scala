package io.github.davepkennedy.helloworld

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

object HelloWorldHealthCheck extends HealthCheck{
  override def check(): Result = Result.healthy()
}
