# This is a simple version of the default Makefile. It does not create any
# dependency files, so it is not well suited to large projects. It is good if
# you just want to see how a basic Makefile looks though.

#	Project settings.
# Add your own flags, include paths and libraries/library paths. You can also
# change the compiler, the source directory and executable name.
#-----------------------------------------------------------------------------
# Compiler flags
flags := -std=c99 -O3 -Wall -Wextra -pedantic
incs  :=
libs  :=

# build tools
compiler := gcc

# source files
target	:= hello-world
src_dir := src/
#-----------------------------------------------------------------------------

# Object file paths. - This finds all `.c` source files in the source
# directory, it also generates a list of what object files should be compiled
# from those source files.
src:=$(shell find $(src_dir) -type f -name '*.c')
obj:=$(src:.c=.o)
obj:=$(obj:src/%=obj/%)


# The default target is `all` which just depends on the `hello-world` target
# that builds the program.
all: $(target)

# `hello-world` target which depends on the object files. This links together
# the object files. This is the stage where any static libraries are linked
# in.
$(target): $(obj)
	$(compiler) $(flags) $(obj) -o $(target) $(libs)

# Object files target, this is a generic rule which compiles any of the source
# files to their corresponding object file. This is where include paths are
# passed to the compiler. The `mkdir` command ensures that the directory for
# the object file has been created.
obj/%.o: src/%.c
	@mkdir -p "$(@D)"
	$(compiler) $(flags) $(incs) -c $< -o $@


# Clean all build files. - This just removes the `obj` directory which is
# where all the object files are stored and it removes the hello-world
# executable.
clean:
	rm -rf $(target) obj
