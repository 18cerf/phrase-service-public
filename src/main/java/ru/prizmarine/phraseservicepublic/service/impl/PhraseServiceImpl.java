package ru.prizmarine.phraseservicepublic.service.impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ru.prizmarine.phraseservicepublic.domen.api.RegistrationRequest;
import ru.prizmarine.phraseservicepublic.domen.response.Response;
import ru.prizmarine.phraseservicepublic.domen.response.SuccessResponse;
import ru.prizmarine.phraseservicepublic.service.PhraseService;
import ru.prizmarine.phraseservicepublic.util.ValidationUtils;

@Slf4j
@Service
@RequiredArgsConstructor
public class PhraseServiceImpl implements PhraseService {


    private final ValidationUtils validationUtils;


    @Override
    public ResponseEntity<Response> registration(RegistrationRequest req) {
        validationUtils.validationRequest(req);
        return new ResponseEntity<Response>((SuccessResponse.builder().data("reg is ok").build()), HttpStatus.OK);
    }
}
