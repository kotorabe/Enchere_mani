package com.example.enchere.ModelAdmin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.enchere.Base.Connexion;

public class Commission {
	private int idenchere;
	private float commission;
	public int getIdenchere() {
		return idenchere;
	}
	public void setIdenchere(int idenchere) {
		this.idenchere = idenchere;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	public boolean update(Commission commission) throws Exception
	{
		String requete = "update  commission set commission = '"+commission.getCommission()+"' where idenchere != 0";
		Connection connex = null;
		Statement state = null;
		boolean retour = false;
		try
		{
			connex = Connexion.setConnect();
			state = connex.createStatement();
			state.execute(requete);
			retour = true;
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
		return retour;
	}

	public ArrayList<Commission> selectall() throws Exception
	{
		ArrayList<Commission> liste = new ArrayList<>();
		String requete = "select * from commission";
		Connection connex = null;
		Statement state = null;
		try
		{
			connex = Connexion.setConnect();
			state = connex.createStatement();
			ResultSet rs = state.executeQuery(requete);
			while(rs.next())
			{
				Commission commission = new Commission();
				commission.setIdenchere(rs.getInt("idenchere"));
				commission.setCommission(rs.getFloat("commission"));
				liste.add(commission);
			}
		}
		catch(Exception e)
		{
			throw e;
		}
		/*finally
		{
			connex.close();
		}*/
		return liste;
	}
	
}
