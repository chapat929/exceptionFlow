HEAD FIRST JAVA
Chapter 11 Exception Handling
Page 328

What would the output be if String test = "yes"
start try
start doRisky
Scary Exception
finally
end of main


If String test = "no" then output is:
start doRisky
end doRisky
end try
finally
end of main


StackTrace for new Exception class:
com.chandni.ScaryException
	at com.chandni.Main.doRisky(Main.java:25)
	at com.chandni.Main.main(Main.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
