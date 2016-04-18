/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTaller1MagisterInformaticaData {
	public void retrieveAndUpdateTestData(int id,String nombre,String apellido,String mail,String telefono,String pais,String region,String ciudad) throws PersistentException {
		PersistentTransaction t = orm.Taller1MagisterInformaticaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(id);//orm.ContactoDAO.loadContactoByQuery("Contacto.nombre='"+ +"'", null);
			// Update the properties of the persistent object
			
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
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTaller1MagisterInformaticaData retrieveAndUpdateTaller1MagisterInformaticaData = new RetrieveAndUpdateTaller1MagisterInformaticaData();
			try {
				//retrieveAndUpdateTaller1MagisterInformaticaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTaller1MagisterInformaticaData.retrieveByCriteria();
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
