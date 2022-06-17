package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prodtab")
public class Product {
	@Id
	@Column(name = "pid")
	private Integer prodId;
	@Column(name = "pcode")
	private String prodcode;
	@Column(name = "pcost")
	private Double prodCost;
	@Lob
	@Column(name = "pimage")
	private byte[] proImg;
	@Lob
	@Column(name = "pdesc")
	private char[] prodesc;
	
}
