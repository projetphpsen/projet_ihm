#!/bin/bash

javac HomeView.java TopPanel.java ConnexionPanel.java

if [[ $? -eq 0 ]]
then
    java HomeView
    exit
fi
