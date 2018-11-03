Exercism Elixir Answers
================================================================================

[Exercism.io][exercism] provides practice problems and mentorship for lots of programming langauge. This repository contains my solutions to the ["Kotlin Track"][exercism-kotlin-track].

Kotlin is a very modern programming language, and solving problems in Kotlin is a great way to understand how to effectively program in a modern multi-paradigm programming language. I first started programming in Java back in 2006. Java has come a long way since then, but anyone who has written in modern C# or dynamic languages like Python will tell you that Java could be less verbose and that other languages have more powerful syntaxes. This has made Java very unappealing recently. Kotlin appears to be a solution to this, so I decided to write some programs in Kotlin.

Running Tests
--------------------------------------------------------------------------------

Each solution is a tiny gradle project. Run `gradle test` in any solution subfolder.

```sh
pushd <EXERCISE_DIRNAME>; gradle test; popd
```


Further Thoughts
--------------------------------------------------------------------------------

With these first exercises, I found using Kotlin to be slower than the other small programming languages that I typically write in for small personal projects and experiments. Naturally, this is because Kotlin carries much of Java's old baggage, but offers many solutions and syntaxes to deal with this mature ecosystem. I find the number of possible solutions and syntaxes exhausting, and the inclination to write and then repeatedly refactor doesn't seem as productive as a minimal language like Go or Erlang where you very likely will just do it right the first time. This initial learning curve was both disappointing and encouraging, however, because Kotlin provided a bridge between my old-school knowledge in statically type-checked object-oriented languages like Java and C++ and high-level abstractions from functional programming.

There's no denying the maturity of the Java ecosystem and usefulness of Kotlin. It allows us to continue benefitting from the work done surrounding Java, and I can see how it complements experienced object-oriented programmers very well. Kotlin allows high-level approaches and modern syntaxes on top of Java libraries, and that's precisely the most productive thing overall for many teams. Additionally, learning to use Kotlin effectively is a matter of time, and it really isn't a long journey coming from other modern programming languages. Anyone should be able to pick up and use Kotlin fairly quickly.

So while there are some aging parts and a small introductory learning curve, I overall don't see it as a hindrance for anyone wanting to move from Java while staying in the Java ecosystem. It's a big and powerful language, yet approachable, with syntax that is more helpful than cumbersome.


[exercism]: https://exercism.io
[exercism-kotlin-track]: https://exercism.io/tracks/kotlin
