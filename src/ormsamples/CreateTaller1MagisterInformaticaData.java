/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
import taller.servlet.*;
public class CreateTaller1MagisterInformaticaData {
	public void createTestData(String nombre,String apellido,String mail,String telefono,String pais,String region,String ciudad) throws PersistentException {
		PersistentTransaction t = orm.Taller1MagisterInformaticaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// Initialize the properties of the persistent object here
			
			lormContacto.setNombre(nombre);
			lormContacto.setApellido(apellido);
			lormContacto.setMail(mail);
			lormContacto.setTelefono(telefono);
			lormContacto.setPais(pais);
			lormContacto.setRegion(region);
			lormContacto.setCiudad(ciudad);
			System.out.println("Ingreso exitoso");
			orm.ContactoDAO.save(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTaller1MagisterInformaticaData createTaller1MagisterInformaticaData = new CreateTaller1MagisterInformaticaData();
			try {
				//createTaller1MagisterInformaticaData.createTestData();
			}
			finally {
				orm.Taller1MagisterInformaticaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
