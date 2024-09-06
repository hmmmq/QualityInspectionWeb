package com.example.demo.controller;
import com.example.demo.entity.CompletionAcceptanceRecord;
import com.example.demo.service.ICompletionAcceptanceRecordService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CompletionAcceptanceRecordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ICompletionAcceptanceRecordService completionAcceptanceRecordService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreate() throws Exception {
        CompletionAcceptanceRecord record = new CompletionAcceptanceRecord();
        when(completionAcceptanceRecordService.save(record)).thenReturn(true);

        mockMvc.perform(post("/completionAcceptanceRecord")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(record)))
                .andExpect(status().isOk());
    }

    @Test
    public void testRead() throws Exception {
        when(completionAcceptanceRecordService.list()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/completionAcceptanceRecord"))
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdate() throws Exception {
        CompletionAcceptanceRecord record = new CompletionAcceptanceRecord();
        record.setRecordId(1);
        when(completionAcceptanceRecordService.updateById(record)).thenReturn(true);

        mockMvc.perform(put("/completionAcceptanceRecord/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(record)))
                .andExpect(status().isOk());
    }

    @Test
    public void testDelete() throws Exception {
        when(completionAcceptanceRecordService.removeById(1L)).thenReturn(true);

        mockMvc.perform(delete("/completionAcceptanceRecord/1"))
                .andExpect(status().isOk());
    }
}