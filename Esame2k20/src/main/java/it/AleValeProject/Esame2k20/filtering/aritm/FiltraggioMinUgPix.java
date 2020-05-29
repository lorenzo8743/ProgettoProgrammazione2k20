package it.AleValeProject.Esame2k20.filtering.aritm;

import java.util.ArrayList;

import it.AleValeProject.Esame2k20.filtering.Filtering;
import it.AleValeProject.Esame2k20.model.SingleRecordInfo;

public class FiltraggioMinUgPix implements Filtering {

	@Override
	public Boolean FilterFunction(String fieldToPass, ArrayList<String> valueToPass, SingleRecordInfo recordToPass) {
		if (fieldToPass.equals("megapixel"))
			for (int i = 0; i < recordToPass.getImmagini().size(); i++)
				if (!(Double.parseDouble(valueToPass.get(0)) > recordToPass.getImmagini().get(i).getMegapixel()))
					return false;
		return true;
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return null;
	}

}
