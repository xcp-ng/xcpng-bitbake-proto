
PN = "libpfm"
PE = "0"
PV = "4.13.0"
PR = "10.el10"
PACKAGES = "libpfm libpfm-devel python3-libpfm libpfm-static"


URI_libpfm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpfm-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpfm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( )"
RPROVIDES:libpfm = "libpfm.so.4()(64bit) ( ) libpfm(x86-64) ( =  4.13.0-10.el10) libpfm ( =  4.13.0-10.el10)"

URI_libpfm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpfm-devel-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpfm-devel = "libpfm.so.4()(64bit) ( ) libpfm(x86-64) ( =  4.13.0-10.el10)"
RPROVIDES:libpfm-devel = "libpfm-devel ( =  4.13.0-10.el10) libpfm-devel(x86-64) ( =  4.13.0-10.el10)"

URI_python3-libpfm = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-libpfm-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libpfm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libpfm.so.4()(64bit) ( ) python(abi) ( =  3.12) libpfm(x86-64) ( =  4.13.0-10.el10)"
RPROVIDES:python3-libpfm = "libpfm-python ( =  4.13.0-10.el10) libpfm-python(x86-64) ( =  4.13.0-10.el10) python-libpfm ( =  4.13.0-10.el10) python3-libpfm ( =  4.13.0-10.el10) python3-libpfm(x86-64) ( =  4.13.0-10.el10) python3.12-libpfm ( =  4.13.0-10.el10) python3.12dist(perfmon) ( =  4) python3dist(perfmon) ( =  4)"

URI_libpfm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpfm-static-4.13.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpfm-static = "libpfm(x86-64) ( =  4.13.0-10.el10)"
RPROVIDES:libpfm-static = "libpfm-static ( =  4.13.0-10.el10) libpfm-static(x86-64) ( =  4.13.0-10.el10)"
