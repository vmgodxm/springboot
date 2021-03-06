package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Admin;
import com.example.demo.model.LoginInfo;
import com.example.demo.model.ResponseData;
import com.example.demo.repository.interfaces.IAdminRepository;
import com.example.demo.repository.interfaces.IAuthRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@Autowired
	private IAdminRepository adminRepository;

	@Autowired
	private IAuthRepository authRepository;

	@PostMapping(path = "/admin/login")
	public ResponseEntity<ResponseData> loginAdmin(HttpEntity<Admin> httpEntity) throws Exception {

		// 1# : Http 상태를 반환하기 위한 객체
		ResponseEntity<ResponseData> retVal = null;

		// 2# : Controller에서 처리한 데이터를 사용자 정의 형식으로 저장할 객체
		ResponseData responseData = new ResponseData();

		// 3# : SQL 문을 수행한 후 결과 값을 받는다.
		int result = 0;
		Admin admin = httpEntity.getBody();
		try {
			if (admin != null) {
				result = adminRepository.loginAdmin(admin);
			}
		} catch (Exception e) {
			// 3-1# : SQL 문을 수행 중 예외가 발생한다면, 오류로 간주한다.
			// 하지만, 여기서는 adminUserId, password에 해당하는 데이터가 없다는 뜻이므로
			// 예외가 아니라 값이 없다는 뜻으로 해석해야 한다.
			responseData.setIsSuccess(false);
			responseData.setMessage("Not exist adminId");
		}

		// 4# : 처리 결과에 대한 HttpStatus 상태를 정의한다.
		if (result > 0) {
			// 4-1# : result(adminNo) 값이 0 이상 이라면,
			// 로그인 정보가 유효하므로 Http 상태를 정상(Ok, 200)으로 처리한다.

			// 4-2# : 관리자 계정이 로그인 했다는 기록을 남긴다.
			LoginInfo loginInfo = new LoginInfo(admin.getAdminUserId(), "AdminApiKey", 1);
			authRepository.insertAuthentication(loginInfo);

			responseData.setIsSuccess(true);
			retVal = new ResponseEntity<>(responseData, HttpStatus.OK);
		} else {
			// 4-1# : result(adminNo) 값이 0 이하라면,
			// 로그인 정보가 유효하지 않으므로 Http 상태를 데이터가 없음(NotFound, 404)으로 처리한다.
			responseData.setIsSuccess(false);
			retVal = new ResponseEntity<>(responseData, HttpStatus.NOT_FOUND);
		}

		return retVal;
	}

	@PostMapping(path = "/admin/logout")
	public HttpStatus logoutAdmin(HttpEntity<String> httpEntity) throws Exception {

		HttpStatus httpStatus = HttpStatus.OK;
		String adminId = httpEntity.getBody();

		try {
			if (adminId != null) {
				LoginInfo loginInfo = new LoginInfo(adminId, "AdminApiKey", 1);
				authRepository.updateLogout(loginInfo);
			}
		} catch (Exception e) {
			httpStatus = HttpStatus.BAD_GATEWAY;
		}

		return httpStatus;
	}

	@GetMapping(path = "/admin/{adminUserId}")
	public Admin getAdminInfo(@PathVariable String adminUserId) throws Exception {
		Admin admin = adminRepository.getAdminId(adminUserId);
		return admin;
	}

	@GetMapping(path = "/admin")
	public List<Admin> getAdminAll() throws Exception {
		List<Admin> adminList = adminRepository.adminAll();
		return adminList;
	}

	@PostMapping(path = "/admin")
	public int insertAdmin(Admin admin) throws Exception {
		return adminRepository.insertAdmin(admin);
	}

	@DeleteMapping(path = "/admin/{adminUserId}")
	public int deleteAdmin(@PathVariable String adminUserId) throws Exception {
		return adminRepository.deleteAdmin(adminUserId);
	}

	@PutMapping(path = "/admin/{adminUserId}")
	public int updateAdmin(@PathVariable String adminUserId, Admin admin) throws Exception {
		return adminRepository.updateAdmin(admin);
	}
}
