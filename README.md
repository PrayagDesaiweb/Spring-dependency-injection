# Spring-dependency-injection
Spring dependency injection
Outsource the construction and injection of your object to the externam 
Entity

The steps for constructor dependency injection
1. Define the dependency interface and the class.
2. Create a constructor in your class for injections.
3. Configure the dependency injection in the spring file.

2 types of dependency injection
1. Constructor injection
2. Setter injection. Here the dependencies is injected by calling setter method to your class


Setter injection
1. Create a setter method in the class for setter injection
2. Configure the dependency and the spring config file

Injecting literal values
1. Create setter methods in your class for injections.
2. Configure the injections in spring configuration file.
In the <property> in spring config file, value is used for literal values and ref for objects.

Steps to obtain the properties from the properties file.
1.Create properties file
2.Load the properties file in the spring config file
3.reference the vales from the properties file
