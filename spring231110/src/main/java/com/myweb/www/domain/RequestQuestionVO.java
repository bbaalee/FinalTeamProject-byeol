package com.myweb.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
<<<<<<<< HEAD:spring231110/src/main/java/com/myweb/www/domain/RequestQuestionVO.java
public class RequestQuestionVO {
	private long requestQuestionId;
	private String subject;
	private String questionType;
	private String region;

========
public class ApprovalVO {
	private long appr_no; //���ι�ȣ
	private long vaca_no; //�ް���ȣ
	private String car_no; //������ȣ
	private long emp_no; //���
	private boolean true_or_not; //Ȯ�� ����
>>>>>>>> 6d101762b9898b4588d6b29245d870cd26a20ac5:spring231110/src/main/java/com/myweb/www/domain/ApprovalVO.java
}
