
@echo off
set jdk=C:\Program Files (x86)\Java\jdk1.7.0_45\bin
set java=C:\Program Files (x86)\Java\jre7\bin
SET CLASSPATH=.;D:\bin\Javalib\antlr-3.5.1-complete-no-st3.jar;%CLASSPATH%

del bin\*.class

"%jdk%\javac" src\*.java src\output\*.java -d bin

cd bin
:: java JsMin ..\samples\input2.js ..\samples\output2.js
echo Modo interativo, digite um comando JavaScript e tecle ENTER
java JsMin 
pause
