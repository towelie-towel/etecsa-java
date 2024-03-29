package logic;

import java.util.ArrayList;

public class PersonaJuridica extends Usuario {
	private String entidad;
	private String organismo;

	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getOrganismo() {
		return organismo;
	}
	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}

	public void addCuentaNauta(String nickName) {
		throw new IllegalArgumentException("Las Personas Jur�dicas no pueden tener cuenta nauta");
	}
	public ArrayList<CuentaNauta> getCuentasNauta() {
		throw new IllegalArgumentException("Las Personas Jur�dicas no pueden tener cuenta nauta");
	}

	public PersonaJuridica(String userName, String password, String nombreEmpresa, 
			String entidad, String organismo, String municipio, String provincia, 
			String direccionPostal, Representante representante, boolean isAdministrador) {
		
		super(userName, password, nombreEmpresa, municipio, 
				provincia, direccionPostal, representante, isAdministrador);
		
		this.setEntidad(entidad);
		this.setOrganismo(organismo);
	}

}