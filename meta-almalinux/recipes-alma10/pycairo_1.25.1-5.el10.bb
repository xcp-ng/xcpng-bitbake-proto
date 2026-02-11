
PN = "pycairo"
PE = "0"
PV = "1.25.1"
PR = "5.el10"
PACKAGES = "python3-cairo python3-cairo-devel"


URI_python3-cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cairo-1.25.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cairo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcairo.so.2()(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-cairo = "python-cairo ( =  1.25.1-5.el10) python3-cairo ( =  1.25.1-5.el10) python3-cairo(x86-64) ( =  1.25.1-5.el10) python3.12-cairo ( =  1.25.1-5.el10) python3.12dist(pycairo) ( =  1.25.1) python3dist(pycairo) ( =  1.25.1)"

URI_python3-cairo-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-cairo-devel-1.25.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cairo-devel = "/usr/bin/pkg-config ( ) pkgconfig(cairo) ( ) python3-devel ( ) python3-cairo(x86-64) ( =  1.25.1-5.el10)"
RPROVIDES:python3-cairo-devel = "pkgconfig(py3cairo) ( =  1.25.1) python-cairo-devel ( =  1.25.1-5.el10) python3-cairo-devel ( =  1.25.1-5.el10) python3-cairo-devel(x86-64) ( =  1.25.1-5.el10) python3.12-cairo-devel ( =  1.25.1-5.el10)"
