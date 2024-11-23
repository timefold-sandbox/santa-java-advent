# Optimizing Santa's Travels (Java Advent)

This repository contains the example code for my blog post at [Java Advent](https://www.javaadvent.com/).
It is purposefully kept simplistic to show how to use *Timefold Solver* in a minimal example.

For more advanced examples, check out the [Timefold Quickstarts Repository](https://github.com/TimefoldAI/timefold-quickstarts).

## Technologies Used

- [Timefold Solver](https://docs.timefold.ai/timefold-solver/latest/introduction), an Open Source AI Solver.
- [Quarkus](https://quarkus.io/), the Supersonic Subatomic Java Framework.
- [LeafletJS](https://leafletjs.com/), Javascript library for interactive maps.

## Running the application
You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

After visiting localhost:8080, you will be presented with a simple UI.
Click the map a couple of times to add some visits for Santa, then click the _solve_ button.
