cmake_minimum_required(VERSION 2.6)

project(HelloWorld)

set(src src/HelloWorld.c)
add_definitions(-std=gnu99 -O3 -Wall -Wextra -pedantic)

include_directories($ENV{INCLUDEPATH})
link_directories($ENV{LD_LIBRARY_PATH})

add_executable(HelloWorld ${src})

