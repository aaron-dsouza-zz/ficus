package org.aaron.ficus.controller;

import org.aaron.ficus.model.MoistureSample;
import org.aaron.ficus.service.DataLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataLogService dataLogService;

    public DataController(DataLogService dataLogService) {
        this.dataLogService = dataLogService;
    }

    @RequestMapping(value = "moisture/log", method = RequestMethod.POST)
    public ResponseEntity logMoisture(@RequestBody MoistureSample moistureSample) {
        dataLogService.logData(moistureSample);
        return ResponseEntity.ok("Data logged");
    }
}
