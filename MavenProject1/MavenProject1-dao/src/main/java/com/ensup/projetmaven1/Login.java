package eu.ensup.projetwebv2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.projetwebv2.domaine.Utilisateur;




public class Login {

	public static List<Utilisateur> loginUser(String login,String pwd){

		List<Utilisateur>listUtilisateur = new ArrayList<>();
		//take a list to store the values which are in db
		try{  
			Connection con= DbConnection.getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from user where login=? and pwd=?");  
			ps.setString(1,login);  
			ps.setString(2,pwd);
			ResultSet rs =ps.executeQuery();  
			if(rs.next()){  				
				Utilisateur utilisateur = new Utilisateur(); 
				utilisateur.setLogin(rs.getString(1));  
				utilisateur.setPwd(rs.getString(2)); 											
				listUtilisateur.add(utilisateur);
			}  
			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  

		return listUtilisateur;

	}
}
