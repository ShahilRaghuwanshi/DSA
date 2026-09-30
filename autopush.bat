@echo off
:loop
git add .
git commit -m "Auto-update: %date% %time%"
git push origin master
timeout /t 300
goto loop