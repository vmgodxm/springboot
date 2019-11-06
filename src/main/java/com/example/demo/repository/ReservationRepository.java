package com.example.demo.repository;

import java.util.List;

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
	public Long getResvation(Long resNo) throws Exception {
		return sqlSessoin.selectOne("mapper.ReservationMapper.getReserviaton",resNo);
	}

	@Override
	public List<Reservation> getResvation() throws Exception {
		return sqlSessoin.selectList("mapper.ReservationMapper.getReserviatonList");
	}
	
	@Override
	public int insertRes(Reservation reservation) throws Exception{
		return sqlSessoin.insert("mapper.ReservationMapper.insertReserviaton",reservation);
	}
	@Override
	public int updateRes(Long resNo) throws Exception{
		return sqlSessoin.update("mapper.ReservationMapper.updateReserviaton",resNo);
	}
	@Override
	public int deleteRes(Long resNo) throws Exception{
		return sqlSessoin.delete("mapper.ReservationMapper.deleteReserviaton",resNo);
	}
	

}
