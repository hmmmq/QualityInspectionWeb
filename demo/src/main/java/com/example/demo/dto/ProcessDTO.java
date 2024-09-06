package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class ProcessDTO {
    private Integer processId;

    private String processName;

    private String processDescription;

    private String status;

    private String responsiblePerson;

    private String failReason;

    private String documentPath;

    private Integer projectId;

    private String projectName;

    private String projectDescription;

    private LocalDate startDate;

    private LocalDate estimatedCompletionDate;

    private String coverageArea;
}
