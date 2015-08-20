package com.datastatistics.model;


/**
 * 统计数据库中个省份同名统计实体类
 * 转换Json之后如下
 * [{e:[11,22]},{e:[11,22]},...]
 * @author 树朾
 */
public class CountProvinceEntity {
	/** 长度为2的int数组 第一个int表示省份的Code 第二个表示People人数 */
	public int[] e = new int[2];
	
	public CountProvinceEntity() {
	}
	
//	public CountProvinceEntity(NameProvince nameProvince) {
//		setPoepleCount(nameProvince.People);
//		setProvinceCode(nameProvince.getProvinceCode());
//	}
	
	public CountProvinceEntity(int people,int code){
		setPoepleCount(people);
		setProvinceCode(code);
	}
	
	public void setPoepleCount(int people) {
		if (e != null && e.length > 1) {
			e[1] = people;
		}
	}

	public void setProvinceCode(int code) {
		if (e != null && e.length > 0) {
			e[0] = code;
		}
	}

	public int getProvinceCode(){
		if (e != null && e.length > 0) {
			return e[0];
		}
		return -1;
	}
	
	public int getPoepleCount() {
		if (e != null && e.length > 1) {
			return e[1];
		}
		return 0;
	}
}
