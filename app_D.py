import os
from random import randint
from datetime import datetime, timedelta

year = 2023  # Specify the desired year
start_date = datetime(year, 1, 1)  # January 1st of the specified year

for i in range(0, 365):  # Loop over 365 days (1 year)
    commit_date = start_date + timedelta(days=i)  # Get the exact date
    formatted_date = commit_date.strftime('%Y-%m-%d %H:%M:%S')  # Format as "YYYY-MM-DD HH:MM:SS"

    for j in range(0, randint(1, 10)):  # Random commits per day
        with open('file_new.txt', 'a') as file:  # Open file in append mode
            file.write(formatted_date + '\n')  # Write the commit date
        
        os.system('git add .')  # Stage changes
        os.system(f'GIT_AUTHOR_DATE="{formatted_date}" GIT_COMMITTER_DATE="{formatted_date}" git commit -m "commit"')  # Commit with exact timestamp

os.system('git push -u origin main')  # Push commits to GitHub
print("Code Successfully Completed")
