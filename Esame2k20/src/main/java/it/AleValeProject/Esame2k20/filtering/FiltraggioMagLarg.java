package it.AleValeProject.Esame2k20.filtering;

import java.util.ArrayList;

import it.AleValeProject.Esame2k20.model.SingleRecordInfo;

class FiltraggioMagLarg implements Filtering {

	private String operator = "$gt";

	public String getOperator() {
		return operator;
	}

	private String field = "larghezza";

	public String getField() {
		return field;
	}
	@Override
	public Boolean FilterFunction(String fieldToPass, ArrayList<String> valueToPass, SingleRecordInfo recordToPass) {
		for (int i = 0; i < recordToPass.getImmagini().size(); i++)
			if (!(Double.parseDouble(valueToPass.get(0)) < recordToPass.getImmagini().get(i).getWidth()))
				return false;
		return true;
	}
}