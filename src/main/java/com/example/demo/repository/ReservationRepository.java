package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.CustomerReservation;
import com.example.demo.model.Reservation;
import com.example.demo.model.ReservationSelector;
import com.example.demo.model.UserReservation;
import com.example.demo.repository.interfaces.IReservationRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository implements IReservationRepository {

	@Autowired
	private SqlSession sqlSessoin;

	@Override
	public List<CustomerReservation> getReservationCollectionSelectionMonth(ReservationSelector selector)
			throws Exception {
		return sqlSessoin.selectList("mapper.ReservationMapper.getReservationCollectionSelectionMonth", selector);
	}

	@Override
	public List<CustomerReservation> getReservationCollectionSelectionDate(Reservation reservation) throws Exception {
		return sqlSessoin.selectList("mapper.ReservationMapper.getReservationCollectionSelectionDate", reservation);
	}

	@Override
	public Reservation getReservation(String userId) throws Exception {
		return sqlSessoin.selectOne("mapper.ReservationMapper.getReserviatonAsOnlyUser", userId);
	}

	@Override
	public UserReservation getUserReservation(String userId) throws Exception {
		return sqlSessoin.selectOne("mapper.ReservationMapper.getReserviatonAsUserMyPage", userId);
	}

	@Override
	public int insertReservation(Reservation reservation) throws Exception {
		return sqlSessoin.insert("mapper.ReservationMapper.insertReserviaton", reservation);
	}

	@Override
	public int updateReservation(Long resNo) throws Exception {
		return sqlSessoin.update("mapper.ReservationMapper.updateReservationAsUseComplete", resNo);
	}

	@Override
	public int deleteReservation(Long resNo) throws Exception {
		return sqlSessoin.delete("mapper.ReservationMapper.deleteReserviaton", resNo);
	}

	@Override
	public String checkReservation(String userId) throws Exception {
		return sqlSessoin.selectOne("mapper.ReservationMapper.checkReservation", userId);
	}

	
}
