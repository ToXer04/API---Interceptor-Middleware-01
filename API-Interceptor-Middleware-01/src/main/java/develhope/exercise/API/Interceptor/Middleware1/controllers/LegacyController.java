package develhope.exercise.API.Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    public String defaultMessage() {
        return "This is just old code";
    }
}
