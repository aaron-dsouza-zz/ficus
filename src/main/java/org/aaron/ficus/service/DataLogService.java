package org.aaron.ficus.service;

import lombok.extern.slf4j.Slf4j;
import org.aaron.ficus.model.MoistureSample;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataLogService {
    public void logData(MoistureSample moistureSample) {
      log.info("Moisture reading: "+moistureSample);
    }
}
