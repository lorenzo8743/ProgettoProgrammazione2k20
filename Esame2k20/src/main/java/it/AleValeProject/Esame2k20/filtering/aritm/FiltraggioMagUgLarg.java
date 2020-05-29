package it.AleValeProject.Esame2k20.filtering.aritm;

import java.util.ArrayList;

import it.AleValeProject.Esame2k20.filtering.Filtering;
import it.AleValeProject.Esame2k20.model.SingleRecordInfo;

public class FiltraggioMagUgLarg implements Filtering {
	private String operator = "$gte";

	public String getOperator() {
		return operator;
	}

	@Override
	public Boolean FilterFunction(String fieldToPass, ArrayList<String> valueToPass, SingleRecordInfo recordToPass) {
		if (fieldToPass.equals("larghezza"))
			for (int i = 0; i < recordToPass.getImmagini().size(); i++)
				if (!(Double.parseDouble(valueToPass.get(0)) <= recordToPass.getImmagini().get(i).getWidth()))
					return false;
		return true;
	}
}