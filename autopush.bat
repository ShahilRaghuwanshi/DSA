@echo off
:loop
git pull origin master --rebase
git add .

:: Time pehle aur Date baad me (09:25:23 AM | 04-Oct-2026)
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set datetime=%%a

git commit -m "%datetime%"
git push origin master

timeout /t 300
goto loop