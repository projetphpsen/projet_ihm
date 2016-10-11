#!/bin/bash

javac ChoiceView.java TopPanel.java SiegePanel.java MainPanel.java ProgPanel.java

if [[ $? -eq 0 ]]
then
    java ChoiceView
    exit
fi
