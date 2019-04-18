package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.entity.Admin;
import hello.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
    private AdminRepository adminRepository;

	@Override
	public List<Admin> LayAll() {
		return adminRepository.LayAll();
	}
}
