# Building Terzi

This is a maven project so you can build using standard maven commands.
Typically you will want to use `mvn compile package` or 
`mvn compile package -DskipTests=true`, skipping unit tests might be easier
because unit tests have some prerequisites like docker setup, VulnIQ access token configuration etc.


## Unit tests

Unit tests include content from https://github.com/OVALProject/Test-Content repository. 

Unit tests require docker container setup, see test-dockers folders.



# Run

Terzi requires java 11. It is not tested or supported with other versions of java.  