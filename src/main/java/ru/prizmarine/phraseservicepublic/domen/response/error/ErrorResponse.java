package ru.prizmarine.phraseservicepublic.domen.response.error;

import lombok.Builder;
import lombok.Data;
import ru.prizmarine.phraseservicepublic.domen.response.Response;
import ru.prizmarine.phraseservicepublic.domen.response.error.Error;

@Data
@Builder
public class ErrorResponse implements Response {
    private Error error;
}
