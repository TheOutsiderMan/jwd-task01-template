package by.tc.task01.entity;

public class TabletPC extends Appliance {

	private double batteryCapacity;
	private double displayInches;
	private double memoryRom;
	private double flashMemoryCapacity;
	private String color;

	public TabletPC() {

	}

	public TabletPC(double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity,
			String color) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		temp = Double.doubleToLongBits(displayInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(flashMemoryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memoryRom);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches))
			return false;
		if (Double.doubleToLongBits(flashMemoryCapacity) != Double.doubleToLongBits(other.flashMemoryCapacity))
			return false;
		if (Double.doubleToLongBits(memoryRom) != Double.doubleToLongBits(other.memoryRom))
			return false;
		return true;
	}
	
}
