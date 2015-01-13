## Using CMake ##

Create a build folder where intermediate files will be placed and switch to
that directory:

```
mkdir build && cd build
```

Then call CMake specifying the path to the directory where your
`CMakeLists.txt` is:

```
cmake ..
```

Finally you can compile by calling make and then run the HelloWorld program:

```
make && ./HelloWorld
```

## Dependencies ##

* CMake.
* C compiler such as GCC.
* GNU Make.
