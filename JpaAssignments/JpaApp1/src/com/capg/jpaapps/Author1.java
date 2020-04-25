package com.capg.jpaapps;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Author1")
public class Author1 {
	
	    @Id
		private int authorId;
		private String firstName;
		private String middleName;
		private String lastName;
		private String phoneNo;
		
		
		public Author1() {
		}


		public Author1(int authorId,String firstName,String middleName,String lastName,String phoneNo) {
			super();
			this.authorId = authorId;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName=lastName;
			this.phoneNo=phoneNo;
		}
        public int getAuthorId() {
			return authorId;
		}


		public void setAuthorId(int authorId) {
			this.authorId = authorId;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getMiddleName() {
			return middleName;
		}


		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		@Override
		public String toString() {
			return "Author [id=" + authorId + ", firstName=" + firstName + ", Middle Name=" + middleName+", Last Name=" + lastName+", phone number=" + phoneNo + "]";
		}
		
		
	}


