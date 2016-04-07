package at.joma.simple;

import static io.undertow.Handlers.resource;
import io.undertow.Undertow;
import io.undertow.server.handlers.resource.PathResourceManager;

import java.nio.file.Paths;

public class Webserver {

	public static void main(final String[] args) {
		Undertow server = Undertow.builder().addHttpListener(8080, "10.42.0.1")
				.setHandler(resource(new PathResourceManager(Paths.get(""), 100)).setDirectoryListingEnabled(true)).build();
		server.start();
	}

}
