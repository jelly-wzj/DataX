#!/bin/sh

SCRIPT_HOME=$(cd $(dirname $0); pwd)
cd $SCRIPT_HOME/..
mvn clean package -DskipTests assembly:assembly

cd $SCRIPT_HOME/target/datax/plugin/reader/

if [ -d "esreader" ]; then
    tar -zcvf esreader.tgz esreader
    cp esreader.tgz $SCRIPT_HOME
    cd $SCRIPT_HOME
ansible-playbook -i hosts main.yml -u vagrant -k
fi




