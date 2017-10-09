package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		String applianceType = criteria.getApplianceType();
		Map<E, Object> criteriasMap = criteria.getCriteria();
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
		return false;
	}

	private static <E> boolean validateRefrigerator(Map<E, Object> criteria) {

		return false;
	}

	private static <E> boolean validateLaptop(Map<E, Object> criteria) {

		return false;
	}

	private static <E> boolean validateOven(Map<E, Object> criterias) {
		
		return false;
	}
	
	private static <E> boolean validateSpeakers(Map<E, Object> criteriasMap) {
		if (criteriasMap.containsKey(Speakers.POWER_CONSUMPTION)) {
			Object value = criteriasMap.get(Speakers.POWER_CONSUMPTION);
			if (!String.valueOf(value).matches("[\\d]+")) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) > Integer.MAX_VALUE) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) == 0) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Speakers.NUMBER_OF_SPEAKERS)) {
			Object value = criteriasMap.get(Speakers.NUMBER_OF_SPEAKERS);
			if (!String.valueOf(value).matches("[\\d]+")) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) > Integer.MAX_VALUE) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) == 0) {
				return false;
			}
		}
		if (criteriasMap.containsKey(Speakers.CORD_LENGTH)) {
			Object value = criteriasMap.get(Speakers.CORD_LENGTH);
			if (!String.valueOf(value).matches("(\\d+)|((\\d+).{1}(\\d+)")) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) > Integer.MAX_VALUE) {
				return false;
			} else if (Integer.valueOf(String.valueOf(value)) == 0) {
				return false;
			}
		}
		return true;
	}
}