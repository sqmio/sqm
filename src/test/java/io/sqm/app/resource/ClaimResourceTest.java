package io.sqm.app.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.service.ClaimService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class ClaimResourceTest {

    private MockMvc mockMvc;

    @Mock
    private ClaimService claimService;

    @InjectMocks
    private ClaimResource claimResource;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(claimResource)
                .build();
    }

    @Test
    public void claims() throws Exception {
        when(claimService.getAll()).thenReturn(Collections.EMPTY_LIST);
        List<Claim> claims = claimResource.claims();
        verify(claimService).getAll();

        mockMvc.perform(MockMvcRequestBuilders.get("/api/claims"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    public void claim() {
    }

    @Test
    public void createClaim() {
    }

    @After
    public void tearDown() throws Exception {
    }
}