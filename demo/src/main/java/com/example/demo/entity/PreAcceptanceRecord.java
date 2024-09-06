package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("pre_acceptance_record")
public class PreAcceptanceRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;

    private Integer projectId;

    private String projectName;

    private String projectLocation;

    private String constructingUnit;

    private String constructionUnit;

    private String supervisionUnit;

    private String designUnit;

    private String scaleDescription;

    private BigDecimal buildingArea;

    private Integer numberOfFloors;

    private LocalDate startDate;

    private LocalDate completionDate;

    private Integer mainStructureStatus;

    private String mainStructureReason;

    private Integer decorationStatus;

    private String decorationReason;

    private Integer roofingStatus;

    private String roofingReason;

    private Integer plumbingInstallationStatus;

    private String plumbingInstallationReason;

    private Integer sanitaryFixturesStatus;

    private String sanitaryFixturesReason;

    private Integer electricalWiringStatus;

    private String electricalWiringReason;

    private Integer distributionBoxStatus;

    private String distributionBoxReason;

    private Integer ventilationDuctStatus;

    private String ventilationDuctReason;

    private Integer airConditioningStatus;

    private String airConditioningReason;

    private Integer overallQualityStatus;

    private String overallQualityReason;

    private Integer documentationCompletenessStatus;

    private String documentationCompletenessReason;

    private Integer preAcceptanceConclusionStatus;

    private String issuesDescription;

    private String rectificationRequirements;

    private LocalDate rectificationDeadline;

    private String responsiblePerson;

    private String constructionUnitSignature;

    private String supervisionUnitSignature;

    private String constructingUnitSignature;

    private String designUnitSignature;

    private LocalDate acceptanceDate;
}
