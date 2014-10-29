package io.github.davepkennedy.helloworld

import javax.ws.rs._
import javax.ws.rs.core.MediaType

case class Message (how: String, who: String)

@Path("/")
@Produces(Array(MediaType.APPLICATION_JSON))
object HelloWorldResource {
  @GET
  def produceResponse
  (
    @QueryParam("who") @DefaultValue("World") who: String,
    @QueryParam("how") @DefaultValue("Hello") how: String
  ) = Message (how = how, who = who)
}
