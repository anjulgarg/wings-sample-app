package routes;

import com.wings.framework.routing.Get;

/**
 * <code>public class Routes</code>
 * <p>
 * This class contains all the route declarations for
 * this application.
 * </p>
 * <p>
 * Routes can be <code>GET</code>, <code>POST</code>,
 * <code>PUT</code> or <code>DELETE</code>
 * </p>
 * 
 * <p>Examples :</p>
 * <pre>new Get ( "/user/{userId}", "controllers.HomeController@home" );</pre>
 * <pre>new Post ( "/", "controllers.HomeController@home" );</pre>
 * <pre>new Put ( "/", "controllers.HomeController@home" );</pre>
 * <pre>new Delete ( "/", "controllers.HomeController@home" );</pre>
 * <br>
 * <pre>new Get ( "/user/*", "middleware", "middlewares.Auth@userAuth" );</pre>
 * 
 * @author Anjul Garg <anjulgarg@live.com>
 *
 */
public class Routes {
	
	public Routes() {
		new Get ( "/", "controllers.HomeController@home" );
		new Get ( "/home", "controllers.HomeController@home" );
	}
}
