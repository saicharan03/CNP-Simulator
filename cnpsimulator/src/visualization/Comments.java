package visualization;

public class Comments {
	private String comments = "";
	
	public void addComment (String newComment) {
		this.comments += newComment+"\n";
	}
	public String getComments() {
		return this.comments;
	}
}
