package controllers;

import java.util.Random;

import com.wings.framework.global.Controller;
import com.wings.framework.global.View;

public class HomeController extends Controller {
	
	String[] quotes = {
						"Be not afraid of going slowly, be afraid only of standing still.",
						"Great things are done by a series of small things brought together.",
						"Learn from yesterday, live for today, hope for tomorrow.",
						"Only those who dare to fail greatly can ever achieve greatly.",
						"In teaching others we teach ourselves.",
						"God couldn't be everywhere, so he created mothers.",
						"Birds born in cages think that flying is a disease.",
						"Everyone you will ever meet knows something you don't."
					  };
	
	public void home() {
		Random random = new Random();
		int randomNumber = random.nextInt( quotes.length );
		attrib("quote", quotes[randomNumber]);
		View.render("views/app/home");
	}

}
