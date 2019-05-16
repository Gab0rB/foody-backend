package com.foody.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FoodController{
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping( value = "/food-details")
    public ResponseEntity<Food> getFoodDetails(@RequestParam("id") Integer id) {		
		Food food = foodService.getFood(id);		
        return ResponseEntity.ok().body(food);
    }
	
	@PostMapping( value = "/hello-world")
    public ResponseEntity<String> helloWorldPost(@RequestParam("name") String name) {		
        return ResponseEntity.ok().body("Hello " + name + "! you suck!");
    }	

}
