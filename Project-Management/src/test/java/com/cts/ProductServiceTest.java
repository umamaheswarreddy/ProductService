//package com.cts;
//
//
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.cts.entity.Product;
//import com.cts.repository.ProductManagementRepository;
//
//
//
//
//
//@RunWith(MockitoJUnitRunner.Silent.class)
//public class ProductServiceTest {
//	
//  @Mock
//  private ProductManagementRepository repo;
//  
//  @SuppressWarnings("unchecked")
//  
//  @Test
//	public void getProductsTest() {
//		when(repo.findAll()).thenReturn(Stream
//				.of(new Product(1,"ball","hfisfh",234,23,null),new Product(2,"bat","hgdjghdg",300,24,null))
//				.collect(Collectors.toList()));
//		assertEquals(2,service.getProducts().size());
//		
//	}
//@Test
//public void saveProductTest() {
//	  Product product=new Product(3,"hah","qqqq",500,12,null);
//	  when(repo.save(product)).thenReturn(product);
//	  assertEquals(product,service.addProduct(product));
//}
//
//@Test
//public void updateProductTest() {
//	 Product product=new Product(3,"hah1","qaqa",500,12,null);
//when(repo.save(product)).thenReturn(product);
//	 assertEquals (product,service.updateProduct(product));
//}

//
//@Test
//public void addProductTest() {
//	Product product=new Product(1,"vivo","Description",1500,1,null);
//	Mockito.lenient().when(repo.save(product)).thenReturn(product);
//}
//
//@Test
//public void getProductByIdTest() {
//	Product product=new Product(1,"vivo","Description",1500,1,null);
//	Mockito.lenient().when(repo.findById(1)).thenReturn(Optional.of(product));
//	
//}
//@Test
//public void deleteProduct() {
//	Product product=new Product(1,"vivo","Description",1500,1,null);
//	Mockito.lenient().when(repo.findById(1)).thenReturn(Optional.of(product));
//	
//}
//}
