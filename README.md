# compare-list

A simple groovy script to compare 2 lists to display the common items and mismatches.


## Running
Populate the `input-file1.txt` and `input-file2.txt` and run:`groovy compareList.groovy`.

## Sample output


```
Total in sourceList: 3
Total in targetList: 3
**** Items in sourceList not in targetList list: 2 ****
1

2

**** Items in targetList not in sourceList list: 2 ****
4

5

***** common items *****
3
````