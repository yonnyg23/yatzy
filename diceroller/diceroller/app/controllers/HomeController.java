package controllers;

import play.mvc.*;
import java.util.Random;
import play.libs.Json;
import java.util.ArrayList;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	ArrayList<Integer> list = new ArrayList<>();
/**http://localhost:9000/roll*/	
    public Result index() {
        return ok(views.html.index.render());
    }
/**http://localhost:9000/roll*/	
	 public Result roll() {
        Random ran = new Random();
		int x = 1 + ran.nextInt(6);
		return ok(Json.toJson(x));	
    }
/**http://localhost:9000/roll/6*/	
	public Result rollMany(String n){
		list.clear();
		for (int i = 0; i < Integer.parseInt(n); i++) {
			Random ran = new Random();
			int x = 1 + ran.nextInt(6);
			list.add(x);
		}
		return ok(Json.toJson(list));
	}

}
