#!/bin/sh

cd "${0%/*}"

if [ ! -d "../logs" ]; then
  mkdir ../logs
fi


OPTS="-Dlog4j.configurationFile=../conf/log4j2.xml "
OPTS="$OPTS -DTERZI_CONFIG_FOLDER=../conf/ "
OPTS="$OPTS -DTERZI_CONFIGURATION_FILE=../conf/terzi.properties "


java $OPTS -XX:+UseSerialGC -Xmx1G -Xlog:gc:file=../logs/gc.log:time,level:filecount=1,filesize=10m -cp "./*:../lib/*" -DTERZI_ACTION=info com.vulniq.client.securityanalyzer.TerziMain "$@"
