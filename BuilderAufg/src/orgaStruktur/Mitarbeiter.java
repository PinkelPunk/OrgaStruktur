package orgaStruktur;

public class Mitarbeiter 
{
	private String name;
	private boolean isFuehrer;
	private boolean isAdmin;
	private boolean isAssi;
	private boolean isAbtLeiter;
	
	public Mitarbeiter(String name)
	{
		this.name = name;
		
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the isFuehrer
	 */
	public boolean isFuehrer()
	{
		return isFuehrer;
	}

	/**
	 * @param isFuehrer the isFuehrer to set
	 */
	public void setFuehrer(boolean isFuehrer)
	{
		this.isFuehrer = isFuehrer;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin()
	{
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the isAssi
	 */
	public boolean isAssi()
	{
		return isAssi;
	}

	/**
	 * @param isAssi the isAssi to set
	 */
	public void setAssi(boolean isAssi) {
		this.isAssi = isAssi;
	}

	/**
	 * @return the isAbtLeiter
	 */
	public boolean isAbtLeiter() {
		return isAbtLeiter;
	}

	/**
	 * @param isAbtLeiter the isAbtLeiter to set
	 */
	public void setAbtLeiter(boolean isAbtLeiter) {
		this.isAbtLeiter = isAbtLeiter;
	}
	
}
