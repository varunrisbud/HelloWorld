
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._

import scala.collection.JavaConversions._

object HelloWebApp {
  def main(args:Array[String]){
    SpringApplication run(classOf[HelloWebApp])
  }
}

@Controller
@EnableAutoConfiguration
class HelloWebApp{
	@RequestMapping(Array("/"))
	@ResponseBody
	def hello(): String="Hello World"
}