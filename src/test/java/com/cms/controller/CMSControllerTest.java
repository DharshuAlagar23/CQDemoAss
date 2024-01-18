/*package com.cms.controller;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;



public class CMSControllerTest {

	@Autowired
	 CustomerDAO dao;

	
	private Customer customer;
	
	 @Before
	    public void setUp() throws Exception {
	        // Code executed before each test method
	        customer = new Customer();
	        customer.setId(125);
	        customer.setName("GOD FATHER");
	        customer.setType("Thriller");
	        customer.setLanguage("English");
	        customer.setDuration("2hrs");
	    }

	    @Test
	    public void testPerformInsert() {
	        // Test if the movie object is saved to the database
	        dao.save(movie);
	        assertNotNull(movie.getId());
	    }

	    @Test
	    public void testGetAll() {
	        // Test if the getAll() method returns a list of movies
	        List<Movie> movies = (List<Movie>) dao.findAll();
	        assertNotNull(movies);
	    }

	    @Test
	    public void testPerformUpdate() {
	        // Test if the movie object is updated in the database
	        dao.save(movie);
	        movie.setDuration("2hrs");
	        dao.save(movie);
	        Movie updatedMovie = dao.findById(movie.getId()).orElse(null);
	        assertEquals(updatedMovie.getDuration(), "2hrs");
	    }

	    @Test
	    public void testPerformDelete() {
	        // Test if the movie object is deleted from the database
	        dao.save(movie);
	        dao.deleteById(movie.getId());
	        Movie deletedMovie = dao.findById(movie.getId()).orElse(null);
	        assertEquals(deletedMovie, null);
	    }

}
*/