package com.chinamobile.forest.server;

import java.util.TreeSet;

/**
 * Created by admin on 11/10/16.
 *
 */
public class Test {


  public  static  void main(String args[]) throws Exception {
    TreeSet<String> set = new TreeSet<String>();
    set.add("RULE:[1:$1@$0](ambari-qa@BCHKDC)s/.*/ambari-qa/");

    set.add("RULE:[1:$1@$0](^.*@BCHKDC$)s/^(.*)@BCHKDC$/$1/g");
    set.add("RULE:[1:$1@$0](hbase-hcontrol@BCHKDC)s/.*/hbase/");
    set.add("RULE:[1:$1@$0](impala-hcontrol@BCHKDC)s/.*/impala/");
    set.add("RULE:[1:$1@$0](hdfs@BCHKDC)s/.*/hdfs/");
    set.add("RULE:[2:$1@$0](amshbase@BCHKDC)s/.*/ams/");
    set.add("RULE:[1:$1@$0](.*@BCHKDC)s/@.*//");
    System.out.print("set: " + set.toString());

  }
}
