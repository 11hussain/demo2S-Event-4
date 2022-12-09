/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT CARE
 *
 */
@RestController
@RequestMapping("/api")
public class MergeController {
	
	@GetMapping("/getInfo")
	public String getInformation()
	{
		return "Test the RestController";
	}

}
