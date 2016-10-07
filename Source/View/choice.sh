#!/bin/bash

javac ChoiceView.java TopPanel.java ProgPanel.java SiegePanel.java

if [[ $? -eq 0 ]]
then
    java ChoiceView
    exit
fi
