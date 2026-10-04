@echo off
:loop
git pull origin master --rebase
git add .

:: PowerShell se Date (04-Oct-2026), Time aur AM/PM fetch karna
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'dd-MMM-yyyy hh:mm:ss tt'"') do set datetime=%%a

git commit -m "%datetime%"
git push origin master

timeout /t 300
goto loop