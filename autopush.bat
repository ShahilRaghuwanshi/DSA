@echo off
:loop
git pull origin master
git add .
git commit -m "Auto-update: %date% %time%"
git push origin master
timeout /t 300
goto loop