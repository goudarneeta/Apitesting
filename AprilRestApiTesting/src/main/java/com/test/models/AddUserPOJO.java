//package com.test.models;

//public class AddUserPOJO {
   // package com.test.models;
	//public class AddUserPOJO {

	private String departmentno;
	@JsonProperty("salary")
	private String salary;
	@JsonProperty("pincode")
	private String pincode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("accountno")
	public String getAccountno() {
		return accountno;
	}
	@JsonProperty("accountno")
	public void setAccountno(String accountno)   {
		this.accountno = accountno;
	}
	@JsonProperty("departmentno")
	public String getDepartmentno(){
		return departmentno;
	}
	@JsonProperty("departmentno")
	public void setDepartmentno(String departmentno)   {
		this.departmentno = departmentno;
	}
	@JsonProperty("salary")
	public String getSalary(){
		return salary;
	}
	@JsonProperty("salary")
		public void setSalary(String salary)   {
			this.salary = salary;
		}
		
	@JsonProperty("pincode")
	public String getPincode() {
		return pincode;
	}
	@JsonProperty("pincode")
		public void setPincode(String pincode)   {
			this.pincode = pincode;
		}
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	@JsonAnySetter
	public void setAdditionalProperty(String name , Object value) {
		this.additionalProperties.put(name,value);
	}
	
	}
