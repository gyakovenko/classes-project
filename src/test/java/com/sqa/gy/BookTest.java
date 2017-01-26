package com.sqa.gy;

import org.junit.*;

public class BookTest {

	@Test // Level 3 Constructor with Translator
	public void BlindWillowSleepingWomanTest() {
		String expected = "\nBlind Willow, Sleeping Woman is a fantasy book written by Haruki Murakami. \nThis book contains 24 stories, has 384 pages, and costs $12.44. \nThis book was translated by Philip Gabriel and Jay Rubin. \nYou are currently reading this book. ";
		Book book4 = new Book("Blind Willow, Sleeping Woman", "Haruki Murakami", "Philip Gabriel and Jay Rubin",
				Genre.FANTASY, false, 24, 384, 12.44, ReadingStatus.READING);
		System.out.println(book4);
		System.out.println("-----------------------------");
		Assert.assertEquals("Blind Willow, Sleeping Woman was not created correctly.", expected, book4.toString());
	}

	@Test // Level 1 Constructor
	public void oneQ84test() {
		String expected = "\n1Q84 is a fantasy book written by Haruki Murakami. ";
		Book book1 = new Book("1Q84", "Haruki Murakami", Genre.FANTASY);
		System.out.println(book1);
		System.out.println("-----------------------------");
		Assert.assertEquals("Record for 1Q84 was not created correctly.", expected, book1.toString());
	}

	@Test // Level 2 Constructor
	public void parableOfTheSowerTest() {
		String expected = "\nParable of the Sower is a fantasy book written by Octavia E. Bulter. \nThis book is one story, not a collection of stories, has 352 pages, and costs $9.51. \nYou have finished reading this book. ";
		Book book2 = new Book("Parable of the Sower", "Octavia E. Bulter", Genre.FANTASY, 1, 352, 9.51,
				ReadingStatus.READFULLY);
		System.out.println(book2);
		System.out.println("-----------------------------");
		Assert.assertEquals("Record for Parable of the Sower was not created correctly.", expected, book2.toString());
	}

	@Test
	public void printRandomQuoteTest() {
		Book book5 = new Book("Blind Willow, Sleeping Woman", "Haruki Murakami", "Philip Gabriel and Jay Rubin",
				Genre.FANTASY, false, 24, 384, 12.44, ReadingStatus.READING);
		setupForTestPrintRandomQuote(book5);
		// just testing the first one for now by setting the random to 1. looks
		// good, but is failing. added \n to beg and end of just this one for
		// now.
		String expected1 = "\nQuote from Blind Willow, Sleeping Woman:\n\t\"1971 was the year of spaghetti. In 1971 I cooked spaghetti to live, "
				+ "\n\tand lived to cook spaghetti. Steam rising from the pot was my pride "
				+ "\n\tand joy, tomato sauce bubbling up in the saucepan my one great hope "
				+ "\n\tin life...This is the story from the Year of Spaghetti, AD 1971.\"\n";
		String expected2 = "\nQuote from Blind Willow, Sleeping Woman:\n\t\"I\'m not sure if I could tell the difference—between just staring "
				+ "\n\tinto space and thinking. We\'re usually thinking all the time, aren\'t we? "
				+ "\n\tNot that we live in order to think, but the opposite isn\'t true either—"
				+ "\n\tthat we think in order to live. I believe, contrary to Descartes, that we "
				+ "\n\tsometimes think in order not to be. Staring into space might unintentionally "
				+ "\n\thave the opposite effect.\"\n";
		String expected3 = "\nQuote from Blind Willow, Sleeping Woman:\n\t\"It was as if my whole life revolved around trying to judge the appropriate "
				+ "\n\tpoint in a conversation to say goodbye\"\n";
		String expected4 = "\nQuote from Blind Willow, Sleeping Woman:\n\t\"We were merely observers, getting totally absorbed in some exciting movie, "
				+ "\n\tour palms all sweaty, only to find that, after the houselights came on and "
				+ "\n\twe exited the theater, the thrilling afterglow that coursed through us "
				+ "\n\tultimately meant nothing whatsoever.\"\n";
		// until I did this, it was failing sometimes. Im guessing because
		// having
		// book5.returnRandomQuote() == each string calls it 4 times and if none
		// of the
		// 4 match it will fail. Now the one printed is the one compared to all
		// four
		// possible expecteds.
		String quote = book5.returnRandomQuote();
		System.out.println(quote);
		System.out.println("-----------------------------");
		Assert.assertTrue("Random Quote Failed", (quote.equals(expected1) || quote.equalsIgnoreCase(expected2)
				|| quote.equalsIgnoreCase(expected3) || quote.equalsIgnoreCase(expected4)));
	}

	@Test
	public void returnPercentOfBookReadTest() {
		Book book7 = new Book("Blind Willow, Sleeping Woman", "Haruki Murakami", "Philip Gabriel and Jay Rubin",
				Genre.FANTASY, false, 24, 384, 12.44, ReadingStatus.READING);
		int expected = 33;
		System.out.println(book7.returnPercentOfBookRead(128) + "% read");
		Assert.assertTrue("Correct percent read not returned", expected == book7.returnPercentOfBookRead(128));
	}

	@Test // Level 3 Constructor but in English
	public void SayYoureOneOfThemTest() {
		String expected = "\nSay You\'re One Of Them is a realistic fiction book written by Uwem Akpan. \nThis book contains 5 stories, has 294 pages, and costs $12.85. \nYou hope to read this book. ";
		Book book3 = new Book("Say You\'re One Of Them", "Uwem Akpan", "NA", Genre.REALISTICFICTION, true, 5, 294,
				12.85, ReadingStatus.TOREAD);
		System.out.println(book3);
		System.out.println("-----------------------------");
		Assert.assertEquals("Record for Say You\'re One Of Them was not created correctly.", expected,
				book3.toString());
	}

	@Test // Level 2 Constructor
	public void theThingAroundYourNeckTest() {
		String expected = "\nThe Thing Around Your Neck is a realistic fiction book written by Chimamanda Ngozi Adichie. \nThis book contains 12 stories, has 300 pages, and costs $9.97. \nYou have finished reading this book. ";
		Book book5 = new Book("The Thing Around Your Neck", "Chimamanda Ngozi Adichie", Genre.REALISTICFICTION, 12, 300,
				9.97, ReadingStatus.READFULLY);
		System.out.println(book5);
		System.out.println("-----------------------------");
		Assert.assertEquals("Record for The Thing Around Your Neck was not created correctly.", expected,
				book5.toString());
	}

	@Test
	public void updateBookRecordInfoTest() {
		Book book6 = new Book("1Q84", "Haruki Murakami", Genre.FANTASY);
		String expected = "\n1Q84 is a fantasy book written by Haruki Murakami. \nThis book is one story, not a collection of stories, has 928 pages, and costs $10.09. ";
		System.out.println("\nOriginal book record:" + book6);
		book6.updateRecordValue("number of pages", "928");
		book6.updateRecordValue("price", "10.09");
		System.out.println("Updated book record:" + book6);
		System.out.println("-----------------------------");
		Assert.assertEquals("Record not updated correctly.", expected, book6.toString());
	}

	private void setupForTestPrintRandomQuote(Book book5) {
		book5.setQuotes(
				"\t\"1971 was the year of spaghetti. In 1971 I cooked spaghetti to live, "
						+ "\n\tand lived to cook spaghetti. Steam rising from the pot was my pride "
						+ "\n\tand joy, tomato sauce bubbling up in the saucepan my one great hope "
						+ "\n\tin life...This is the story from the Year of Spaghetti, AD 1971.\"",
				"\t\"I\'m not sure if I could tell the difference—between just staring "
						+ "\n\tinto space and thinking. We\'re usually thinking all the time, aren\'t we? "
						+ "\n\tNot that we live in order to think, but the opposite isn\'t true either—"
						+ "\n\tthat we think in order to live. I believe, contrary to Descartes, that we "
						+ "\n\tsometimes think in order not to be. Staring into space might unintentionally "
						+ "\n\thave the opposite effect.\"",
				"\t\"It was as if my whole life revolved around trying to judge the appropriate "
						+ "\n\tpoint in a conversation to say goodbye\"",
				"\t\"We were merely observers, getting totally absorbed in some exciting movie, "
						+ "\n\tour palms all sweaty, only to find that, after the houselights came on and "
						+ "\n\twe exited the theater, the thrilling afterglow that coursed through us "
						+ "\n\tultimately meant nothing whatsoever.\"");
	}

}
