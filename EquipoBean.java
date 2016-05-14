package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

public class EquipoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Equipo> equiposList;
	private List<EquipoDetalle> equipodetalleList = new ArrayList<EquipoDetalle>();
	private String nombreEquipoDetalle;
	private String placa;
	private EquipoDetalle equipoDetalle;

	
	public EquipoBean()
	{
		equiposList = new ArrayList<Equipo>();
		equiposList.add(new Equipo(1,"Autoclave"));
		equiposList.add(new Equipo(2,"Agitadora"));
		
		
	}
	
	@PostConstruct
	public void populateEquipoDetalleList()
	{
		
		equipodetalleList.add(new EquipoDetalle("autoclave1","amd13"));
		equipodetalleList.add(new EquipoDetalle("autoclave2","amd14"));
	}
	
	public void registarEquipoDetalle(ActionEvent even)
	{
		try
		{
			equipoDetalle = new EquipoDetalle();
			
			equipoDetalle.setNombre(nombreEquipoDetalle);
			equipoDetalle.setPlaca(placa);
			
			equipodetalleList.add(equipoDetalle);
			
			System.out.println("Equipo creado satisfactoriamente");
		}
		catch (Exception e) {
			System.out.println("no se registro el equipo");
		}
		
		for(int i=0;i<equipodetalleList.size();i++)
		{
			System.out.println("nombre equipo "+equipodetalleList.get(i).getNombre());
		}
		
		
	}
	
	public List<Equipo> getEquiposList() {
		return equiposList;
	}

	public void setEquiposList(List<Equipo> equiposList) {
		this.equiposList = equiposList;
	}


	public List<EquipoDetalle> getEquipodetalleList() {
		return equipodetalleList;
	}


	public void setEquipodetalleList(List<EquipoDetalle> equipodetalleList) {
		this.equipodetalleList = equipodetalleList;
	}

	public String getNombreEquipoDetalle() {
		return nombreEquipoDetalle;
	}

	public void setNombreEquipoDetalle(String nombreEquipoDetalle) {
		this.nombreEquipoDetalle = nombreEquipoDetalle;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	
	
	
}
