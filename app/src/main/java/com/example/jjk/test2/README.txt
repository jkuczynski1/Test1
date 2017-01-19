I am currently running this program on Android studio.

To run the Java program (in android studio):

-add the repository to your computer.
-Once it is added, open the repository.
-select Build(. If another pulldown menu opens, then select Main).
-select run, then run 'Main'.

WARNING: these instructions ONLY apply to the c variant labeled test.c

If you are running from windows command line:

-Copy the test.c file to a folder you know the address of.
-Copy down that address for later. (Call this addr_1)
-Download the G++ files for Windows, or some other compiler.
***************************************************************************************************
WARNING: I used Cygwin B20, and attached the installer to this project, labeled full.exe.
I do not own this, and this is free software to use.
If you do NOT use this installer, your steps will be different!
***************************************************************************************************

-Install the compiler (run the exe)
-Now, with the attached compiler installed, click start, and then search for Cygwin B20, then run it.
-After installing your compiler, navigate to the address you copied down earlier.




****************************************************************************************************
TIPS:
-Use DIR command to find the files in current directory, and cd to change directories.
-I suggest keeping a file browser open in the background- it is a good reference for easier navigation.
-To make navigation even easier, you need a starting point of your search.
--To do this, enter the following:
***********************
dir
***********************
then pick the most complex file name you see, and search for it in the file explorer.
This reduces how many folders you have to search through. Search until you find the right folder. (Call this addr_2)
From there, enter
***********************
cd drive name here
***********************
for example, if the complex name was in C:\\Pictures, enter C:\\.

then, you can enter addr_1 like so:
***********************
cd addr_1
***********************
You should be at the correct folder.
****************************************************************************************************




-once you have reached the correct folder in Cygwin B20, enter the following:
***********************
gcc test.c -o test
***********************
this converts the .c file to an .exe.


-Finally, enter the following:
***********************
./test
***********************
This runs the program, and prints Hello world! to the screen.

NOTES (to self):
read Ch. 1