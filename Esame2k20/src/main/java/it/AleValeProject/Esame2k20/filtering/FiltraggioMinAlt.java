package it.AleValeProject.Esame2k20.filtering;

import java.util.ArrayList;

import it.AleValeProject.Esame2k20.model.SingleRecordInfo;

class FiltraggioMinAlt implements Filtering {

	@Override
	public Boolean FilterFunction(String fieldToPass, ArrayList<String> valueToPass, SingleRecordInfo recordToPass) {
		for (int i = 0; i < recordToPass.getImmagini().size(); i++)
			if (!(Double.parseDouble(valueToPass.get(0)) >= recordToPass.getImmagini().get(i).getHeight()))
				return false;
		return true;
	}

	private String field = "altezza";

	public String getField() {
		return field;
	}
	public String operator = "$lt";
	
	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return this.operator;
	}

}