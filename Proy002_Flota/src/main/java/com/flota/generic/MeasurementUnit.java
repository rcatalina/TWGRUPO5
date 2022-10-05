package com.flota.generic;

import com.flota.enums.MeasUnitCategoryEnum;
import com.flota.enums.MeasUnitNameEnum;

public class MeasurementUnit {
	private MeasUnitCategoryEnum category;
	private MeasUnitNameEnum name;
	private String nameToShow;
	private String symbol;

	
	public MeasurementUnit(MeasUnitNameEnum name) {
		switch (name) {

		// DISTANCE
		case MILLIMETER:
			this.category = MeasUnitCategoryEnum.DISTANCE;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "mm";
			break;

		case CENTIMETER:
			this.category = MeasUnitCategoryEnum.DISTANCE;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "cm";
			break;

		case METER:
			this.category = MeasUnitCategoryEnum.DISTANCE;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "m";
			break;

		// MASS
		case MILLIGRAM:
			this.category = MeasUnitCategoryEnum.MASS;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "mg";
			break;

		case GRAM:
			this.category = MeasUnitCategoryEnum.MASS;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "g";
			break;

		case KILOGRAM:
			this.category = MeasUnitCategoryEnum.MASS;
			this.name = name;
			this.nameToShow = name.toString().toLowerCase();
			this.symbol = "kg";
			break;

		default:
			break;
		}
	}

	public MeasUnitCategoryEnum getCategory() {
		return category;
	}

	public MeasUnitNameEnum getName() {
		return name;
	}

	public String getNameToShow() {
		return nameToShow;
	}

	public String getSymbol() {
		return symbol;
	}

}
