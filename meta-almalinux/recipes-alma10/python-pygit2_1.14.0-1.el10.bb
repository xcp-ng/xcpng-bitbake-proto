
PN = "python-pygit2"
PE = "0"
PV = "1.14.0"
PR = "1.el10"
PACKAGES = "python-pygit2-doc python3-pygit2"


URI_python-pygit2-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-pygit2-doc-1.14.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pygit2-doc = ""
RPROVIDES:python-pygit2-doc = "python-pygit2-doc ( =  1.14.0-1.el10)"

URI_python3-pygit2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pygit2-1.14.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pygit2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgit2.so.1.7()(64bit) ( ) python3.12dist(setuptools) ( ) python(abi) ( =  3.12) python3.12dist(cffi) ( >=  1.9.1)"
RPROVIDES:python3-pygit2 = "python-pygit2 ( =  1.14.0-1.el10) python3-pygit2 ( =  1.14.0-1.el10) python3-pygit2(x86-64) ( =  1.14.0-1.el10) python3.12-pygit2 ( =  1.14.0-1.el10) python3.12dist(pygit2) ( =  1.14) python3dist(pygit2) ( =  1.14)"
