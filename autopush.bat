@echo off
:loop
git pull origin master --rebase
git add .

:: PowerShell se exact 12-hour format with AM/PM date-time fetch karna
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'yyyy-MM-dd hh:mm:ss tt'"') do set datetime=%%a

git commit -m "%datetime%"
git push origin master

timeout /t 300
goto loop