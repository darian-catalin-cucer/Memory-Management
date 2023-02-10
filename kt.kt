// Create a data class to hold a large list of items
data class LargeList(val items: List<Int>)

// Create a function to process the list items
fun processLargeList(list: LargeList) {
    // Use a forEach loop to iterate over the list items
    list.items.forEach { item ->
        // Perform some processing on each item
        // ...
    }

    // Set the list to null after processing is complete
    list.items = null
}

// Call the function to process the large list
val largeList = LargeList(List(100000) { it })
processLargeList(largeList)

// The largeList reference can now be garbage collected
// because it is no longer in use and its items property
// has been set to null.
