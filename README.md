<p align="center">
  <img src="http://www.mpm-dredge.eu/images/logo_UniversityOfCaliforniaBerkeley.png" alt="Berkeley CS61B - Data Structures, Spring 2018">
</p>

__My coursework for Berkeley's Spring 2018 offering of [CS61B](http://sp18.datastructur.es/index.html) - Data Structures.__

While this work is ungraded, I use every available test case and the provided
automated unit tests to ensure my code meets and exceeds course expectations.<sup>1</sup>

The reason for me 'taking' this course is three-fold:

* Improving my abilities in Java
* Relearning key data structures concepts in a formal fashion, cementing
  knowledge
* Creating tangible evidence that I have the same knowledge base as
  those whose transcript says 'Computer Science' rather than 'Electrical
  Engineering' and 'Physics'

<sup>1</sup>(I am attempting to get in touch with the course's professor (Joshua Hug) to see
if arrangements can be made for me to access the Autograder programs, but for
now this is only available to enrolled Berkeley students)

## Overview

This course contains video lectures, slides, and an electronic book documenting
all relevant information, organized by lecture week.  There are six homework
assignments and two 'makeup' ones (which I will also complete) for a total of
seven hw's.  Additionally there are four projects that allow for partner work,
but I will be tackling them solo.

The following outline of homework / project descriptions and results will be updated as I complete them:

### Homework

<details><summary>Homework 0</summary>

* Quick review of git, OOP, and introduction to Java syntax / ideologies
* Playing with simple Java programs - classes, methods, arrays, objects, you name it
* Having fun setting up NeoVim to run asynchronously alongside Sublime Text 3
  to achieve [actual vim usage within Sublime!](https://github.com/lunixbochs/ActualVim)
</details>

<details><summary>Homework 1</summary>
coming soon!
</details>

### Projects

<details><summary>Project 0</summary>

* Used [StdDraw library from Princeton](https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html)
to implement a simple gravitation sandbox
* Read in starting positions, velocities, masses, and image file names to
  create a dynamic simulation of the motion of massive bodies
* (Coming Soon): Extended to include elastic collisions, mouse interactions to drag bodies and
  instantiate new bodies, and audio output

Example of a snapshot of our solar system running:
```shell
java NBody 157788000.0 50000.0 data/planets.txt
```
![Planet_Demo](https://i.imgur.com/CJ5FzWu.gif)

[Starman](https://www.wikiwand.com/en/Elon_Musk%27s_Tesla_Roadster) being launched into orbit towards Mars:
```shell
java NBody 157788000.0 50000.0 data/starman.txt
```
<img src="/gifs/proj0/starman.gif?raw=true" width="500px">

And since we all know the earth is really flat...
```shell
java NBody 157788000.0 50000.0 data/flat-earth.txt
```
![Flat_Earth](https://i.imgur.com/guN2HgF.gif)
</details>

<details><summary>Project 1</summary>

coming soon!
</details>

## License

All of my work here is released under the [MIT license](LICENSE.txt).

__Please don't use my code if you're an actual CS61B student!__

