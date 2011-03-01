package org.comet4j.core.dto;

import java.util.List;

/**
 * @author jinghai.xiao@gmail.com 成功连接后的连接信息
 */
public class ConnectionDTO {
	public ConnectionDTO(String cId, List<String> aml) {
		this.cId = cId;
		this.aml = aml;
	}

	/**
	 * 连接ID
	 */
	public String cId;
	/**
	 * 应用模块列表appModuesList
	 */
	public List<String> aml;

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public List<String> getAml() {
		return aml;
	}

	public void setAml(List<String> aml) {
		this.aml = aml;
	}

}