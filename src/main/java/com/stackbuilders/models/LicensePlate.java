package com.stackbuilders.models;

public class LicensePlate {
	private String letters;
	private String numbers;
	
	public LicensePlate() {
		super();
	}

	public LicensePlate(String letters, String numbers) {
		super();
		this.letters = letters;
		this.numbers = numbers;
	}

	public String getLetters() {
		return letters;
	}

	public void setLetters(String letters) {
		this.letters = letters;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "["+letters+" - "+numbers+"]";
	}
	

}
