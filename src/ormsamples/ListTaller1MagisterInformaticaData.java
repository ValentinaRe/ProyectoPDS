/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListTaller1MagisterInformaticaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData(int id,String nombre,String apellido,String mail,String telefono,String pais,String region,String ciudad) throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			
			System.out.println(ormContactos[i]);
			System.out.println("Nombre:"+ormContactos[i].getNombre());
			System.out.println("Apellido:"+ormContactos[i].getApellido());
			System.out.println("Mail:"+ormContactos[i].getMail());
			System.out.println("Telefono:"+ormContactos[i].getTelefono());
			System.out.println("Ciudad:"+ormContactos[i].getCiudad());
			System.out.println("Region:"+ormContactos[i].getRegion());
			System.out.println("Pais:"+ormContactos[i].getPais());
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.uid.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		int length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTaller1MagisterInformaticaData listTaller1MagisterInformaticaData = new ListTaller1MagisterInformaticaData();
			try {
				//listTaller1MagisterInformaticaData.listTestData();
				//listTaller1MagisterInformaticaData.listByCriteria();
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
