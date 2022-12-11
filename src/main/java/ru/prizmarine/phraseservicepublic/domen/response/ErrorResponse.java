package ru.prizmarine.phraseservicepublic.domen.response;

import lombok.Builder;
import lombok.Data;
import ru.prizmarine.phraseservicepublic.domen.response.Error;

@Data
@Builder
public class ErrorResponse implements Response {
    private Error error;
}
