package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance == null) {
			System.out.println("Sorry, we don't have such appliances");
		}
		if (appliance instanceof Oven) {
			Oven oven = (Oven) appliance;
			printOven(oven);
		}
		if (appliance instanceof Laptop) {
			Laptop laptop = (Laptop) appliance;
			printLaptop(laptop);
		}
		if (appliance instanceof Refrigerator) {
			Refrigerator refrigerator = (Refrigerator) appliance;
			printRefrigerator(refrigerator);
		}
		if (appliance instanceof VacuumCleaner) {
			VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
			printVacuumCleaner(vacuumCleaner);
		}
		if (appliance instanceof TabletPC) {
			TabletPC tabletPC = (TabletPC) appliance;
			printTabletPC(tabletPC);
		}
		if (appliance instanceof Speakers) {
			Speakers speakers = (Speakers) appliance;
			printSpeakers(speakers);
		}
	}
	
	private static void printOven(Oven oven) {
		StringBuilder lineToPrint = new StringBuilder("Oven [ POWER_CONSUMPTION = ");
		lineToPrint.append(oven.getPowerConsumption());
		lineToPrint.append(", WEIGHT = ");
		lineToPrint.append(oven.getWeight());
		lineToPrint.append(", CAPACITY = ");
		lineToPrint.append(oven.getCapacity());
		lineToPrint.append(", DEPTH = ");
		lineToPrint.append(oven.getDepth());
		lineToPrint.append(", HEIGHT = ");
		lineToPrint.append(oven.getHeight());
		lineToPrint.append(", WIDTH = ");
		lineToPrint.append(oven.getWidth());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
	
	private static void printLaptop(Laptop laptop) {
		StringBuilder lineToPrint = new StringBuilder("Laptop [ BATTERY_CAPACITY = ");
		lineToPrint.append(laptop.getBatteryCapacity());
		lineToPrint.append(", OS = ");
		lineToPrint.append(laptop.getOs());
		lineToPrint.append(", MEMORY_ROM = ");
		lineToPrint.append(laptop.getMemoryRom());
		lineToPrint.append(", SYSTEM_MEMORY = ");
		lineToPrint.append(laptop.getSystemMemory());
		lineToPrint.append(", CPU = ");
		lineToPrint.append(laptop.getCpu());
		lineToPrint.append(", DISPLAY_INCHS = ");
		lineToPrint.append(laptop.getDisplayInchs());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
	
	private static void printRefrigerator(Refrigerator refrigerator) {
		StringBuilder lineToPrint = new StringBuilder("Refrigerator [ POWER_CONSUMPTION = ");
		lineToPrint.append(refrigerator.getPowerConsumption());
		lineToPrint.append(", WEIGHT = ");
		lineToPrint.append(refrigerator.getWeight());
		lineToPrint.append(", FREEZER_CAPACITY = ");
		lineToPrint.append(refrigerator.getFreezerCapacity());
		lineToPrint.append(", OVERALL_CAPACITY = ");
		lineToPrint.append(refrigerator.getOverallCapacity());
		lineToPrint.append(", HEIGHT = ");
		lineToPrint.append(refrigerator.getHeight());
		lineToPrint.append(", WIDTH = ");
		lineToPrint.append(refrigerator.getWidth());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
	
	private static void printVacuumCleaner(VacuumCleaner vacuumCleaner) {
		StringBuilder lineToPrint = new StringBuilder("VacuumCleaner [ POWER_CONSUMPTION = ");
		lineToPrint.append(vacuumCleaner.getPowerConsumption());
		lineToPrint.append(", FILTER_TYPE = ");
		lineToPrint.append(vacuumCleaner.getFilterType());
		lineToPrint.append(", BAG_TYPE = ");
		lineToPrint.append(vacuumCleaner.getBagType());
		lineToPrint.append(", WAND_TYPE = ");
		lineToPrint.append(vacuumCleaner.getWandType());
		lineToPrint.append(", MOTOR_SPEED_REGULATION = ");
		lineToPrint.append(vacuumCleaner.getMotorSpeedRegulation());
		lineToPrint.append(", CLEANING_WIDTH = ");
		lineToPrint.append(vacuumCleaner.getCleaningWidth());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
	
	private static void printTabletPC(TabletPC tabletPC) {
		StringBuilder lineToPrint = new StringBuilder("TabletPC [ BATTERY_CAPACITY = ");
		lineToPrint.append(tabletPC.getBatteryCapacity());
		lineToPrint.append(", DISPLAY_INCHES = ");
		lineToPrint.append(tabletPC.getDisplayInches());
		lineToPrint.append(", MEMORY_ROM = ");
		lineToPrint.append(tabletPC.getMemoryRom());
		lineToPrint.append(", FLASH_MEMORY_CAPACITY = ");
		lineToPrint.append(tabletPC.getFlashMemoryCapacity());
		lineToPrint.append(", COLOR = ");
		lineToPrint.append(tabletPC.getColor());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
	
	private static void printSpeakers(Speakers speakers) {
		StringBuilder lineToPrint = new StringBuilder("Speakers [ POWER_CONSUMPTION = ");
		lineToPrint.append(speakers.getPowerConsumption());
		lineToPrint.append(", NUMBER_OF_SPEAKERS = ");
		lineToPrint.append(speakers.getNumberOfSpeakers());
		lineToPrint.append(", FREQUENCY_RANGE = ");
		lineToPrint.append(speakers.getFrequencyRange());
		lineToPrint.append(", CORD_LENGTH = ");
		lineToPrint.append(speakers.getCordLength());
		lineToPrint.append(" ]");
		System.out.println(lineToPrint);
	}
}
