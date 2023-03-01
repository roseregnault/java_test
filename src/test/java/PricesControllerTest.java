import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test1() throws Exception {
        mockMvc.perform(get("/prices")
                        .param("start_date", "2023-03-14T10:00:00Z")
                        .param("product_id", "35455")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.product_id").value("35455"))
                .andExpect(jsonPath("$.brand_id").value("1"))
                .andExpect(jsonPath("$.price_list").value("35.50"))
                .andExpect(jsonPath("$.price").value("39.95"));
    }

    @Test
    public void test2() throws Exception {
        mockMvc.perform(get("/prices")
                        .param("start_date", "2023-03-14T16:00:00Z")
                        .param("product_id", "35455")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.product_id").value("35455"))
                .andExpect(jsonPath("$.brand_id").value("1"))
                .andExpect(jsonPath("$.price_list").value("25.45"))
                .andExpect(jsonPath("$.price").value("28.95"));
    }

    @Test
    public void test3() throws Exception {
        mockMvc.perform(get("/prices")
                        .param("start_date", "2023-03-14T21:00:00Z")
                        .param("product_id", "35455")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.product_id").value("35455"))
                .andExpect(jsonPath("$.brand_id").value("1"))
                .andExpect(jsonPath("$.price_list").value("25.45"))
                .andExpect(jsonPath("$.price").value("28.95"));
    }

    @Test
    public void test4() throws Exception {
        mockMvc.perform(get("/prices")
                        .param("start_date", "2023-03-15T10:00:00Z")
                        .param("product_id", "35455")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.product_id").value("35455"))
                .andExpect(jsonPath("$.brand_id").value("1"))
                .andExpect(jsonPath("$.price_list").value("25.45"))
                .andExpect(jsonPath("$.price").value("28.95"));
    }

    @Test
    public void test5() throws Exception {
        mockMvc.perform(get("/prices")
                        .param("start_date", "2023-03-16T21:00:00Z")
                        .param("product_id", "35455")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.product_id").value("35455"))
                .andExpect(jsonPath("$.brand_id").value("1"))
                .andExpect(jsonPath("$.price_list").value("25.45"))
                .andExpect(jsonPath("$.price").value("28.95"));
    }
}
