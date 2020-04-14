package by.htp.task.simpleclass.bean;

public class Custumer {
	{
        idGenerator++;
    }
 
    private static int idGenerator = 0;
    {
		idGenerator = idGenerator++;
	}
    private int id = idGenerator;
    
	private String surname;
	private String otchestvo;
	private String address;
	private int idCredit;
	private int idBank;
	

	public Custumer(String surname, String otchestvo, String address, int idCredit, int idBank) {
	
		this.surname = surname;
		this.otchestvo = otchestvo;
		this.address = address;
		this.idCredit = idCredit;
		this.idBank = idBank;

	}

	@Override
	public String toString() {
		return "Custumer [id=" + id + ", surname=" + surname + ", otchestvo=" + otchestvo + ", address=" + address
				+ ", idCredit=" + idCredit + ", idBank=" + idBank + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getOtchestvo() {
		return otchestvo;
	}

	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
	}

	public int getIdBank() {
		return idBank;
	}

	public void setIdBank(int idBank) {
		this.idBank = idBank;
	}
	
	
	

}
