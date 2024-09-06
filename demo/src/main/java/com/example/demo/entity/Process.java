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
public class Process implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "process_id", type = IdType.AUTO)
    private Integer processId;

    private String processName;

    private String processDescription;

    private Integer status;

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
