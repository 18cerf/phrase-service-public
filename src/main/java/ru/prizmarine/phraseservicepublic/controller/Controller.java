package ru.prizmarine.phraseservicepublic.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.prizmarine.phraseservicepublic.domen.api.RegistrationRequest;
import ru.prizmarine.phraseservicepublic.domen.response.Response;
import ru.prizmarine.phraseservicepublic.service.PhraseService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("phrase-service-public")
public class Controller {

    private final PhraseService phraseService;

    @GetMapping("/hello")
    public String hello() {
        String hello = "hello, user!" +
                "\nver 1.0.0";
        log.info(hello);
        return hello;
    }


    @PostMapping("/registration")
    public ResponseEntity<Response> registration(@RequestBody final RegistrationRequest req) {

        log.info("START endpoint registration, request: {}", req);
        ResponseEntity<Response> resp = phraseService.registration(req);
        log.info("END endpoint registration, response: {}", resp);
        return resp;
    }
}
