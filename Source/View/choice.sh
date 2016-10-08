#!/bin/bash

javac ChoiceView.java TopPanel.java SiegePanel.java Img.java

if [[ $? -eq 0 ]]
then
    java ChoiceView
    exit
fi
