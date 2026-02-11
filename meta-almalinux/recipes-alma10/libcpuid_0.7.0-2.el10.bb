
PN = "libcpuid"
PE = "0"
PV = "0.7.0"
PR = "2.el10"
PACKAGES = "libcpuid python3-libcpuid libcpuid-devel"


URI_libcpuid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcpuid-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcpuid = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libcpuid = "libcpuid.so.17()(64bit) ( ) libcpuid(x86-64) ( =  0.7.0-2.el10) libcpuid ( =  0.7.0-2.el10)"

URI_python3-libcpuid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libcpuid-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libcpuid = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) python3.12dist(cffi) ( ) libcpuid.so.17()(64bit) ( ) python(abi) ( =  3.12) libcpuid(x86-64) ( =  0.7.0-2.el10)"
RPROVIDES:python3-libcpuid = "python-libcpuid ( =  0.7.0-2.el10) python3-libcpuid ( =  0.7.0-2.el10) python3-libcpuid(x86-64) ( =  0.7.0-2.el10) python3.12-libcpuid ( =  0.7.0-2.el10) python3.12dist(libcpuid) ( =  0.1) python3dist(libcpuid) ( =  0.1)"

URI_libcpuid-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcpuid-devel-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcpuid-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcpuid.so.17()(64bit) ( ) libcpuid(x86-64) ( =  0.7.0-2.el10)"
RPROVIDES:libcpuid-devel = "libcpuid-devel ( =  0.7.0-2.el10) libcpuid-devel(x86-64) ( =  0.7.0-2.el10) pkgconfig(libcpuid) ( =  0.7.0)"
