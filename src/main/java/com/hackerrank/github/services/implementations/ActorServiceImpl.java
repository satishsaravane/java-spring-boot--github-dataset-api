package com.hackerrank.github.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.github.enums.ActorsOrdering;
import com.hackerrank.github.model.Actor;
import com.hackerrank.github.repository.ActorRepository;
import com.hackerrank.github.services.ActorService;

@Service
public class ActorServiceImpl implements ActorService {
	
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public List<Actor> getAllActors(ActorsOrdering ordering) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
