/**
 *   File Name: Books.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 24, 2017
 *
 */

package com.sqa.gy;

import java.text.*;
import java.util.*;

/**
 * Books
 *
 * @author Yakovenko, Galina
 */
public class Book {

	private String authorEditor;
	private Genre genre;
	private int numOfPages;
	private int numOfStories;
	private double price;
	private String[] quotes = new String[4];
	private ReadingStatus readingStatus;
	private String title;
	private String translator;
	private boolean writtenInEnglish;
	DecimalFormat dfMoney = new DecimalFormat("$#.##");

	public Book(String title, String authorEditor, Genre genre) {
		this();
		this.title = title;
		this.authorEditor = authorEditor;
		this.genre = genre;
	}

	public Book(String title, String authorEditor, Genre genre, int numOfStories, int numOfPages, double price,
			ReadingStatus readingStatus) {
		this(title, authorEditor, genre);
		this.numOfStories = numOfStories;
		this.numOfPages = numOfPages;
		this.price = price;
		this.readingStatus = readingStatus;
	}

	private Book() {
		this.title = "Unknown";
		this.authorEditor = "Unknown";
		this.translator = "NA";
		this.genre = Genre.OTHER;
		this.writtenInEnglish = true;
		this.numOfStories = 1;
		this.numOfPages = 0;
		this.price = 0;
		this.readingStatus = ReadingStatus.NONE;
		for (int i = 0; i < this.quotes.length; i++) {
			this.quotes[i] = "";
		}
	}

	Book(String title, String authorEditor, String translator, Genre genre, boolean writtenInEnglish, int numOfStories,
			int numOfPages, double price, ReadingStatus readingStatus) {
		this(title, authorEditor, genre, numOfStories, numOfPages, price, readingStatus);
		this.translator = translator;
		this.numOfStories = numOfStories;
		this.numOfPages = numOfPages;
		this.price = price;
		this.readingStatus = readingStatus;
		this.writtenInEnglish = writtenInEnglish;
	}

	public String getAuthorEditor() {
		return this.authorEditor;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public int getNumOfPages() {
		return this.numOfPages;
	}

	public int getNumOfStories() {
		return this.numOfStories;
	}

	public double getPrice() {
		return this.price;
	}

	public String[] getQuotes() {
		return this.quotes;
	}

	public ReadingStatus getReadingStatus() {
		return this.readingStatus;
	}

	public String getTitle() {
		return this.title;
	}

	public String getTranslator() {
		return this.translator;
	}

	public boolean isWrittenInEnglish() {
		return this.writtenInEnglish;
	}

	public int returnPercentOfBookRead(double pagesRead) {
		double percentReadNotRounded = pagesRead / this.numOfPages;
		percentReadNotRounded = percentReadNotRounded * 100;
		int percentReadRounded = (int) Math.rint(percentReadNotRounded);
		return percentReadRounded;
	}

	public String returnRandomQuote() {
		Random randomIndex = new Random();
		return ("\nQuote from " + this.title + ":\n" + this.quotes[randomIndex.nextInt(4)] + "\n");
	}

	public void setAuthorEditor(String authorEditor) {
		this.authorEditor = authorEditor;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public void setNumOfStories(int numOfStories) {
		this.numOfStories = numOfStories;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuotes(String string1, String string2, String string3, String string4) {
		this.quotes[0] = string1;
		this.quotes[1] = string2;
		this.quotes[2] = string3;
		this.quotes[3] = string4;
	}

	public void setReadingStatus(ReadingStatus readingStatus) {
		this.readingStatus = readingStatus;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public void setWrittenInEnglish(boolean writtenInEnglish) {
		this.writtenInEnglish = writtenInEnglish;
	}

	@Override
	public String toString() {
		String genreString;
		if (this.genre == Genre.FANTASY) {
			genreString = "fantasy";
		} else if (this.genre == Genre.REALISTICFICTION) {
			genreString = "realistic fiction";
		} else if (this.genre == Genre.SCIENCEFICTON) {
			genreString = "science fiction";
		} else {
			genreString = "genre undetermined";
		}

		String stringOutput1 = "\n" + this.title + " is a " + genreString + " book written by " + this.authorEditor
				+ ". ";
		String stringOutput2 = "";
		String stringOutput3 = "";
		String stringOutput4 = "";
		if (this.numOfPages != 0) {
			if (this.numOfStories == 1) {
				stringOutput2 = "\nThis book is one story, not a collection of stories, has " + this.numOfPages
						+ " pages, and costs " + this.dfMoney.format(this.price) + ". ";
			} else {
				stringOutput2 = "\nThis book contains " + this.numOfStories + " stories, has " + this.numOfPages
						+ " pages, and costs " + this.dfMoney.format(this.price) + ". ";
			}
			if (this.writtenInEnglish == false) {
				stringOutput3 = "\nThis book was translated by " + this.translator + ". ";
			}
			if (this.readingStatus != ReadingStatus.NONE) {
				if (this.readingStatus == ReadingStatus.READFULLY) {
					stringOutput4 = "\nYou have finished reading this book. ";
				} else if (this.readingStatus == ReadingStatus.READING) {
					stringOutput4 = "\nYou are currently reading this book. ";
				} else if (this.readingStatus == ReadingStatus.READSOMEANDWILLNOTFINISH) {
					stringOutput4 = "\nYou started reading this book and abandoned it. ";
				} else if (this.readingStatus == ReadingStatus.TOREAD) {
					stringOutput4 = "\nYou hope to read this book. ";
				}
			}
		}
		return stringOutput1 + stringOutput2 + stringOutput3 + stringOutput4;
	}

	public void updateRecordValue(String whichParameter, String newValue) {
		switch (whichParameter) {
		case "author editor":
			this.setAuthorEditor(newValue);
			break;
		case "genre":
			switch (newValue) {
			case "fantasy":
				this.setGenre(Genre.FANTASY);
				break;
			case "realistic fiction":
				this.setGenre(Genre.REALISTICFICTION);
				break;
			case "science fiction":
				this.setGenre(Genre.SCIENCEFICTON);
				break;
			case "other":
				this.setGenre(Genre.OTHER);
				break;
			default:
				break;
			}
			break;
		case "number of pages":
			this.setNumOfPages(Integer.parseInt(newValue));
			break;
		case "number of stories":
			this.setNumOfStories(Integer.parseInt(newValue));
			break;
		case "price":
			this.setPrice(Double.parseDouble(newValue));
			break;
		case "reading status":
			switch (newValue) {
			case "reading":
				this.setReadingStatus(ReadingStatus.READING);
				break;
			case "to ready":
				this.setReadingStatus(ReadingStatus.TOREAD);
				break;
			case "read":
				this.setReadingStatus(ReadingStatus.READFULLY);
				break;
			case "none":
				this.setReadingStatus(ReadingStatus.NONE);
				break;
			case "read some":
				this.setReadingStatus(ReadingStatus.READSOMEANDWILLNOTFINISH);
				break;
			default:
				break;
			}
			break;
		case "title":
			this.setTitle(newValue);
			break;
		case "translator":
			this.setTranslator(newValue);
			break;
		case "written in english":
			switch (newValue) {
			case "yes":
				this.setWrittenInEnglish(true);
				break;
			case "no":
				this.setWrittenInEnglish(false);
				break;

			default:
				break;
			}
			break;
		default:
			break;
		}
	}
}
