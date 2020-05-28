package it.AleValeProject.Esame2k20.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import it.AleValeProject.Esame2k20.model.SingleMetaData;

public class MetadataCreation {

	/**
	 * Description of the property metaDati.
	 */
	private ArrayList<SingleMetaData> metadata = new ArrayList<SingleMetaData>();

	/**
	 * The constructor.
	 */
	public MetadataCreation() {
		SingleMetaData toAdd;
		BufferedReader reader;
		int j=0;
		try {
			reader = new BufferedReader(new FileReader("Metadata.txt"));
			String[] metadataImported= reader.readLine().split(",");
			while(j<metadataImported.length) {
				toAdd = new SingleMetaData();
				toAdd.setAlias(metadataImported[j]);
				j++;
				toAdd.setSourceField(metadataImported[j]);
				j++;
				toAdd.setType(metadataImported[j]);
				j++;
				metadata.add(toAdd);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Returns metadata.
	 * @return metadata 
	 */
	public ArrayList<SingleMetaData> getMetadata() {
		return this.metadata;
	}
}