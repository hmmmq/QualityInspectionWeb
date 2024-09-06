package com.example.demo.controller;

import com.example.demo.entity.CompletionAcceptanceRecord;
import com.example.demo.entity.Project;
import com.example.demo.service.ICompletionAcceptanceRecordService;
import com.example.demo.service.IProjectService;
import com.example.demo.service.impl.CompletionAcceptanceRecordServiceImpl;
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
@RequestMapping("/completionAcceptanceRecord")
public class CompletionAcceptanceRecordController {

    @Autowired
    private ICompletionAcceptanceRecordService completionAcceptanceRecordService;
    @Autowired
    private IProjectService projectService;


    @PostMapping
    public CompletionAcceptanceRecord create(@RequestBody CompletionAcceptanceRecord completionAcceptanceRecord) {
        Integer projectId = completionAcceptanceRecord.getProjectId();
        if (projectId == null) {
            return null;
        }
        Project project = projectService.getById(projectId);
        if (project == null) {
            return null;
        }
        completionAcceptanceRecord.setProjectName(project.getProjectName());
        completionAcceptanceRecordService.save(completionAcceptanceRecord);
        return completionAcceptanceRecord;
    }

    @GetMapping
    public List<CompletionAcceptanceRecord> read() {
        return completionAcceptanceRecordService.list();
    }

    @PutMapping("/{id}")
    public CompletionAcceptanceRecord update(@PathVariable Long id, @RequestBody CompletionAcceptanceRecord completionAcceptanceRecord) {
        completionAcceptanceRecord.setRecordId(Math.toIntExact(id));
        completionAcceptanceRecordService.updateById(completionAcceptanceRecord);
        return completionAcceptanceRecord;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        completionAcceptanceRecordService.removeById(id);
    }
}