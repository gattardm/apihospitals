package org.medhead.emergencysystem.apihospitals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HospitalsAPITest {

    @Autowired
    public MockMvc mockMvc;

    @Test
    public void testConnexion() throws Exception {
        mockMvc.perform(get("/hospitals")).andExpect(status().isOk());
    }

    @Test
    public void testGetHospital1Creation() throws Exception {
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].name", is("Hopital 1")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].longitude", is("-10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].latitude", is("10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].bedsQuantity", is("1000")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].bedsAvailable", is("100")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[0].speciality", is("Anaesthetics")));
    }

    @Test
    public void testGetHospital2Creation() throws Exception {
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].name", is("Hopital 2")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].longitude", is("10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].latitude", is("10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].bedsQuantity", is("2000")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].bedsAvailable", is("200")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[1].speciality", is("Intensive care medicine")));
    }

    @Test
    public void testGetHospital3Creation() throws Exception {
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].name", is("Hopital 3")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].longitude", is("10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].latitude", is("-10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].bedsQuantity", is("3000")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].bedsAvailable", is("300")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[2].speciality", is("Additional dental specialities")));
    }

    @Test
    public void testGetHospital4Creation() throws Exception {
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].name", is("Hopital 4")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].longitude", is("-10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].latitude", is("-10")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].bedsQuantity", is("4000")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].bedsAvailable", is("400")));
        mockMvc.perform(get("/hospitals")).andExpect(jsonPath("$[3].speciality", is("Oral and maxillofacial surgery")));
    }
}