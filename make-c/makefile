# Compiler flags
flags := -std=c99 -O3 -Wall -Wextra -pedantic
incs  :=
libs  :=

# build tools
compiler := gcc
linker	 := $(compiler)
archiver := ar

# source files
target	:= hello-world
src_dir := src/


# object file paths
src:=$(shell find $(src_dir) -type f -name '*.c')
obj:=$(src:.c=.o)
obj:=$(obj:src/%=obj/%)
len:=$(shell python -c \
	"import sys; print max([len(a) for a in sys.argv[1:]])" $(obj) $(target))

# colors
include makefile.colors

.PHONY: all clean

all: $(target)


$(target): $(obj)
	@printf '$(clrexe) %-$(len)s $(clroff)' "$@"
	$(linker) $(flags) $(obj) -o $(target) $(libs)

# source dependency file
obj/%.d: src/%.c
	@printf '$(clrdep) %-$(len)s $(clroff)' "$@"
	@mkdir -p "$(@D)"
	gcc -MM -MT '$@' $< > $(@:.o=.d)

# object files
ifneq ($(MAKECMDGOALS),clean)
-include $(obj:.o=.d)
endif
obj/%.o: src/%.c obj/%.d
	@printf '$(clrobj) %-$(len)s $(clroff)' "$@"
	@mkdir -p "$(@D)"
	$(compiler) $(flags) $(incs) -c $< -o $@


# Clean all build files.
clean:
	@printf '$(clrrm) %-$(len)s $(clroff)' "$@"
	rm -rf $(target) obj `find . -type f -name '*.d'`
