package com.jeecg.p3.commonftb.entity;

import java.util.Date;
import java.util.List;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActCommonftbMain:砍价主活动表<br>
 * @author pituo
 * @since：2016年01月05日 10时52分01秒 星期二 
 * @version:1.0
 */
public class WxActCommonftbMain implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	public String getManyCanJoin() {
		return manyCanJoin;
	}
	public void setManyCanJoin(String manyCanJoin) {
		this.manyCanJoin = manyCanJoin;
	}
	private List<WxActCommonftbRelation> ftbList;
	public List<WxActCommonftbRelation> getFtbList() {
		return ftbList;
	}
	public void setFtbList(List<WxActCommonftbRelation> ftbList) {
		this.ftbList = ftbList;
	}

}
