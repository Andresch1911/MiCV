package dad.javafx.micv.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlType
public class Telefono {
	
	private StringProperty telefono = new SimpleStringProperty();
	private ObjectProperty<TipoTelefono> tipo = new SimpleObjectProperty<TipoTelefono>();
	
	public final StringProperty telefonoProperty() {
		return this.telefono;
	}
	
	@XmlAttribute
	public final String getTelefono() {
		return this.telefonoProperty().get();
	}
	
	public final void setTelefono(final String telefono) {
		this.telefonoProperty().set(telefono);
	}
	
	public final ObjectProperty<TipoTelefono> tipoProperty() {
		return this.tipo;
	}
	@XmlAttribute
	public final TipoTelefono getTipo() {
		return this.tipoProperty().get();
	}
	
	public final void setTipo(final TipoTelefono tipo) {
		this.tipoProperty().set(tipo);
	}
	

}
