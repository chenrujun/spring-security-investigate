package chenrujun.spring.security.investigate.controller.oauth2.login;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2LoginController {

    @ResponseBody
    @GetMapping("/oauth2/login/hello")
    public String oauth2Login() {
        return "Oauth2 login successfully.";
    }

    @ResponseBody
    @GetMapping("/oauth2/login/access/token/graph")
    public String oauth2AuthorizedClient(@RegisteredOAuth2AuthorizedClient("graph") OAuth2AuthorizedClient graphClient) {
        return graphClient.getAccessToken().getTokenValue();
    }
}
