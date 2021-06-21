
public class Proyecto {
	private String nombre;
	private String descripcion;
	

	public Proyecto() {}
	
	public Proyecto(String nombre) {
		this.nombre = nombre;
	}
	
	public Proyecto(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getProjectName() {
		return this.nombre;
	}
	public String setProjectName(String nombre) {
		return this.nombre = nombre;
	}
	public String getProjectDescription() {
		return this.descripcion;
	}
	public String setProjectDescription(String descripcion) {
		return this.descripcion = descripcion;
	}
	
	public String elevatorPitch() {
		return this.nombre + " : " + this.descripcion;
	}

}