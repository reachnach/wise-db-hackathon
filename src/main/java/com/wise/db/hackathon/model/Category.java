package com.wise.db.hackathon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Category implements Serializable {

	private static final long serialVersionUID = 9204094387225872343L;

	@Id
	private Integer id;

	private String name;

	@Transient
	protected Collection<Quizes> quizes;

	/*
	 * @OneToMany(mappedBy = "category", fetch = FetchType.LAZY) private
	 * List<Quizes> quizes = new ArrayList<>();
	 */

	public Collection<Quizes> getQuizes() {
		return quizes;
	}

	public void setQuizes(Collection<Quizes> quizes) {
		this.quizes = quizes;
	}

	public Category() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
