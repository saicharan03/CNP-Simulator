package kanbanBoard;

public class KanbanElement {
	public int[] location = new int[2];
	public String value = "";
	public int[] color = new int[3];
	
	public KanbanElement(int x,int y,String value,int r,int g,int b) {
		this.location[0]=x;location[1]=y;
		this.value = value;
		this.color[0]=r;this.color[1]=g;this.color[2]=b;
	}
	public String getValue() {
		return value;
	}
	public int getColorR() {
		return color[0];
	}
	public int getColorG() {
		return color[1];
	}
	public int getColorB() {
		return color[2];
	}
}
