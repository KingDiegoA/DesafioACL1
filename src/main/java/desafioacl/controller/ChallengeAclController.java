package desafioacl.controller;


import desafioacl.model.ChallengeAclModelRequest;
import desafioacl.model.ChallengeAclModelResponse;
import desafioacl.service.ChallengeAclService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController //punto de entrada

public class ChallengeAclController { //contructor
    private final ChallengeAclService challengeAclService;

    public ChallengeAclController(ChallengeAclService challengeAclService) {
        this.challengeAclService = challengeAclService;

    }
@Bean
    @PostMapping("/challenger")
    public String challenger(@RequestBody ChallengeAclModelResponse model){ //metodo
        challengeAclService.findDates(null);
        return "";
    }
}
