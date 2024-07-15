/**
* Usage: print-distinct-csv-from-file.groovy input.txt
*/

def sourceList = []

new File (  args[0] ).eachLine { line ->
    sourceList << line.trim()
}

print """\n
############## PRINT distinct csv ###########################
\n
${sourceList.unique().join(",")}
\n
Total entries: ${sourceList.unique().size()}\n
\n
######################################################
\n
"""
