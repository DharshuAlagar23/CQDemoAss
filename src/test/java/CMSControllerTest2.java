/* import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cms.bean.Customer;
import com.cms.controller.CMSController;
import com.cms.dao.CustomerDAO;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CMSController.class)

public class CMSControllerTest2 {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerDAO customerDAO;

	private ObjectMapper objectMapper;

	@BeforeEach
	   public void setup() {
	       objectMapper = new ObjectMapper();
	       mockMvc = MockMvcBuilders.standaloneSetup(new CMSController()).build();
	   }
	

	@Test
	public void testPerformInsert() throws Exception {
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setAddress("123 Main St.");
        customer.setPhoneNumber("555-555-5555");
        customer.setOrderNumber("12345");

        String json = objectMapper.writeValueAsString(customer);

        when(customerDAO.save(customer)).thenReturn(customer);

        mockMvc.perform(post("/PerformInsert")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().json(json));
    }
	
	

}
*/