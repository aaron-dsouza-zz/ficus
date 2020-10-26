package org.aaron.ficus.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class MoistureSample {
    private Date timestamp;
    private float moistureReading;
}
