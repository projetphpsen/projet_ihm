#!/bin/bash

javac ChoiceView.java TopPanel.java

if [[ $? -eq 0 ]]
then
    java ChoiceView
    exit
fi
