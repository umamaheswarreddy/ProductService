//package com.cts;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.cts.entity.Product;
//import org.springframework.test.context.junit4.SpringRunner;
//import com.cts.repository.ProductManagementRepository;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class ProductRepositoryTest {
//	@MockBean
//	private ProductManagementRepository repo;
//
//	@Test
//	public void findByTest() {
//		Product product=new Product(1,"Name","Description",1500,1,null);
//		when( repo.findById(1)).thenReturn(Optional.of(product));
//
//
//	}
//	@SuppressWarnings("unchecked")
//	@Test
//	public void findallTest() {
//	@SuppressWarnings("rawtypes")
//	List product=new LinkedList();
//		 product.add(new Product(1,"Name","Description",1500,1,null));
//		 product.add(new Product(10,"PName","PDescription",1500,1,null));
//		when( repo.findAll()).thenReturn(product);
//		List result=(List) repo.findAll();
//		verify(repo).findAll();
//		assertEquals(2,product.size());
//
//
//	}
//
//}
//
//
//
