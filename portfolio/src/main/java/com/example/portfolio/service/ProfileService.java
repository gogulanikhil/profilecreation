package com.example.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.portfolio.model.Profile;
import com.example.portfolio.repository.JpaRepository;

@Service
public class ProfileService {	
	
	private final JpaRepository jpaRepository;
	public ProfileService(JpaRepository jpaRepository) {
		this.jpaRepository=jpaRepository;
	}
	public Profile create(Profile profile ) {
		return jpaRepository.save(profile);
	}
	public List<Profile> getAll() {
		return jpaRepository.findAll();		
	}
	public Profile update(String id, Profile profile) {
		Optional<Profile> store=jpaRepository.findById(id);
		if (!store.isPresent()) {
			throw new RuntimeException("no value");
		}
		Profile existingProfile=store.get();
		if(profile.getName()!=null && !profile.getName().isEmpty()) {
			existingProfile.setName(profile.getName());
		}
		if(profile.getAbout()!=null && !profile.getAbout().isEmpty()) {
			existingProfile.setAbout(profile.getAbout());
		}
		if (profile.getName()!=null && !profile.getName().isEmpty()) {
			existingProfile.setName(profile.getName());
		}
		if (profile.getStatus()!=null && !profile.getStatus().isEmpty()) {
			existingProfile.setStatus(profile.getStatus());
		}
		if (profile.getSkills()!=null && !profile.getSkills().isEmpty()) {
			existingProfile.setSkills(profile.getSkills());
		}
		return jpaRepository.save(existingProfile) ;
	}
	public Profile delete(String id) {
		Optional<Profile> optinalProfile =  jpaRepository.findById(id);
		if (optinalProfile.isPresent()) {			
			jpaRepository.deleteById(id);
		}
		return optinalProfile.get();
	}
}
