package com.mysterioussoftware.jetpackcompose

object SampleData {
    fun getConversationSameple(): List<Message> {
        val conversationSample = listOf(

            Message(
                "me",
                "Check it out!"
            ),
            Message(
                "me",
                "Thank you!"
            ),
            Message(
                "Taylor Brooks",
                "You can use all the same stuff"
            ),
            Message(
                "Taylor Brooks",
                "@aliconors Take a look at the `Flow.collectAsStateWithLifecycle()` APIs"
            ),
            Message(
                "John Glenn",
                "Compose newbie as well, have you looked at the JetNews sample? Most blog posts end up " +
                        "out of date pretty fast but this sample is always up to date and deals with async " +
                        "data loading (it's faked but the same idea applies) \uD83D\uDC49" +
                        "https://github.com/android/compose-samples/tree/master/JetNews"
            ),
            Message(
                "me",
                "Compose newbie: I’ve scourged the internet for tutorials about async data loading " +
                        "but haven’t found any good ones. What’s the recommended way to load async " +
                        "data and emit composable widgets?"
            ),
            Message(
                "Mercedes Clayton",
                "Ten more steps. If he could take ten more steps it would be over, " +
                        "but his legs wouldn't move. He tried to will them to work, " +
                        "but they wouldn't listen to his brain. " +
                        "Ten more steps and it would be over but it didn't appear he would be able to do it."
            ),
            Message(
                "Renee Kemp",
                "Non aute aute in."
            ),
            Message(
                "Nikhil Holt",
                "Sunt sint irure adipisicing deserunt ea velit. " +
                        "Dolor sit adipisicing sint voluptate dolore non est ullamco commodo elit tempor consequat. " +
                        "Eiusmod consequat incididunt non ex dolor mollit magna cupidatat est officia ut amet et ea irure. " +
                        "Ad elit dolor cillum velit exercitation ad dolor fugiat duis quis duis id nostrud eiusmod aliquip. " +
                        "Quis sint consequat reprehenderit tempor non veniam dolore est officia. Cillum voluptate nisi aute incididunt laboris ut amet consequat ipsum cillum nisi adipisicing aliquip exercitation sunt. " +
                        "Ut tempor in ullamco minim nostrud sint minim. Ea pariatur nisi esse aliqua pariatur aute laboris labore do exercitation esse est deserunt. Lorem pariatur amet nostrud. " +
                        "Dolor elit voluptate duis eu sunt cillum non do laborum culpa deserunt consequat culpa."
            ),
            Message(
                "Naomi Dillon",
                "Exercitation ut amet sunt voluptate."
            ),
        )
        return conversationSample
    }

}
