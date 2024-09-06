package com.example.demo.controller;

import com.example.demo.dto.ProcessDTO;
import com.example.demo.entity.Process;
import com.example.demo.entity.Project;
import com.example.demo.service.IProcessService;
import com.example.demo.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxx
 * @since 2024-09-03
 */
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private IProcessService processService;
    @Autowired
    private IProjectService projectService;

    @PostMapping
    public Process create(@RequestBody Process process) {
        Integer projectId = process.getProjectId();
        if (projectId == null) {
            return null;
        }
        Project project = projectService.getById(projectId);
        if (project == null) {
            return null;
        }
        process.setStatus(0);
        process.setProjectName(project.getProjectName());
        process.setProjectDescription(project.getProjectDescription());
        process.setCoverageArea(project.getCoverageArea());
        process.setEstimatedCompletionDate(project.getEstimatedCompletionDate());
        process.setStartDate(project.getStartDate());
        processService.save(process);
        return process;
    }

    @GetMapping
    public List<Process> read() {
        return processService.list();
    }

    @PutMapping("/dto/{id}")
    public Process update(@PathVariable Long id, @RequestBody ProcessDTO processdto) {
        processdto.setProcessId(Math.toIntExact(id));
        Process process = new Process();
        process.setProcessId(processdto.getProcessId());
        process.setProcessName(processdto.getProcessName());
        process.setProcessDescription(processdto.getProcessDescription());
        process.setStatus(0);
        process.setResponsiblePerson(processdto.getResponsiblePerson());
        process.setFailReason(processdto.getFailReason());
        process.setDocumentPath(processdto.getDocumentPath());
        process.setProjectId(processdto.getProjectId());
        process.setProjectName(processdto.getProjectName());
        process.setProjectDescription(processdto.getProjectDescription());
        process.setStartDate(processdto.getStartDate());
        process.setEstimatedCompletionDate(processdto.getEstimatedCompletionDate());
        process.setCoverageArea(processdto.getCoverageArea());
        processService.updateById(process);
        return process;
    }

    @PutMapping("/{id}")
    public Process update(@PathVariable Long id, @RequestBody Process process) {
        process.setProcessId(Math.toIntExact(id));
        processService.updateById(process);
        return process;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        processService.removeById(id);
    }
}