package net.leibi.versiontest.service;


import net.leibi.versiontest.betaannotation.LeibiBeta;

@LeibiBeta(forFeature = "New cool feature")
public interface ANewService
{
   String sayHello(String name);
}
