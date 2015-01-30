# source files
target	:= HelloWorld

#-----------------------------------------------------------------------------
# Add this folder to the GOPATH.
export GOPATH:=$(abspath $(dir $(lastword $(MAKEFILE_LIST)))):$(GOPATH)

# object file paths
src:=$(shell find "src/"$(target) -type f -name '*.go')
dep:=$(shell go list -f '{{ join .Imports " " }}' $(target))
len:=$(shell python -c \
	"import sys; print max([len(a) for a in sys.argv[1:]])" $(target))


# colors
include makefile.colors

.PHONY: all clean depend


all: $(target)

$(target): $(src)
	@printf '$(clrexe) %-$(len)s $(clroff)' "$@"
	go install $@

depend:
	go get $(dep)


# Clean all build files.
clean:
	@printf '$(clrrm) %-$(len)s $(clroff)' "$@"
	rm -rf bin
