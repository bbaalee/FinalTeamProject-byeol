package com.myweb.www.service;

<<<<<<< HEAD
import java.util.List;

import com.myweb.www.domain.ApprovalDTO;
import com.myweb.www.domain.ApprovalVO;

import com.myweb.www.domain.PagingVO;
import com.myweb.www.domain.RequestVO;
import com.myweb.www.security.MemberVO;

public interface ApprovalService {

	boolean approval_club(ApprovalVO avo);

	Long approvalExist(ApprovalVO avo);


//동호회 관련
	List<RequestVO>getList_club(ApprovalDTO approvalDTO);

	int getTotalCount_club(PagingVO pagingVO);

	


=======
public interface ApprovalService {

>>>>>>> 6d101762b9898b4588d6b29245d870cd26a20ac5
}
