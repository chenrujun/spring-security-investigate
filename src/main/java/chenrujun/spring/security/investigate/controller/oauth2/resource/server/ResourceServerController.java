package chenrujun.spring.security.investigate.controller.oauth2.resource.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceServerController {

    @GetMapping("/resource/server/hello")
    public String hello() {
        return "Access resource server successfully.";
    }
}
