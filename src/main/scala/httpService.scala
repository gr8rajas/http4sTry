
import cats.effect._
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

object httpService extends Http4sDsl[IO] {

  val httpService : HttpRoutes[IO] = HttpRoutes.of[IO] {
    case GET -> Root / "Hello" => Ok("Hello Scala!")
  }
}