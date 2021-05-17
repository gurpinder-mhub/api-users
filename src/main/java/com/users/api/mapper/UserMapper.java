package com.users.api.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.users.api.model.User;

public class UserMapper {

	public List<Map<String, Object>> toSummary(List<User> entities) {
		List<Map<String, Object>> items = new ArrayList<>();
		for(User entity : entities) {
			Map<String, Object> model = new HashMap<>();
			model.put("email", entity.getEmail());
			model.put("username", entity.getUsername());
			model.put("ip", entity.getIp());
			items.add(model);
		}
		return items;
	}
	
	

}
