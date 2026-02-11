
PN = "dtc"
PE = "0"
PV = "1.7.0"
PR = "12.el10"
PACKAGES = "dtc libfdt libfdt-devel libfdt-static python3-libfdt"


URI_dtc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dtc-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dtc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libfdt.so.1()(64bit) ( ) libfdt.so.1(LIBFDT_1.2)(64bit) ( )"
RPROVIDES:dtc = "dtc ( =  1.7.0-12.el10) dtc(x86-64) ( =  1.7.0-12.el10)"

URI_libfdt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfdt-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libfdt = "libfdt.so.1()(64bit) ( ) libfdt.so.1(LIBFDT_1.2)(64bit) ( ) libfdt ( =  1.7.0-12.el10) libfdt(x86-64) ( =  1.7.0-12.el10)"

URI_libfdt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfdt-devel-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt-devel = "libfdt.so.1()(64bit) ( ) libfdt ( =  1.7.0-12.el10)"
RPROVIDES:libfdt-devel = "libfdt-devel ( =  1.7.0-12.el10) libfdt-devel(x86-64) ( =  1.7.0-12.el10)"

URI_libfdt-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfdt-static-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt-static = "libfdt-devel ( =  1.7.0-12.el10)"
RPROVIDES:libfdt-static = "libfdt-static ( =  1.7.0-12.el10) libfdt-static(x86-64) ( =  1.7.0-12.el10)"

URI_python3-libfdt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-libfdt-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libfdt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) python(abi) ( =  3.12) dtc(x86-64) ( =  1.7.0-12.el10)"
RPROVIDES:python3-libfdt = "python-libfdt ( =  1.7.0-12.el10) python3-libfdt ( =  1.7.0-12.el10) python3-libfdt(x86-64) ( =  1.7.0-12.el10) python3.12-libfdt ( =  1.7.0-12.el10) python3.12dist(libfdt) ( =  1.7) python3dist(libfdt) ( =  1.7)"
