package com.github.redesprou.loinc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.github.redesprou.util.FabricaConexao;

public class Searcher {
	public ArrayList<LoincInformation> pesquisar(String searchKeyWord) {

		String pesquisaPorNome = "SELECT num, component, property, time_ascpect, system_information, scale_type, method_type, class_information, "
				+ "	class_type, long_name, short_name, external_copyright_notice, status, version_first_released, version_last_changed "
				+ " FROM loinc_core "
				+ " WHERE UPPER(component) like ? OR UPPER(property) like ? OR UPPER(TIME_ASCPECT) like ? "
				+ " OR UPPER(system_information) like ? OR UPPER(scale_type) like ? OR UPPER(method_type) like ? " 
				+ " OR UPPER(class_information) like ? OR UPPER(long_name) like ?  OR UPPER(short_name) like ? "
				+ " OR UPPER(external_copyright_notice) like ? OR UPPER(status) like ? OR UPPER(version_first_released) like ? "
				+ " OR UPPER(version_last_changed) like ?";
		LoincInformation loincInformation = null;

		ArrayList<LoincInformation> resultList = new ArrayList<LoincInformation>();

		try {
			Connection conexao = FabricaConexao.getConexao();
			PreparedStatement consulta = conexao.prepareStatement(pesquisaPorNome);

			consulta.setString(1, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(2, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(3, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(4, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(5, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(6, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(7, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(8, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(9, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(10, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(11, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(12, "%" + searchKeyWord.toUpperCase() + "%");
			consulta.setString(13, "%" + searchKeyWord.toUpperCase() + "%");
			ResultSet resultado = consulta.executeQuery();

			while (resultado.next()) {
				loincInformation = new LoincInformation();
				loincInformation.setNum(resultado.getLong("NUM"));

				loincInformation.setComponent(resultado.getString("COMPONENT"));
				loincInformation.setProperty(resultado.getString("PROPERTY"));
				loincInformation.setTimeAspect(resultado.getString("TIME_ASCPECT"));
				loincInformation.setSystemInformation(resultado.getString("SYSTEM_INFORMATION"));
				loincInformation.setScaleType(resultado.getString("SCALE_TYPE"));
				loincInformation.setMethodType(resultado.getString("METHOD_TYPE"));
				loincInformation.setClassInformation(resultado.getString("CLASS_INFORMATION"));
				loincInformation.setLongName(resultado.getString("LONG_NAME"));
				loincInformation.setShortName(resultado.getString("SHORT_NAME"));
				loincInformation.setExternalCopyrightNotice(resultado.getString("EXTERNAL_COPYRIGHT_NOTICE"));
				loincInformation.setStatus(resultado.getString("STATUS"));
				loincInformation.setVersionFirstReleased(resultado.getString("VERSION_FIRST_RELEASED"));
				loincInformation.setVersionLastChanged(resultado.getString("VERSION_LAST_CHANGED"));

				resultList.add(loincInformation);
			}
			resultado.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultList;

	}
}
