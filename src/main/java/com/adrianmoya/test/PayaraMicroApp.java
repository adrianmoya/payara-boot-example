package com.adrianmoya.test;

import java.io.File;
import java.nio.file.Files;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;

public class PayaraMicroApp {

	private static void startAndDeploy(Archive<?> archive) {


	      try {
	        String tomeeDir = Files.createTempDirectory("apache-tomee").toFile().getAbsolutePath();
	        final File app = new File(Files.createTempDirectory("app").toFile().getAbsolutePath());
	        app.deleteOnExit();

	        File target = new File(app, "app.war");
	        archive.as(ZipExporter.class).exportTo(target, true);

	      } catch (Exception e) {
	          throw new IllegalArgumentException(e);
	      }

	  }


}
