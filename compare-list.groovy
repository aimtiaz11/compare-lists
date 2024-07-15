/**
* Usage: groovy compare-list.groovy first.txt second.txt
**/

def sourceList = []

new File(  args[0] ).eachLine { line ->
    // do a lowercase after trimming the line.
    sourceList << line.trim().toLowerCase()
}

def targetList = []
new File( args[1] ).eachLine { line ->
    targetList << line.trim().toLowerCase()
}

List diff1 = (sourceList-targetList)
List diff2 = (targetList-sourceList)
List diff3 = sourceList.intersect(targetList)



println """
\n
println "################ COMPARE LIST #########################
\n
"""



println "- Total in sourceList: ${sourceList.size}"
println "- Total in targetList: ${targetList.size}"


println "\n\n**** Items in '${args[0]}' not in '${args[1]}' list: ${diff1.size} ****\n"
diff1.each { println "\t${it}" }


println "\n\n**** Items in '${args[1]}' not in '${args[0]}' list: ${diff2.size} ****\n"
diff2.each { println "\t${it}" }



println "\n\n***** Common items: ${diff3.size} *****\n"

diff3.each { println "\t${it}" }

println """\n
######################################################
\n
"""
