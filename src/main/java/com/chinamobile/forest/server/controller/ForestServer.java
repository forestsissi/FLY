package com.chinamobile.forest.server.controller; /**
 * Licensed to
 * Created by admin on 11/7/16.
 */


/**
 *
 */

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.SessionIdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class ForestServer {
  private static Logger LOG = LoggerFactory.getLogger(ForestServer.class);


  /**
   * Session ID manager.
   */
  @Inject
  SessionIdManager sessionIdManager;

  private Server server = null;

  public void run() throws Exception {
    server = new Server();
    server.setSessionIdManager(sessionIdManager);


  }

  public void stop() {
    try {
      server.stop();

    } catch (Throwable t) {
      LOG.info("");
    }

  }

  public static void main(String args[]) throws Exception {

    ForestServer server = null;

    try {
      LOG.info("Start ");

    } catch (Throwable t) {
      LOG.error("Failed to run the Forest Server", t);
      if (server != null) {
        server.stop();
      }
      System.exit(-1);

    }


  }

}
