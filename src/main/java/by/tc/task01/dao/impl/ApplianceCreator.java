package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceCreator {

	public static Appliance createAppliance(String line) {
		String[] parametres = line.split("[:;\\s,=]+");
		Appliance appliance = null;
		switch (parametres[0]) {
		case "Oven":
			appliance = createOven(parametres);
			break;
		case "Laptop":
			appliance = createLaptop(parametres);
			break;
		case "Refrigerator":
			appliance = createRefrigerator(parametres);
			break;
		case "VacuumCleaner":
			appliance = createVacuumCleaner(parametres);
			break;
		case "TabletPC":
			appliance = createTabletPC(parametres);
			break;
		case "Speakers":
			appliance = createSpeakers(parametres);
			break;
		}
		return appliance;
	}

	private static Oven createOven(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
				break;
			}
		}
		Oven oven = new Oven();
		oven.setPowerConsumption(Double.valueOf(parametres[i += 1]));
		oven.setWeight(Double.valueOf(parametres[i += 2]));
		double capacity = Double.valueOf(parametres[i += 2]);
		double depth = Double.valueOf(parametres[i += 2]);
		double height = Double.valueOf(parametres[i += 2]);
		double width = Double.valueOf(parametres[i += 2]);
		
		return oven;
	}

	private static Laptop createLaptop(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				break;
			}
		}
		double batteryCapacity = Double.valueOf(parametres[i += 1]);
		String os = parametres[i += 2];
		int memoryRom = Integer.valueOf(parametres[i += 2]);
		int systemMemory = Integer.valueOf(parametres[i += 2]);
		double cpu = Double.valueOf(parametres[i += 2]);
		double displayInchs = Double.valueOf(parametres[i += 2]);
		Laptop laptop = new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
		return laptop;
	}

	private static Appliance createRefrigerator(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
				break;
			}
		}
		int powerConsumption = Integer.valueOf(parametres[i += 1]);
		double weight = Double.valueOf(parametres[i += 2]);
		double freezerCapacity = Double.valueOf(parametres[i += 2]);
		double overallCapacity = Double.valueOf(parametres[i += 2]);
		double height = Double.valueOf(parametres[i += 2]);
		double width = Double.valueOf(parametres[i += 2]);
		Refrigerator refrigerator = new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height,
				width);
		return refrigerator;
	}

	private static Appliance createVacuumCleaner(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
				break;
			}
		}
		int powerConsumption = Integer.valueOf(parametres[i += 1]);
		String filterType = parametres[i += 2];
		String bagType = parametres[i += 2];
		String wandType = parametres[i += 2];
		int motorSpeedRegulation = Integer.valueOf(parametres[i += 2]);
		double cleaningWidth = Double.valueOf(parametres[i += 2]);
		;
		VacuumCleaner vacuumCleaner = new VacuumCleaner(powerConsumption, filterType, bagType, wandType,
				motorSpeedRegulation, cleaningWidth);
		return vacuumCleaner;
	}

	private static Appliance createTabletPC(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
				break;
			}
		}
		double batteryCapacity = Double.valueOf(parametres[i += 1]);
		double displayInches = Double.valueOf(parametres[i += 2]);
		int memoryRom = Integer.valueOf(parametres[i += 2]);
		int flashMemoryCapacity = Integer.valueOf(parametres[i += 2]);
		String color = parametres[i += 2];
		TabletPC tabletPC = new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
		return tabletPC;
	}

	private static Appliance createSpeakers(String[] parametres) {
		int i = 0;
		for (; i < parametres.length; i++) {
			if (parametres[i].equalsIgnoreCase(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				break;
			}
		}
		int powerConsumption = Integer.valueOf(parametres[i += 1]);
		int numberOfSpeakers = Integer.valueOf(parametres[i += 2]);
		String frequencyRange = parametres[i += 2];
		double cordLength = Double.valueOf(parametres[i += 2]);
		Speakers speakers = new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
		return speakers;
	}
}
