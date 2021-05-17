package com.users.api;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.users.api.mapper.RespMapper;
import com.users.api.mapper.UserMapper;
import com.users.api.model.User;
import com.users.api.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("users")
	public ResponseEntity<Object> search() {
		RespMapper respMapper = new RespMapper();
		List<User> entities = service.search();
		if (entities.size() == 0) {
			return respMapper.toError("no users found");
		} else {
			UserMapper mapper = new UserMapper();
			return respMapper.toSuccessItems(mapper.toSummary(entities));
		}
	}

}
