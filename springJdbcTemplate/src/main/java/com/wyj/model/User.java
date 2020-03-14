package com.wyj.model;

public class User {

		private Integer id;
		private String userName;
		private String password;
		private String email;
		private String identity;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIdentity() {
			return identity;
		}
		public void setIdentity(String identity) {
			this.identity = identity;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
					+ ", identity=" + identity + "]";
			}	
}
