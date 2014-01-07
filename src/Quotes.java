import java.util.ArrayList;
import java.util.HashMap;

public class Quotes {
private HashMap<String, ArrayList<String>> quotesMap; // Maps ArrayLists of quotes to their categories
private final int categoriesNum = 3;

public HashMap<String, ArrayList<String>> createQuotesMap(){
	quotesMap = new HashMap<String, ArrayList<String>>();
	String[] categories = getCategories();
	
	ArrayList<String> q0 = new ArrayList<String>();
	q0.add("Is your name Google? Because you have everything I’ve been looking for. – Y-Hack fortune cookie");
	q0.add("One billion dollars - Boston");
	q0.add("I feel tired - Columbia U");
	q0.add("Welcome to Awesome; everybody’s welcomed! - Around");
	q0.add("Soooo many people - Maryland");
	q0.add("Trapped in tiny spaces but awesome wi-fi! - Maryland ");
	q0.add("It’s 12:41pm, and we still don’t have an idea - NYC & Toronto");
	q0.add("Where’s the food??? - Maryland");
	q0.add("Met lots of smart peeps - Maryland");
	q0.add("Too much pressure...but it’s a lot of fun! - Columbia U");
	q0.add("Great freebies, but we want the sweaters! - Mt Holyoke");
	quotesMap.put(categories[0], q0);
	
	ArrayList<String> q1 = new ArrayList<String>();
	q1.add("The presidency has many problems, but boredom is the least of them. – Richard Nixon");
	q1.add("Boredom: The desire for desires. – Leo Tolstoy");
	q1.add("There are no uninteresting things, only uninterested people. – G. K. Chesterton");
	q1.add("The Beatles saved the world from boredom. – George Harrison");
	q1.add("Boredom was my bedmate and it was hogging the sheets. – Andrew Davidson");
	q1.add("I would rather die of passion than of boredom. – Vincent van Gogh");
	quotesMap.put(categories[1], q1);
	
	ArrayList<String> q2 = new ArrayList<String>();
	q2.add("Strive not to be a success, but rather to be of value. – Albert Einstein");
	q2.add("Hardship often prepares an ordinary person for an extraordinary destiny. – C.S. Lewis");
	q2.add("If you hear a voice within you say " + "\"you cannot paint," + "\" then by all means paint and that voice will be silenced. – Vincent van Gogh");
	q2.add("How wonderful it is that nobody need wait a single moment before starting to improve the world. –Anne Frank");
	q2.add("Education costs money.  But then so does ignorance. –Sir Claus Moser");
	q2.add("You can’t use up creativity.  The more you use, the more you have. –Maya Angelou");
	quotesMap.put(categories[2], q2);
	
	ArrayList<String> q3 = new ArrayList<String>();
	q3.add("I never said half the crap people say I did. – Albert Einstein");
	q3.add("When I die, I want to go peacefully like my grandfather did: in his sleep. Not yelling and screaming like the passengers in his car. – Anon");
	q3.add("Friendship is like peeing on yourself: everyone can see it, but only you get the warm feeling that it brings. – Robert Bloch");
	q3.add("My therapist told me the way to achieve true inner peace is to finish what I start. So far I’ve finished two bags of M&Ms and a chocolate cake. I feel better already. – Dave Barry");
	q3.add("I believe that children are our future. And that terrifies me. – Anon");
	q3.add("When a motivated group of people join together, they can turn problems into opportunities. Especially drinking problems. – Anon");
	q3.add("If you think the problems we create are bad, just wait until you see our solutions. – Anon");
	q3.add("Insanity is hereditary. You get it from your children. – Sam Levenson");
	q3.add("If you imagine Madonna, Bobby Brown, and Dracula had a child, it would be you. But in a weird way I quite liked you. – Simon Cowell");
	quotesMap.put(categories[3], q3);
	
	ArrayList<String> q4 = new ArrayList<String>();
	q4.add("Rule No.1: Never lose money. Rule No.2: Never forget rule No.1. – Warren Buffet");
	q4.add("Always borrow money from a pessimist. He won’t expect it back. – Oscar Wilde");
	q4.add("The hardest thing to understand in the world is the income tax. – Albert Einstein");
	q4.add("Honesty is the best policy – when there is money in it. – Mark Twain");
	q4.add("Money is not the most important thing in the world. Love is. Fortunately, I love money. – Jackie Mason");
	q4.add("It doesn't matter if you're black or white... the only color that really matters is green. – Family Guy");
	quotesMap.put(categories[4], q4);
	
	ArrayList<String> q5 = new ArrayList<String>();
	q5.add("My unexpected hobby is thinking of you, every minute and everyday! – Unknown, but probably Taylor Swift’s");
	q5.add("If I could choose between loving you and breathing I would use my last breath to say I love you. – Anon");
	q5.add("You can't put a price tag on love. But if you could, I'd wait for it to go on sale. — Hussein Nishah");
	q5.add("A friend is someone who knows all about you and still loves you. – Elbert Hubbard");
	q5.add("If love is the answer, could you please rephrase the question? – Lily Tomlin");
	q5.add("My wife is really sentimental. One Valentine's Day I gave her a ring and to this day she has never forgotten those three little words that were engraved inside --- Made in Taiwan! — Leopold Fetchner");
	q5.add("Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that. – Martin Luther King Jr.");
	q5.add( "Love is grand; divorce is a hundred grand. — Unknown");
	quotesMap.put(categories[5], q5);
	
	ArrayList<String> q6 = new ArrayList<String>();
	q6.add("Real knowledge is to know the extent to one’s ignorance. – Confucius");
	q6.add("Philosophy begins in wonder – Plato.");
	q6.add("Philosophy is common sense with big words. – James Madison");
	q6.add("If a man who can’t count finds a four leaf clover, is he lucky? – Stanislaw Lec");
	q6.add("The best time to plant a tree was 20 years ago. The second best time is now. – Chinese Proverb");
	quotesMap.put(categories[6], q6);
	
	ArrayList<String> q7 = new ArrayList<String>();
	q7.add("My name is Inigo Montoya. You killed my father. Prepare to die. – The Princess Bride");
	q7.add("Stellaaaaaaaaaaaa… – Streetcar Named Desire");
	q7.add("E.T. phone home. – E.T. the Extra-Terrestrial");
	q7.add("Bond. James Bond. – Every Bond Movie. Ever.");
	q7.add("Say 'hello' to my little friend! – Scarface");
	q7.add("At your age, you're going to have a lot of urges. You're going to want to take off your clothes, and touch each other. But if you do touch each other, you *will* get chlamydia... and die. – Mean Girls");
	q7.add("Oh yes, the past can hurt. But you can either run from it, or learn from it. – The Lion King");
	q7.add("It takes a great deal of bravery to stand up to your enemies, but a great deal more to stand up to your friends. – Harry Potter and the Sorcerer’s Stone");
	q7.add("Do, or do not. There is no try. – The Empire Strikes Back");
	quotesMap.put(categories[7], q7);
	
	ArrayList<String> q8 = new ArrayList<String>();
	q8.add("The scientific theory I like best is that the rings of Saturn are composed entirely of lost airline luggage.  – Mark Russell");
	q8.add("OK, so what’s the speed of dark? – Steven Wright");
	q8.add("Science does not know its debt to imagination. – Ralph Waldo Emerson");
	q8.add(" Hardware: The parts of a computer system that can be kicked. – Jeff Pesis");
	q8.add("Never memorize something you can look up. – Albert Einstein");
	q8.add("An expert is a person who has made all the mistakes that can be made in a very narrow field. – Niels Bohr");
	q8.add("To iterate is human, to recurse divine. - L. Peter Deutsch");
	quotesMap.put(categories[8], q8);
	
	ArrayList<String> q9 = new ArrayList<String>();
	quotesMap.put(categories[9], q9);
	q9.add("Reality is wrong. Dreams are for real. – Tupac");
	q9.add("I'm not a businessman, I'm a business, man! – Jay-Z");
	q9.add("I got 99 problems, but a bitch aint 1. – Brother Marquise");
	q9.add("Before you came into my life, I missed you so bad. – Carly Rae Jepsen");
	q9.add("Say I maybe gave a damn but I never gave a fuck. – Ace Hood");
	q9.add("I sell ice in the winter, I sell fire in hell / I am a hustler baby / I’ll sell water to a well. – Jay-Z");
	q9.add("I’m trying to find the words to describe this girls without being disrespectful... Damn you a sexy bitch. – David Guetta");
	q9.add("I’m 24/7. Like IHOP — Rick Ross");

	return quotesMap;
}

public int getCategoriesNum() {
	return categoriesNum;
}

public String[] getCategories(){
	String[] categories = new String[]{"Y-hack", "Boredom", "Motivational", "Demotivational", "Money", "Love", "Philosophy", "Movies", "Science", "Rap and Pop"};
	return categories;
}

}
