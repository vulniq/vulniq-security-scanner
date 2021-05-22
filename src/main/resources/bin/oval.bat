@ECHO OFF 

SET dir= %~dp0
cd %dir%

if not exist ..\logs (mkdir ..\logs)

SET OPTS=-Dlog4j.configurationFile=..\conf\log4j2.xml
SET OPTS=%OPTS% -DTERZI_CONFIG_FOLDER=..\conf\
SET OPTS=%OPTS% -DTERZI_CONFIGURATION_FILE=..\conf\terzi.properties
rem SET OPTS=%OPTS% -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=localhost:8187

java %OPTS% -XX:+UseSerialGC -Xmx1G -Xlog:gc:file=..\logs\gc.log:time,level:filecount=1,filesize=10m -cp "./*;../lib/*" -DTERZI_ACTION=oval com.vulniq.client.securityanalyzer.TerziMain %*
