## Thymeleaf URL template

Created with Micronaut 1.3.5 using `mn create-app -b maven`. No additional dependencies.

Running using `java -jar target/thymeleaf-test-0.1.jar`

Java version:
```
openjdk version "11.0.5" 2019-10-15
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.5+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.5+10, mixed mode)
```

Classes used:
* `ViewController` - a `@Controller` that try to reference Thymeleaf template by URL
* `ViewFactory` - a `@Factory` that creates Thymeleaf's `UrlTemplateResolver` that is picked up by `io.micronaut.views.thymeleaf.ThymeleafViewsRenderer`

Request http://localhost:8088/

```
10:38:15.394 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 1077ms. Server Running: http://localhost:8088
10:38:22.562 [pool-1-thread-3] ERROR i.m.h.s.netty.RoutingInBoundHandler - Unexpected error occurred: View [http://s3.eu-central-1.amazonaws.com/cdn.resys.io/dialob-fill-ui-app/master/index.html] does not exist
io.micronaut.views.exceptions.ViewNotFoundException: View [http://s3.eu-central-1.amazonaws.com/cdn.resys.io/dialob-fill-ui-app/master/index.html] does not exist
	at io.micronaut.views.ViewsFilter.lambda$doFilter$0(ViewsFilter.java:138)
```

It tries to validate the given template URL as a classpath resource