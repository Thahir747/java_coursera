#!/bin/bash
git init
git add .
git commit -m "Updated on: $(date '+%Y-%m-%d %H:%M:%S')"
git remote add origin https://github.com/Thahir747/java_coursera
git push -u origin master