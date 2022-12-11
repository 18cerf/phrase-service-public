package ru.prizmarine.phraseservicepublic.service;

import org.springframework.http.ResponseEntity;
import ru.prizmarine.phraseservicepublic.domen.response.Response;

public interface PhraseService {
    ResponseEntity<Response> test();
}
