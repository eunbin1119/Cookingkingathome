package Scene;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class TableRowDataModel {
	private IntegerProperty No;
	private StringProperty Title;
	private StringProperty Author;
	
	public TableRowDataModel(IntegerProperty No, StringProperty Title, StringProperty Author) {
		this.No = No;
		this.Title = Title;
		this.Author = Author;
	}
	
	public StringProperty noProperty() {
		return No;
	}
	public StringProperty titleProperty() {
		return Title;
	}
	public StringProperty authorProperty() {
		return Author;
	}

}
