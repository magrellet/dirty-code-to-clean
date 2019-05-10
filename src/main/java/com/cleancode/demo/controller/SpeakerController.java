package com.cleancode.demo.controller;

import com.cleancode.demo.dto.Speaker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class SpeakerController {

    @RequestMapping(value = "/speaker", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<DataResponse> sightSpeaker(@RequestBody @Valid final Speaker speaker) {

        DataResponse dataResponse = new DataResponse();
        ResponseEntity<DataResponse> response = null;

        try {

            dataResponse.setStatus(HttpStatus.OK.value());

            response = new ResponseEntity<>(dataResponse, HttpStatus.OK);

        } catch (Exception e) {
            response = new ResponseEntity<>(dataResponse, HttpStatus.BAD_REQUEST);

        } finally {
            return response;
        }


    }
}
