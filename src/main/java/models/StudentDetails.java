
package models;


public class StudentDetails {
	
	 private int id;
	    private String firstName;
	    private String lastName;
	    private String address;
	    private String dob;
	 
	    public StudentDetails(int id, String firstName, String lastName, String address, String dob) {
            this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.dob = dob;
	    }
	 


		public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 
	    public String getAddress() {
	        return address;
	    }
	 
	    public void setAddress(String address) {
	        this.address = address;
	    }
	 
	    public String getDob() {
	        return dob;
	    }
	 
	    public void setDob(String dob) {
	        this.dob = dob;
	    }	
	
	
	
	
	
}
