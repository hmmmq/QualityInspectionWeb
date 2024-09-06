package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xxx
 * @since 2024-09-03
 */
@Getter
@Setter
@TableName("completion_acceptance_record")
public class CompletionAcceptanceRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;

    private Integer projectId;

    private String projectName;

    private String structureType;

    private String numberOfFloorsArea;

    private String constructionUnit;

    private String technicalDirector;

    private LocalDate startDate;

    private String projectManager;

    private String projectTechnicalDirector;

    private LocalDate completionDate;

    private String subdivisionAcceptance;

    private String qualityControlData;

    private String safetyFunctionCheck;

    private String appearanceQuality;

    private Integer subdivisionAcceptanceStatus;

    private Integer qualityControlDataStatus;

    private Integer safetyFunctionCheckStatus;

    private Integer appearanceQualityStatus;

    private String constructingUnit;

    private String supervisionUnit;

    private String constructionUnit2;

    private String designUnit;

    private String surveyUnit;

    private String constructionUnitSignature;

    private LocalDate constructionUnitSignatureDate;

    private String supervisionUnitSignature;

    private LocalDate supervisionUnitSignatureDate;

    private String conclusion;
}
