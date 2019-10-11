package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment1")
public class Payment extends AuditModel {
	  @Id
	  @Column(name = "id")
	  private Long id;
	
	@Column(name="txn_type")
	private String txnType;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "remarks")
	private String remarks;
	
	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "mentorId")
    private Mentor mentor;
	
	 
	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "techid")
    private Technologies technologies;
	
	
//	@Column(name = "mentor_id")
//	private Long mentorId;
	
//	@Column(name = "mentor_name")
//	private String mentorName;
	
//	@Column(name = "_id")
//	private Long triningId;
	
//	@Column(name="name")
//	private String skillName;
	
	@Column(name = "total_amount_to_mentor")
	private Float totalAmountToMentor;
	
	

//	public Payment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

//	public Payment(Long id, String txnType, Float amount, String remarks, Long mentorId, String mentorName,
//			Long triningId, String skillName, Float totalAmountToMentor) {
//		super();
//		this.id = id;
//		this.txnType = txnType;
//		this.amount = amount;
//		this.remarks = remarks;
//		this.mentorId = mentorId;
//		this.mentorName = mentorName;
//		this.triningId = triningId;
//		this.skillName = skillName;
//		this.totalAmountToMentor = totalAmountToMentor;
//	}

	
	

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

//	@Override
//	public String toString() {
//		return "Payment [id=" + id + ", txnType=" + txnType + ", amount=" + amount + ", remarks=" + remarks
//				+ ", mentor=" + mentor + ", user=" + user + ", technologies=" + technologies + ", totalAmountToMentor="
//				+ totalAmountToMentor + "]";
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}


	public Technologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

//	public Long getMentorId() {
//		return mentorId;
//	}
//
//	public void setMentorId(Long mentorId) {
//		this.mentorId = mentorId;
//	}
//
//	public String getMentorName() {
//		return mentorName;
//	}
//
//	public void setMentorName(String mentorName) {
//		this.mentorName = mentorName;
//	}
//
//	public Long getTriningId() {
//		return triningId;
//	}
//
//	public void setTriningId(Long triningId) {
//		this.triningId = triningId;
//	}
//
//	public String getSkillName() {
//		return skillName;
//	}
//
//	public void setSkillName(String skillName) {
//		this.skillName = skillName;
//	}

//	public Payment(String txnType, Float amount, String remarks, Long mentorId, String mentorName, Long triningId,
//			String skillName, Float totalAmountToMentor) {
//		super();
//		this.txnType = txnType;
//		this.amount = amount;
//		this.remarks = remarks;
//		this.mentorId = mentorId;
//		this.mentorName = mentorName;
//		this.triningId = triningId;
//		this.skillName = skillName;
//		this.totalAmountToMentor = totalAmountToMentor;
//	}

	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
}
