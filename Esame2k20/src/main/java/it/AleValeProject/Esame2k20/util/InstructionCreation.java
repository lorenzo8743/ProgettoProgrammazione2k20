package it.AleValeProject.Esame2k20.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import it.AleValeProject.Esame2k20.model.SingleInstruction;

/**
 * The class that creats the instruction manual for the app
 * @author vale&ale
 *
 */
public class InstructionCreation extends SingleInstruction {

	/**
	 * The array of the instructions
	 */
	private ArrayList<SingleInstruction> instructionsManual = new ArrayList<SingleInstruction>();

	/**
	 * The constructor. Where the array of the instructions is created, reading the single record of instruction from a file
	 */
	public InstructionCreation() {
		SingleInstruction toadd;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Instruction.txt"));
			String[] allTheIstructions=reader.readLine().split("£");
			int j=0;
			while(j<allTheIstructions.length) {
				toadd = new SingleInstruction();
				toadd.setIntroduction(allTheIstructions[j]);
				j++;
				String[] support=allTheIstructions[j].split(";");
				toadd.setPossibility(support);
				j++;
				instructionsManual.add(toadd);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the istructionsManual
	 */
	public ArrayList<SingleInstruction> getInstructionsManual() {
		return instructionsManual;
	}
}
