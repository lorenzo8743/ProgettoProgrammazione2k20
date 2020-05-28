package it.AleValeProject.Esame2k20.model;

public class SingleImage {

	/**
	 * Description of the property width.
	 */
	private Integer width = Integer.valueOf(0);

	/**
	 * Description of the property height.
	 */
	private Integer height = Integer.valueOf(0);
	
	/**
	 * Description of the property megapixel.
	 */
	private Double megapixel = Double.valueOf(0);

	/**
	 * Description of the property type.
	 */
	private String type = "";

	/**
	 * Description of the property idImage.
	 */
	private String idImage = "";

	/**
	 * Description of the property url.
	 */
	private String url = "";

	// Start of user code (user defined attributes for Immagine)

	// End of user code

	/**
	 * The constructor.
	 */
	public SingleImage() {
		// Start of user code constructor for Immagine)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Immagine)

	// End of user code
	/**
	 * Returns width.
	 * @return width 
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Sets a value to attribute width. 
	 * @param newWidth 
	 */
	public void setWidth(Integer newWidth) {
		this.width = newWidth;
	}

	/**
	 * Returns height.
	 * @return height 
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Sets a value to attribute height. 
	 * @param newHeight 
	 */
	public void SetHeight(Integer newHeight) {
		this.height = newHeight;
	}
	
	/**
	 * @return the megapixel
	 */
	public Double getMegapixel() {
		return megapixel;
	}

	/**
	 * @param newMegapixel the megapixel to set
	 */
	public void setMegapixel(Double newMegapixel) {
		this.megapixel = newMegapixel;
	}
	/**
	 * Returns type.
	 * @return type 
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Sets a value to attribute type. 
	 * @param newType 
	 */
	public void setTipo(String newType) {
		this.type = newType;
	}

	/**
	 * Returns idImage.
	 * @return idImage 
	 */
	public String getIdImage() {
		return this.idImage;
	}

	/**
	 * Sets a value to attribute idImage. 
	 * @param newIdImage 
	 */
	public void setIdImage(String newIdImage) {
		this.idImage = newIdImage;
	}

	/**
	 * Returns url.
	 * @return url 
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * Sets a value to attribute url. 
	 * @param newUrl 
	 */
	public void setUrl(String newUrl) {
		this.url = newUrl;
	}

	@Override
	public String toString() {
		return "[larghezza=" + width + ", altezza=" + height + ", tipo=" + type + ", idImmagine="
				+ idImage + ", url=" + url + "]";
	}
	
	
}