package com.example.enchere.ModelAdmin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.enchere.Base.Connexion;

public class Admin_User {
	private int idAdmin;
	private String nom;
	private String mdp;
	private float compte;


	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public float getCompte() {
		return compte;
	}
	public void setCompte(float compte) {
		this.compte = compte;
	}
	
	public boolean login(Admin_User admin) throws Exception
	{
		String requete = "select * from admin where nom='"+admin.getNom()+"' and mdp='"+admin.getMdp()+"'";
		Connection connex = null;
		Statement state = null;
		Admin_User utilisateur = new Admin_User();
		String message = "Utilisateur inéxistante";
		boolean approved = false;
		try
		{
			connex = Connexion.setConnect();
			state = connex.createStatement();
			ResultSet rs = state.executeQuery(requete);
			int nbr = 0;
			while(rs.next())
			{
				utilisateur.setIdAdmin(rs.getInt("idadmin"));
				utilisateur.setNom(rs.getString("nom"));
				nbr++;
			}if(nbr != 0){
				approved = true;
			}else if(nbr == 0)
			{
//				throw new Exception(message);
				approved = false;
			}
		}
		catch(Exception e)
		{
			throw e;
		}
		/*finally
		{
			connex.close();
			state.close();
		}*/
		return approved;
		
	}
}
