package com.github.redesprou.util;

import java.sql.Connection;
import java.sql.SQLException;

//Subindo Teste
public class TestaConexao {
	
		public static void main(String[] args) {
			try {
				Connection con = FabricaConexao.getConexao();
				if (con != null)
					System.out.println("Conexao estabelecida!");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
}

