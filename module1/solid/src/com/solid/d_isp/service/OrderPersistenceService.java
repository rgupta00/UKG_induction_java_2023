package com.solid.d_isp.service;

import com.solid.d_isp.entity.Entity;

import java.util.List;


public class OrderPersistenceService implements PersistenceService {

	@Override
	public void save(Entity entity) {
		//ok
	}

	@Override
	public void delete(Entity entity) {
		//ok
	}

	@Override
	public Entity findById(Long id) {
		//ok
		return null;
	}

	@Override
	public List findByName(String name) {
		throw new UnsupportedOperationException();
	}

	

}
