package thymeleaf.test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.io.IOException;
import java.util.Map;

@Controller
public class ViewController {

  @View("http://s3.eu-central-1.amazonaws.com/cdn.resys.io/dialob-fill-ui-app/master/index.html")
  @Get("/")
  public HttpResponse index() throws IOException, InterruptedException {
    return HttpResponse.ok(Map.of("test", "value"));
  }
}
