package com.example.portfolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.model.Profile;
import com.example.portfolio.service.ProfileService;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {
	
	private final ProfileService profileService;
	public ProfileController(ProfileService profileService) {
		this.profileService=profileService;
	}
	@GetMapping("/get")
	
	public List<Profile> get() {
		return profileService.getAll();
	}
	@PostMapping("/create")
	public void create(@RequestBody Profile profile) {
		profileService.create(profile);
	} 
	@PutMapping("/update/{id}")
	public Profile update(@PathVariable(value = "id")String id, @RequestBody Profile profile){
		return profileService.update(id,profile);
	}
	@DeleteMapping("/delete/{id}")
	public Profile delete(@PathVariable(value="id")String id) {
		return profileService.delete(id);
	}
}
