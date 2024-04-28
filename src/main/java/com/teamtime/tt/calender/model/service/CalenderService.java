package com.teamtime.tt.calender.model.service;

import java.util.List;

import com.teamtime.tt.calender.model.dto.Calender;
import com.teamtime.tt.team.model.dto.Team;
import com.teamtime.tt.team.model.dto.UserJoinTeam;
import com.teamtime.tt.team.model.dto.UserTeam;

public interface CalenderService {

	/**
	 * 팀 일정 등록
	 * @param calender
	 * @return int
	 */
	int insertCalender(Calender calender);

	/**
	 * 팀 일정 삭제
	 * @param calenderNo
	 * @return int
	 */
	int deleteByNo(Integer calenderNo);

	/**
	 * 팀 일정 조회
	 * @param teamNo
	 * @return
	 */
	List<Calender> selectTodoByTeam(Integer teamNo);

	/**
	 * 리더 조회
	 * @param teamNo
	 * @return List<Team>
	 */
	List<Team> selectUserByTeam(Integer teamNo);

	/**
	 * 팀원 조회
	 * @param teamNo
	 * @return List<UserTeam>
	 */
	List<UserTeam> selectUsersByTeam(Integer teamNo);

	/**
	 * 일정 조회
	 * @param teamNo
	 * @return
	 */
	List<Calender> selectListByNo(Integer teamNo);
}
