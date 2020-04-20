@echo off
SET THEFILE=d:\videoa~1\algori~1\pascal\saldo.exe
echo Linking %THEFILE%
d:\dev-pas\bin\ldw.exe  -s   -b base.$$$ -o d:\videoa~1\algori~1\pascal\saldo.exe link.res
if errorlevel 1 goto linkend
goto end
:asmend
echo An error occured while assembling %THEFILE%
goto end
:linkend
echo An error occured while linking %THEFILE%
:end
