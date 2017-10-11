package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		if (criteria == null) {
			return false;
		}
		String applianceType = criteria.getApplianceType();
		Map<E, Object> criteriasMap = criteria.getCriteria();
		if (criteriasMap.containsValue(null)) {
			return false;
		}
		switch (applianceType) {
		case "Oven":
			return validateOven(criteriasMap);
		case "Laptop":
			return validateLaptop(criteriasMap);
		case "Refrigerator":
			return validateRefrigerator(criteriasMap);
		case "VacuumCleaner":
			return validateVacuumCleaner(criteriasMap);
		case "TabletPC":
			return validateTabletPC(criteriasMap);
		case "Speakers":
			return validateSpeakers(criteriasMap);
		default:
			return false;
		}
	}
	
	private static <E> boolean validateTabletPC(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(TabletPC.BATTERY_CAPACITY)) {
			Object value = criteriasMap.get(TabletPC.BATTERY_CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(TabletPC.DISPLAY_INCHES)) {
			Object value = criteriasMap.get(TabletPC.DISPLAY_INCHES);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(TabletPC.MEMORY_ROM)) {
			Object value = criteriasMap.get(TabletPC.MEMORY_ROM);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(TabletPC.FLASH_MEMORY_CAPACITY)) {
			Object value = criteriasMap.get(TabletPC.FLASH_MEMORY_CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(TabletPC.COLOR)) {
			Object value = criteriasMap.get(TabletPC.COLOR);
			if (isBlank(value)) {
				return false;
			}
		}
		return true;
	}

	private static <E> boolean validateOven(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(Oven.POWER_CONSUMPTION)) {
			Object value = criteriasMap.get(Oven.POWER_CONSUMPTION);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Oven.WEIGHT)) {
			Object value = criteriasMap.get(Oven.WEIGHT);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Oven.CAPACITY)) {
			Object value = criteriasMap.get(Oven.CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Oven.DEPTH)) {
			Object value = criteriasMap.get(Oven.DEPTH);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Oven.HEIGHT)) {
			Object value = criteriasMap.get(Oven.HEIGHT);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Oven.WIDTH)) {
			Object value = criteriasMap.get(Oven.WIDTH);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		return true;
	}
	
	private static <E> boolean validateLaptop(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(Laptop.BATTERY_CAPACITY)) {
			Object value = criteriasMap.get(Laptop.BATTERY_CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Laptop.OS)) {
			Object value = criteriasMap.get(Laptop.OS);
			if (isBlank(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Laptop.MEMORY_ROM)) {
			Object value = criteriasMap.get(Laptop.MEMORY_ROM);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Laptop.SYSTEM_MEMORY)) {
			Object value = criteriasMap.get(Laptop.SYSTEM_MEMORY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Laptop.CPU)) {
			Object value = criteriasMap.get(Laptop.CPU);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Laptop.CPU)) {
			Object value = criteriasMap.get(Laptop.CPU);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		return true;
	}
	
	private static <E> boolean validateRefrigerator(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(Refrigerator.POWER_CONSUMPTION)) {
			Object value = criteriasMap.get(Refrigerator.POWER_CONSUMPTION);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Refrigerator.WEIGHT)) {
			Object value = criteriasMap.get(Refrigerator.WEIGHT);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Refrigerator.FREEZER_CAPACITY)) {
			Object value = criteriasMap.get(Refrigerator.FREEZER_CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Refrigerator.OVERALL_CAPACITY)) {
			Object value = criteriasMap.get(Refrigerator.OVERALL_CAPACITY);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Refrigerator.HEIGHT)) {
			Object value = criteriasMap.get(Refrigerator.HEIGHT);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Refrigerator.WIDTH)) {
			Object value = criteriasMap.get(Refrigerator.WIDTH);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		return true;
	}
	
	private static <E> boolean validateVacuumCleaner(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(VacuumCleaner.POWER_CONSUMPTION)) {
			Object value = criteriasMap.get(VacuumCleaner.POWER_CONSUMPTION);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(VacuumCleaner.FILTER_TYPE)) {
			Object value = criteriasMap.get(VacuumCleaner.FILTER_TYPE);
			if (isBlank(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(VacuumCleaner.BAG_TYPE)) {
			Object value = criteriasMap.get(VacuumCleaner.BAG_TYPE);
			if (isBlank(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(VacuumCleaner.WAND_TYPE)) {
			Object value = criteriasMap.get(VacuumCleaner.WAND_TYPE);
			if (isBlank(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(VacuumCleaner.MOTOR_SPEED_REGULATION)) {
			Object value = criteriasMap.get(VacuumCleaner.MOTOR_SPEED_REGULATION);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(VacuumCleaner.CLEANING_WIDTH)) {
			Object value = criteriasMap.get(VacuumCleaner.CLEANING_WIDTH);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		return true;
	}
	
	private static <E> boolean validateSpeakers(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(Speakers.POWER_CONSUMPTION)) {
			Object value = criteriasMap.get(Speakers.POWER_CONSUMPTION);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Speakers.NUMBER_OF_SPEAKERS)) {
			Object value = criteriasMap.get(Speakers.NUMBER_OF_SPEAKERS);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Speakers.FREQUENCY_RANGE)) {
			Object value = criteriasMap.get(Speakers.FREQUENCY_RANGE);
			if (isBlank(value)) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Speakers.CORD_LENGTH)) {
			Object value = criteriasMap.get(Speakers.CORD_LENGTH);
			if (!isPositiveDouble(value)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPositiveDouble(Object object) {
		String obString = String.valueOf(object);
		if (!obString.matches("(\\d+)|((\\d+).{1}(\\d+))")) {
			return false;
		} else if (Double.valueOf(obString) > Double.MAX_VALUE) {
			return false;
		} else if (Double.valueOf(obString) == 0) {
			return false;
		}
		return true;
	}
	
	private static boolean isBlank(Object object) {
		String obString = String.valueOf(object);
		if (obString.length() == 0) {
			return true;
		} else if (obString.matches("\\s+")) {
			return true;
		}
		return false;
	}
	
}