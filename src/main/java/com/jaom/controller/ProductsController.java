package com.jaom.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jaom.entity.ProductCategories;
import com.jaom.entity.Products;
import com.jaom.service.ProductCategoryService;
import com.jaom.service.ProductsService;

@Controller
public class ProductsController {
	
	@Autowired
	ProductsService productService;
	
	@Autowired
	ProductCategoryService prodCatService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping(path = "/products", method = RequestMethod.GET)
	public ModelAndView products() {
		List<Products> listProducts = productService.listAll();
		ModelAndView mav = new ModelAndView("products");
		mav.addObject("listProducts", listProducts);
		return mav;
	}
	
	@RequestMapping(path = "/newproduct")
	public ModelAndView newProduct(Map<String, Object> model) {
		
		List<ProductCategories> prodCatList = prodCatService.listAll();
		Products newProduct = new Products();
		
		ModelAndView mav = new ModelAndView("newproduct");
		mav.addObject("prodCatList", prodCatList);
		mav.addObject("newProduct", newProduct);
		return mav;
	}
	
	@RequestMapping(path = "/newsave", method = RequestMethod.POST )
	public String saveProduct(@ModelAttribute("newProduct") Products newProduct) {
		Date date = new Date();
		Timestamp ts= new Timestamp(date.getTime());
		newProduct.setProductUpdateDate(ts);
		productService.save(newProduct);
		return "redirect:/products";
	}
	
	@RequestMapping(value = "/edit")
	public ModelAndView editProduct(@RequestParam(name = "id") long id) {
		ModelAndView mav = new ModelAndView("editproduct");
		Products product = productService.get(id);
		
		List<ProductCategories> prodCatList = prodCatService.listAll();
		
		mav.addObject("prodCatList", prodCatList);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping(value = "/delete")
	public String deleteProduct(@RequestParam(name = "id") long id) {
		productService.delete(id);
		return "redirect:/products";
	}
	
//	@RequestMapping(value = "/search")
//	public ModelAndView search(@RequestParam String keyword) {
//		List<Customer> result = customerService.search(keyword);
//		ModelAndView mav = new ModelAndView("search");
//		mav.addObject("result", result);
//		return mav;
//	}

}
