package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class ProjectDTO {
    private Integer projectId;

    private String projectName;

    private String projectDescription;

    private LocalDate startDate;

    private LocalDate estimatedCompletionDate;

    private String coverageArea;

    private String projectStatus;

    private String failReason;

    private String finalSuggestion;
}
