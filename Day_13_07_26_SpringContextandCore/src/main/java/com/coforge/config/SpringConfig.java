package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.coforge.beans.Laptop;
import com.coforge.beans.Manufacture;

@Configuration
@ComponentScan("com.coforge")
@PropertySource(value = "classpath:info.properties")
public class SpringConfig {
//	@Bean("lap")
//	public Laptop getLaptop()
//	{
//		return new Laptop("Apple",100000,"512GB","2TB", "40GB", "Black",getManufactureInfo());
//		
//	}
//	@Bean("man")
//	public Manufacture getManufactureInfo()
//	{
//		return new Manufacture(654784,"Devesh","Bihar");
//	}
}
