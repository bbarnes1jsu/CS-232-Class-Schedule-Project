# CS-232-Class-Schedule-Project
I created this program for my CS 232 programming course. This is the first project and our goal is to create a simplified verison of the JSU student registration system. We are tasked with retriving the data from a *tab-delimited* CSV format file that contains the Mathemathics and Computer Science Courses for the Spring 2018 semester.

My task for this project is to implement a system which will allow the user to:

     * Search for specfic courses in the data base by course number, which should return a list of section(s) available for each course.
     * Register for a specfic course and section by entering the corrseponding CRN number. The system should not allow the user to register for classes which conflict with each other.
     * View the trial schedule, in the form of a list of the courses that have been added to the schedule so far.
     
Each of these will be chosen by the user from a simple menu.

![Imgur](https://i.imgur.com/ebJYjku.png)

Selecting the first option will prompt you to search for courses by the course number. 

![Imgur](https://i.imgur.com/RTUPxjs.png)

It will then display all the courses under that course number.

![Imgur](https://i.imgur.com/Xn3j8AI.png)

After retriving the courses, the program will redirect you to the menu where you will select the second option to register for the course. After selecting the second choice, you will be asked for the CRN number. The CRN number is the five digit number after the title of the course. After entering the the CRN number, the course will be added to your schedule.

![Imgur](https://i.imgur.com/8mJp1Ic.png)

After successfully adding the course or failing due to a conflict, you will be redirected to the menu. You will be notified if the course was successfully added or failed to add due to a conflict. You can select the first choice again to search for another course or the second choice again if you failed. 
The third menu choice allows you to view the schedule if you would like to see what your current schedule looks like.

![Imgur](https://i.imgur.com/LFyi8Pj.png)

The fourth menu option will allows you to quit out of the program. 

![Imgur](https://i.imgur.com/W9H26wW.png)

I made this program using Java in Netbeans. I scored a 100/100.

Thanks for reading , Brandon Barnes.
