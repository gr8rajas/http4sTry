import cats.effect.{ExitCode, IO, IOApp}
import com.typesafe.scalalogging.StrictLogging
import org.http4s.implicits.http4sKleisliResponseSyntaxOptionT
import org.http4s.server.Router
import org.http4s.server.blaze.BlazeServerBuilder

object runService extends IOApp with StrictLogging {

  def stream(): IO[ExitCode] =
    BlazeServerBuilder[IO]
      .bindHttp(8000, "localhost").withHttpApp(httpApp)
      .serve
      .compile
      .drain.as(ExitCode.Success)

  val httpApp = Router("/" -> httpService.httpService).orNotFound

  override def run(args: List[String]): IO[ExitCode] ={
    logger.info("Starting the Service")
    logger.info("To run paste  curl  -i  localhost:8000/Hello in terminal")
    logger.info("http://127.0.0.1:8000/Hello")
    stream()
  }


}


//lsof -i tcp:8000