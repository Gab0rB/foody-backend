package com.foody.food;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Food {
	
	private Integer id;
	private String name;
	private ValueUnit carbs;
	private ValueUnit protein;
	private ValueUnit fat;
	private ValueUnit vitaminA;
	private ValueUnit vitaminB;
	private ValueUnit vitaminC;
	private ValueUnit magnesium;
	private ValueUnit potassium;
	private ValueUnit calcium;

}
