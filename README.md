Exercism Kotlin Answers
================================================================================

[![Build Status](https://travis-ci.com/SLIB53/exercism-kotlin-answers.svg?branch=master)](https://travis-ci.com/SLIB53/exercism-kotlin-answers)

[Exercism.io][exercism] provides practice problems and mentorship for various programming langauges. This repository contains my solutions to the ["Kotlin Track"][exercism-kotlin-track].

Kotlin is a very modern programming language, and solving problems in Kotlin is a great way to understand how to effectively program in a modern multi-paradigm programming language. I first started programming in Java back in 2006. Java has come a long way since then, but anyone who has written in modern C# or dynamic languages like Python will tell you that Java could be less verbose and that other languages have more powerful and expressive syntaxes. This has made Java very unappealing recently. Kotlin appears to be a solution to this, so I decided to write some programs in Kotlin. There has been a bit of a learning curve with this language, but the more I use it the more I find myself confidently writing expressive code.

Running Tests
--------------------------------------------------------------------------------

Each solution is a tiny gradle project. Run `gradle test` in any solution subfolder.

```sh
pushd <EXERCISE_DIRNAME>; gradle test; popd
```

To run all the tests, use the `test_all.sh` script.

```sh
sh _scripts/test_all.sh
```

Alternatively, tests can be run from a container using the ['Test.Dockerfile'](./Test.Dockerfile). This will run tests on build.

```sh
docker build --tag exercism-kotlin-answers:latest .
```


Further Thoughts
--------------------------------------------------------------------------------

With these first exercises, I found using Kotlin to be slower to write than the lightweight programming languages that I typically choose for small personal projects and experiments. Naturally, this is because Kotlin has type checking and carries much of Java's old baggage in terms of design. It provides many syntaxes to create cleaner, simpler code, greatly expanding the number of ways to do the same thing. I find the number of possible solutions and syntaxes exhausting, and the inclination to write and then repeatedly refactor and clean up doesn't seem as productive as a minimal language like Go or Erlang where you are very likely to have written it suitably the first time. This initial learning curve was disappointing but also encouraging, however, because Kotlin provided a bridge between traditional knowledge in statically type-checked object-oriented languages like Java and C++ and high-level abstractions to knowledge of functional or dynamic programming languages.

I think there's no denying the maturity of the Java ecosystem and usefulness of Kotlin. It allows us to continue benefitting from the work done surrounding Java, and I can see how it complements experienced object-oriented programmers very well. Kotlin allows high-level approaches and modern syntaxes on top of Java libraries, and that's precisely the most productive thing overall for many teams. Additionally, using Kotlin effectively is a matter of practice, and it really isn't a long journey coming from other modern programming languages. Anyone should be able to pick up and use Kotlin fairly quickly.

So while there are some aging parts and a small introductory learning curve, I overall don't see it as a hindrance for anyone wanting to move from Java while staying in the Java ecosystem. It's a big and powerful language, yet approachable, with syntax that is more helpful than cumbersome.


[exercism]: https://exercism.io
[exercism-kotlin-track]: https://exercism.io/tracks/kotlin
