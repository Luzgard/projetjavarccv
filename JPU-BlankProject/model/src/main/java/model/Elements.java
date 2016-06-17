package model;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class Elements extends Entity {

	/** The id. */
	private int			id;

	/** The position X. */
	private int	x_positions;

	/** The position Y. */
	private int	y_positions;

	/**
	 * Instantiates a new element.
	 *
	 * @param id
	 *          the id
	 * @param x_positions
	 *          the x_positions
	 * @param y_positions
	 *          the y_positions
	 */
	public Elements(final int id, final int x_positions, final int y_positions) {
		this.setId(id);
		this.setPosX(x_positions);
		this.setPosY(y_positions);
	}

	/**
	 * Instantiates a new element.
	 */
	public Elements() {
		this(0, 0, 0);
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public int getPosX() {
		return this.x_positions;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
	public void setPosX(final int x_positions) {
		this.x_positions = x_positions;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public int getPosY() {
		return this.y_positions;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	public void setPosY(final int y_positions) {
		this.y_positions = y_positions;
	}

}
