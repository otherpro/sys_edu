package pojo;

public class TechSerReq {
	private Integer req_id;
	private Integer ent_id;
	private String req_title;
	private String req_text;
	private String state;

	public Integer getReq_id() {
		return req_id;
	}

	public void setReq_id(Integer req_id) {
		this.req_id = req_id;
	}

	public Integer getEnt_id() {
		return ent_id;
	}

	public void setEnt_id(Integer ent_id) {
		this.ent_id = ent_id;
	}

	public String getReq_title() {
		return req_title;
	}

	public void setReq_title(String req_title) {
		this.req_title = req_title;
	}

	public String getReq_text() {
		return req_text;
	}

	public void setReq_text(String req_text) {
		this.req_text = req_text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
