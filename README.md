# Minesweeper
Minesweeper cmd app

This is a simple Minesweeper cmd app in Java using IntelliJ Community edition.

The user inputs the number of rows, columns and mines of the Minesweeper board as command line arguments and the appropriate board is created.

Displayed on the board are the tiles where mines are positioned and on the rest of the tiles, the count of mines on adjacent tiles. 

## Example ##
In the picture that follows a 9x9 board with 10 mines is shown.<br><br>
![Minesweeper example](Minesweeper%20example.png)

<br>***2D array variables explanation***<br><br>
In the picture that follows, the 2D arrays created for the 9x9 example above are shown.<br><br>
![2D arrays](Minesweeper%202D%20arrays.png)

<br><br>An 11x11 boolean array is used to denote the location of the mines, where the value false means no mine 
and the value true means a mine is positioned there respectively.

The mines are positioned in the 9x9 array within the 11x11 array, denoted with the red circumference. 
The other outside cells always have a false value, and are used to generalise the counting method.

The 9x9 int array named count is used to count the number of adjacent mines of every cell. 
Attention should be given to the indexing so that the two arrays match properly.
