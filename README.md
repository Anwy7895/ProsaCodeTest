# ProsaCodeTest
This is a repository for a test run of Prosa code competition

**NetBeans project**



Assignment: 
Upload your answers to your git repository, including the result video no later than April 18th 12:00.
You decide which code language you want to use.



Exercises:
1. Generate a name using stars (*) for the letters and hyphens (-) for everything else. The name can be
generated by user input or be decided in advance, it is up to you.
Example name: ALEX
- - * - - * - - - * * * - * - * -
- * - * - * - - - * - - - * - * -
- * * * - * - - - * * - - - * - -
- * - * - * - - - * - - - * - * -
- * - * - * * * - * * * - * - * -

Note for edit: I have chosen to use # instead of * since I find it easier to read when written in the console
- * * * -   - # # # -
* - - - *   # - - - #
* - - - *   # - - - #
* * * * *   # # # # #
* - - - *   # - - - #
* - - - *   # - - - #
* - - - *   # - - - #
I have also changed the size of all the letters from 3x5 to 5x7 due to some readability in certain letters such as M

        # - #   # - - - #
        
        # # #   # # - # #
        
        # - #   # - # - #
        
        # - #   # - - - #
        
        # - #   # - - - #
        
                # - - - #
                
                # - - - #



2. Now, imagine the stars (*[#]) as being alive cells, and the hyphens (-) as being dead cells. A cell can
change state (dead or alive) depending on their surroundings, as the cells interact with their
neighbor cells (i.e., the eight surrounding cells: above, below, upper-left etc.). These interactions will
run in generations recursively until all cells are dead or the user stops the program. 
[I have chaned this to only run 20 steps to avoid having to force shutdown the program in order to stop it]
Use the name generated in exercise 1 to apply these rules of the state changes of the cells:

_Rule 1: An alive cell with two or three alive neighbors stays alive._

_Rule 2: An alive cell with less than two alive neighbors dies._

_Rule 3: An alive cell with more than three alive neighbors dies._

_Rule 4: A dead cell with three alive neighbors becomes alive._


Each generation should be shown in some way when running the program. This can be done in any
way you want (e.g. GUI, writing to a terminal, etc.)



3. Result video: Make a video where you run the program at least 3 times
