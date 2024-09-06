package com.example.demo.controller;

import com.example.demo.dto.ProjectDTO;
import com.example.demo.entity.Inspection;
import com.example.demo.entity.Project;
import com.example.demo.service.IInspectionService;
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
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    @Autowired
    private IInspectionService inspectionService;

    @PostMapping
    public Project create(@RequestBody Project project) {
        project.setProjectStatus(0);
        projectService.save(project);
        Inspection inspection = new Inspection();
        inspection.setProjectId(project.getProjectId());
        inspection.setProjectName(project.getProjectName());
        inspection.setProjectDescription(project.getProjectDescription());
        inspection.setInspector("暂无");
        inspection.setStandard1Status(0);
        inspection.setStandard2Status(0);
        inspection.setStandard3Status(0);
        inspection.setStandard4Status(0);
        inspection.setStandard5Status(0);
        inspection.setStandard6Status(0);
        inspection.setStandard7Status(0);
        inspection.setStandard8Status(0);
        inspection.setStandard9Status(0);
        inspectionService.save(inspection);
        return project;
    }

    @GetMapping
    public List<Project> read() {
        return projectService.list();
    }

    @PutMapping("/dto/{id}")
    public Project update(@PathVariable Long id, @RequestBody ProjectDTO projectdto) {
        Project project = new Project();
        project.setProjectName(projectdto.getProjectName());
        project.setProjectDescription(projectdto.getProjectDescription());
        project.setStartDate(projectdto.getStartDate());
        project.setEstimatedCompletionDate(projectdto.getEstimatedCompletionDate());
        project.setCoverageArea(projectdto.getCoverageArea());
        project.setProjectStatus(0);
        project.setFailReason(projectdto.getFailReason());
        project.setFinalSuggestion(projectdto.getFinalSuggestion());
        project.setProjectId(Math.toIntExact(id));
        projectService.updateById(project);
        return project;
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable Long id, @RequestBody Project project) {
        project.setProjectId(Math.toIntExact(id));
        projectService.updateById(project);
        return project;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectService.removeById(id);
    }
}