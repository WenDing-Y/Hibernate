package com.entity;

import java.io.Serializable;

public class User implements Serializable {
   
        private int id;
        private String name;
        private String password;
        private String type;
       
        public User() {                                                      
        }
      
        public User(int id, String name, String password, String type) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.type = type;
        }
      
        public int getId() {
            return this.id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPassword() {
            return this.password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getType() {
            return this.type;
        }
        public void setType(String type) {
            this.type = type;
        }

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", password=" + password + ", type=" + type + "]";
		}
        
}
