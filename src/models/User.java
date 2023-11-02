package models;

public class User {

	//encapsulamiento de objetos todos sus atributos son private solo acceso get&set
	
	private String  nameUser;
	private String cle;
	private String completName;
	private int age;
	private String nif;
	private String mail;
	private String address;
	private String birth;
	
	
	//como evoluciona de class Object, se deja vacio porque ....
	public User() {
		
	}



	public User(String nameUser, String cle, String completName, int age, String nif, String mail, String address,
			String birth) {
		
		this.nameUser = nameUser;
		this.cle = cle;
		this.completName = completName;
		this.age = age;
		this.nif = nif;
		this.mail = mail;
		this.address = address;
		this.birth = birth;
	}



	public String getNameUser() {
		return nameUser;
	}



	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}



	public String getCle() {
		return cle;
	}



	public void setCle(String cle) {
		this.cle = cle;
	}



	public String getCompletName() {
		return completName;
	}



	public void setCompletName(String completName) {
		this.completName = completName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getNif() {
		return nif;
	}



	public void setNif(String nif) {
		this.nif = nif;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getBirth() {
		return birth;
	}



	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
	
	
	
	
	
	
	

}
