package com.example.demo.controller;

import com.example.demo.entity.PreAcceptanceRecord;
import com.example.demo.entity.Project;
import com.example.demo.service.IPreAcceptanceRecordService;
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
@RequestMapping("/preAcceptanceRecord")
public class PreAcceptanceRecordController {

    @Autowired
    private IPreAcceptanceRecordService preAcceptanceRecordService;
    @Autowired
    private IProjectService projectService;


    @PostMapping
    public PreAcceptanceRecord create(@RequestBody PreAcceptanceRecord preAcceptanceRecord) {
        Integer projectId = preAcceptanceRecord.getProjectId();
        if (projectId == null) {
            return null;
        }
        Project project = projectService.getById(projectId);
        if (project == null) {
            return null;
        }
        preAcceptanceRecord.setProjectName(project.getProjectName());
        preAcceptanceRecordService.save(preAcceptanceRecord);
        return preAcceptanceRecord;
    }

    @GetMapping
    public List<PreAcceptanceRecord> read() {
        return preAcceptanceRecordService.list();
    }

    @PutMapping("/{id}")
    public PreAcceptanceRecord update(@PathVariable Long id, @RequestBody PreAcceptanceRecord preAcceptanceRecord) {
        preAcceptanceRecord.setRecordId(Math.toIntExact(id));
        preAcceptanceRecordService.updateById(preAcceptanceRecord);
        return preAcceptanceRecord;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        preAcceptanceRecordService.removeById(id);
    }
}