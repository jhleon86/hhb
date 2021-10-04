package com.boot.dao;

import java.util.HashMap;
import java.util.List;

import com.boot.dto.CountryDTO;

public interface CountryDAO {
	List<CountryDTO> selectCountries(HashMap<String,Object> paramMap) throws Exception;
}
