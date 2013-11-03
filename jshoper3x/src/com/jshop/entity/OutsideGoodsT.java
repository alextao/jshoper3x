package com.jshop.entity;

// Generated 2013-11-3 11:06:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OutsideGoodsT generated by hbm2java
 */
@Entity
@Table(name = "outside_goods_t", catalog = "jshoper3")
public class OutsideGoodsT implements java.io.Serializable {

	private String id;
	private String goodsname;
	private String nname;
	private String lname;
	private String sname;
	private String fname;
	private String navid;
	private String ltypeid;
	private String stypeid;
	private String pictureurl;
	private String salestate;
	private int sort;
	private String linkUrl;
	private Date createtime;
	private String creatorid;
	private Date updatetime;
	private Integer versiont;

	public OutsideGoodsT() {
	}

	public OutsideGoodsT(String id, String goodsname, String nname,
			String lname, String sname, String fname, String navid,
			String ltypeid, String stypeid, String pictureurl,
			String salestate, int sort, String linkUrl, Date createtime,
			String creatorid, Date updatetime) {
		this.id = id;
		this.goodsname = goodsname;
		this.nname = nname;
		this.lname = lname;
		this.sname = sname;
		this.fname = fname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.stypeid = stypeid;
		this.pictureurl = pictureurl;
		this.salestate = salestate;
		this.sort = sort;
		this.linkUrl = linkUrl;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.updatetime = updatetime;
	}

	public OutsideGoodsT(String id, String goodsname, String nname,
			String lname, String sname, String fname, String navid,
			String ltypeid, String stypeid, String pictureurl,
			String salestate, int sort, String linkUrl, Date createtime,
			String creatorid, Date updatetime, Integer versiont) {
		this.id = id;
		this.goodsname = goodsname;
		this.nname = nname;
		this.lname = lname;
		this.sname = sname;
		this.fname = fname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.stypeid = stypeid;
		this.pictureurl = pictureurl;
		this.salestate = salestate;
		this.sort = sort;
		this.linkUrl = linkUrl;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "NNAME", nullable = false, length = 50)
	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Column(name = "LNAME", nullable = false, length = 50)
	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "SNAME", nullable = false, length = 50)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "FNAME", nullable = false, length = 50)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "NAVID", nullable = false, length = 20)
	public String getNavid() {
		return this.navid;
	}

	public void setNavid(String navid) {
		this.navid = navid;
	}

	@Column(name = "LTYPEID", nullable = false, length = 20)
	public String getLtypeid() {
		return this.ltypeid;
	}

	public void setLtypeid(String ltypeid) {
		this.ltypeid = ltypeid;
	}

	@Column(name = "STYPEID", nullable = false, length = 20)
	public String getStypeid() {
		return this.stypeid;
	}

	public void setStypeid(String stypeid) {
		this.stypeid = stypeid;
	}

	@Column(name = "PICTUREURL", nullable = false)
	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Column(name = "SALESTATE", nullable = false, length = 1)
	public String getSalestate() {
		return this.salestate;
	}

	public void setSalestate(String salestate) {
		this.salestate = salestate;
	}

	@Column(name = "SORT", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "LINK_URL", nullable = false, length = 225)
	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT")
	public Integer getVersiont() {
		return this.versiont;
	}

	public void setVersiont(Integer versiont) {
		this.versiont = versiont;
	}

}
