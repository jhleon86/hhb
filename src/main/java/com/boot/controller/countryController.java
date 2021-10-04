package com.boot.controller;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.CountryDAO;
import com.boot.dto.CountryDTO;

@Controller
@MapperScan(basePackages="com.boot.dao")
public class countryController {

	@Autowired
	private CountryDAO countryDAO;
	
	@RequestMapping("/country")
	public String country(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
		final List<CountryDTO> countryList = countryDAO.selectCountries(paramMap);
		model.addAttribute("list", countryList);
		return "country";
	}
	
	@RequestMapping("/countryDelete")
	public String countryDelete(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
		
		//countryDAO.selectCountries(paramMap);
	 
		return "country";
	}
	
	
	@ResponseBody
	@RequestMapping("/ajax/countries")
	public HashMap<String,Object> ajaxCountry(@RequestParam HashMap<String,Object> paramMap) throws Exception {  
		final List<CountryDTO> countryList = countryDAO.selectCountries(paramMap);
		
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("countryList", countryList);
		
		return resultMap;
	}
}
