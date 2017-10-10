package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;

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

		return true;
	}

	private static <E> boolean validateVacuumCleaner(Map<E, Object> criteriasMap) {
		return true;
	}

	private static <E> boolean validateRefrigerator(Map<E, Object> criteriasMap) {

		return true;
	}

	private static <E> boolean validateLaptop(Map<E, Object> criteriasMap) {

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
}