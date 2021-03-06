package br.com.dbarreto.ml.types;

public class Label implements Comparable<Label> {

	private String text;
	
	public Label() {}
	
	public Label(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Label other = (Label) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public int compareTo(Label label) {
		if (this == label) return 0;
		return this.getText().compareTo(label.getText());
	}

	@Override
	public String toString() {
		return "Label [" + text + "]";
	}
}
