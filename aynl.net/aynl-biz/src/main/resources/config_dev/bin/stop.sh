#!/bin/bash
#setting Java version
export JAVA_HOME=/usr/java/jdk1.8.0_92
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$JAVA_HOME/bin:.:$PATH
#setting services dir
SERVER=/opt/docren

cd $SERVER
JAR_NAME=`ls -l |grep *.jar |grep ^[^d] | awk '{print $9}'`
MAIN_CLASS=docren.com.biz.Run
#JAR_NAME=$(basename $JAR_DIR_NAME .jar)

function services_start(){
    echo "start dubbo services ..."
    java  -Dfile.encoding=utf-8 -Djava.ext.dirs=./lib -cp $JAR_NAME $MAIN_CLASS >> /dev/null 2>&1 &
    echo $! > $SERVER/server.pid
    echo "start dubbo services end..."
}

#服务停止
function services_stop(){
    echo "stop dubbo services start..."
    kill -15 `cat $SERVER/server.pid`
    rm -rf $SERVER/server.pid
    echo "stop dubbo services end..."
}

#服务重启
function services_restart(){
    services_stop
    sleep 3
    services_start
}

echo "server stop apc dubbo"

services_stop

echo "ok"