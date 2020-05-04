package com.example.singleton;

public class Logger {
  private static Logger logger;
  private Logger(){}

  public static Logger getInstance() {
    if(logger==null) {
      Logger.logger = new Logger();
    }
    return Logger.logger;
  }

  public void info(String msg) {
    System.out.println(msg);
  }

  public void error(String msg){
    System.err.println(msg);
  }

}