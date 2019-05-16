package com.cleancode.demo.controller;

import com.cleancode.demo.dto.Speaker;
import com.cleancode.demo.service.RegisterSpeaker;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class SpeakerController {

    private RegisterSpeaker registerSpeaker;

    private static final String SUCCESS = "Speaker registered succesfully!";
    private static final String NOT_VALID = "Speaker information not valid";

    @Inject
    public SpeakerController(RegisterSpeaker registerSpeaker) {
        this.registerSpeaker = registerSpeaker;
    }

    @RequestMapping(value = "/speaker", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<DataResponse> sightSpeaker(@RequestBody @Valid final Speaker speaker) {

        DataResponse dataResponse = new DataResponse();
        ResponseEntity<DataResponse> response = null;

        try {

            dataResponse.setStatus(HttpStatus.OK.value());
            Boolean isRegistrationOK = registerSpeaker.registerAndValidateSpeaker(speaker);
            dataResponse.setData(isRegistrationOK ? SUCCESS : NOT_VALID);
            response = new ResponseEntity<>(dataResponse, HttpStatus.OK);

        } catch (Exception e) {
            dataResponse.setData("Error");
            response = new ResponseEntity<>(dataResponse, HttpStatus.BAD_REQUEST);

        } finally {
            return response;
        }


    }
}
