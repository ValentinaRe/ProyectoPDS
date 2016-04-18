/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTaller1MagisterInformaticaData {
	public void deleteTestData(int id,String nombre,String apellido,String mail,String telefono,String pais,String region,String ciudad) throws PersistentException {
		PersistentTransaction t = orm.Taller1MagisterInformaticaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(id);//orm.ContactoDAO.loadContactoByQuery("Contacto.nombre='Victor'", null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTaller1MagisterInformaticaData deleteTaller1MagisterInformaticaData = new DeleteTaller1MagisterInformaticaData();
			try {
				//deleteTaller1MagisterInformaticaData.deleteTestData();
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
