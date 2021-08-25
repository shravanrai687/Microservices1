package com.s2.price.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="db_sequence")
public class DbSequence {

	@Id
	private String id;
	private int seq;
	public DbSequence() {
		super();
	}
	public DbSequence(String id, int seqNo) {
		super();
		this.id = id;
		this.seq = seqNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seqNo) {
		this.seq = seqNo;
	}
	@Override
	public String toString() {
		return "DbSequence [id=" + id + ", seq=" + seq + "]";
	}
}
