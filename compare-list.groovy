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
List commonItems = sourceList.intersect(targetList)

println """
\n
println "################ COMPARE LIST #########################
\n
"""

println "- Total in ${args[0]}: ${sourceList.size}"
println "- Total in ${args[1]}: ${targetList.size}"


println "\n\n**** Number of items in '${args[0]}' not in '${args[1]}' list: ${diff1.size} ****\n"
diff1.each { println "\t${it}" }


println "\n\n**** Number of items in '${args[1]}' not in '${args[0]}' list: ${diff2.size} ****\n"
diff2.each { println "\t${it}" }



println "\n\n***** Common items: ${commonItems.size} *****\n"

commonItems.each { println "\t${it}" }

println """\n
######################################################
\n
"""
