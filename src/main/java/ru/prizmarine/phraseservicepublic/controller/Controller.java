package ru.prizmarine.phraseservicepublic.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @PostMapping("/test")
    public ResponseEntity<Response> test() {
        log.info("Start endpoint test");
        ResponseEntity<Response> response = phraseService.test();
        log.info("End endpoint test, response: {}", response);
        return response;
    }
}
