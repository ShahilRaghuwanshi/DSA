@echo off
:loop
git pull origin master --rebase
git add .
git commit -m "%date% %time%"
git push origin master
timeout /t 300
goto loop