package entities;

public class Room {
	
	private String name;
	private String email;
	private int numberId;
	
	public Room(String name, String email, int numberId) {
		this.name = name;
		this.email = email;
		this.numberId = numberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberId() {
		return numberId;
	}

	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}

	@Override
	public String toString() {
		return numberId
				+ ": "
				+ name
				+ ", "
				+ email;
	}
}
