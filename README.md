# Makefiles

Often I find my Makefiles have common features between them. I want a `clean`
target, I want an `all` target, I don't want any unnecessary building. Some of
these things are easy, others (like proper dependency handling) are not as
easy. This repository contains template Makefiles that I use to start my
Makefiles for projects. They can generally be used with minimal modification.

## Dependencies

If you want to use these templates, there are some dependencies:

- GNU Make (obviously).
- Python.
- A terminal that supports colour codes.

To justify these, python is sparingly used (just to calculate the maximum
length of a list of file names) and colour codes are only required if you want
to have coloured terminal output. Perhaps I will make some basic versions of
the makefiles which require only GNU make.

## Language Templates

At the moment I only have a C++ language template, however I plan to add more.
