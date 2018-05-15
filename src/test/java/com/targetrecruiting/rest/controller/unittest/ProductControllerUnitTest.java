package com.targetrecruiting.rest.controller.unittest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.targetrecruiting.rest.controller.ProductController;
import com.targetrecruiting.rest.service.RestClientServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value=ProductController.class,secure=false)
public class ProductControllerUnitTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RestClientServiceImpl client;
	
	

}
