package net.leibi.versiontest.service;

import net.leibi.versiontest.betaprocessor.Beta;

@Beta(forFeature = "New cool feature")
public interface ANewService
{
   String sayHello(String name);
}
