package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reservation;
import com.example.demo.repository.interfaces.IReservationRepository;

@Repository
public class ReservationRepository implements IReservationRepository {

	@Autowired
	private SqlSession sqlSessoin;
	
	@Override
	public Reservation getResvation(Long resNo) throws Exception {
		return sqlSessoin.selectOne("mapper.ReservationMapper.getReserviaton",resNo);
	}
	

}
