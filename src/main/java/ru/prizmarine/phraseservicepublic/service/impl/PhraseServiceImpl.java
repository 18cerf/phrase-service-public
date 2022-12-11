package ru.prizmarine.phraseservicepublic.service.impl;


import ru.prizmarine.phraseservicepublic.domen.response.Error;
import ru.prizmarine.phraseservicepublic.domen.response.Response;
import ru.prizmarine.phraseservicepublic.domen.response.ErrorResponse;
import ru.prizmarine.phraseservicepublic.domen.response.SuccessResponse;
import ru.prizmarine.phraseservicepublic.service.PhraseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class PhraseServiceImpl implements PhraseService {

    @Override
    public ResponseEntity<Response> test() {

 //       return new ResponseEntity<>(SuccessResponse.builder().data("SuccessResponse").build(), HttpStatus.OK);
      return new ResponseEntity<>(ErrorResponse.builder().error(Error.builder().code("VALIDATION_ERROR").message("Ошибка валидации").build()).build(), HttpStatus.BAD_REQUEST);
    }
}
