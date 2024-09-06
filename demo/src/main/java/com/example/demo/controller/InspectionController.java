package com.example.demo.controller;

import com.example.demo.entity.Inspection;
import com.example.demo.service.IInspectionService;
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
@RequestMapping("/inspection")
public class InspectionController {

    @Autowired
    private IInspectionService inspectionService;

    @PostMapping
    public Inspection create(@RequestBody Inspection inspection) {
        inspectionService.save(inspection);
        return inspection;
    }

    @GetMapping
    public List<Inspection> read() {
        return inspectionService.list();
    }

    @PutMapping("/{id}")
    public Inspection update(@PathVariable Long id, @RequestBody Inspection inspection) {
        inspection.setInspectionId(Math.toIntExact(id));
        inspectionService.updateById(inspection);
        return inspection;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        inspectionService.removeById(id);
    }
}