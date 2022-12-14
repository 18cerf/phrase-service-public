package ru.prizmarine.phraseservicepublic.domen.response.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import ru.prizmarine.phraseservicepublic.domen.constant.Code;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
    private Code code;
    private String message;
}
