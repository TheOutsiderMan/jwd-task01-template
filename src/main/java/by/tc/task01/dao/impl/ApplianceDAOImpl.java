package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	private static final String FILE_NAME = "src\\main\\resources\\appliances_db.txt";
	
	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(FILE_NAME);
			bufferedReader = new BufferedReader(fileReader);
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				if(checkLine(line, criteria)) {
					return ApplianceCreator.createAppliance(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("ERROR");
		} catch (IOException e) {
			System.err.println("ERROR");
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					System.err.println("ERROR");
				}
			}
		}
		return null;
	}

	private static <E> boolean checkLine(String line, Criteria<E> criteria) {
		String applianceType = criteria.getApplianceType();
		boolean createObject = false;
		if (line.matches("(" + applianceType + ").+")) {
			String criterias = criteria.getCriteria().toString();
			String[] arrayCriterias = criterias.split("[{},\\s]+");
			for (int i = 0; i < arrayCriterias.length; i++) {
				if (line.matches(".+(" + arrayCriterias[i] + ").+")) {
					createObject = true;
				} else {
					createObject = false;
				}
			}
		}
		return createObject;
	}
	
}

