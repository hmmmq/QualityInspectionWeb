package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "project_id", type = IdType.AUTO)
    private Integer projectId;

    private String projectName;

    private String projectDescription;

    private LocalDate startDate;

    private LocalDate estimatedCompletionDate;

    private String coverageArea;

    private Integer projectStatus;

    private String failReason;

    private String finalSuggestion;
}
