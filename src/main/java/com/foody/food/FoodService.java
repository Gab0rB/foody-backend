package com.foody.food;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	public Food getFood(Integer id) {
		Food food = new Food();	
		food.setId(id);
		food.setName("Backend food");
		food.setCarbs(new ValueUnit(20.0, Units.KILOGRAMM));
		food.setProtein(new ValueUnit(10.0, Units.MIKROGRAMM));
		food.setFat(new ValueUnit(8.0, Units.GRAMM));
		food.setVitaminA(new ValueUnit(13.0, Units.MILLIGRAMM));
		food.setVitaminB(new ValueUnit(86.0, Units.GRAMM));
		food.setVitaminC(new ValueUnit(45.0, Units.MIKROGRAMM));
		food.setMagnesium(new ValueUnit(75.0, Units.MILLIGRAMM));
		food.setPotassium(new ValueUnit(96.0, Units.GRAMM));
		food.setCalcium(new ValueUnit(4.0, Units.MIKROGRAMM));
		return food;
	}
	
}
