
PN = "libsepol"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "libsepol libsepol-devel libsepol-utils libsepol-static"


URI_libsepol = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsepol-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsepol = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libsepol = "libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_1.1)(64bit) ( ) libsepol.so.2(LIBSEPOL_3.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_3.4)(64bit) ( ) libsepol.so.2(LIBSEPOL_3.6)(64bit) ( ) libsepol ( =  3.8-1.el10) libsepol(x86-64) ( =  3.8-1.el10)"

URI_libsepol-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsepol-devel-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsepol-devel = "/usr/bin/pkg-config ( ) libsepol.so.2()(64bit) ( ) libsepol(x86-64) ( =  3.8-1.el10)"
RPROVIDES:libsepol-devel = "libsepol-devel ( =  3.8-1.el10) libsepol-devel(x86-64) ( =  3.8-1.el10) pkgconfig(libsepol) ( =  3.8)"

URI_libsepol-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsepol-utils-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsepol-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_3.4)(64bit) ( ) libsepol(x86-64) ( =  3.8-1.el10)"
RPROVIDES:libsepol-utils = "libsepol-utils ( =  3.8-1.el10) libsepol-utils(x86-64) ( =  3.8-1.el10)"

URI_libsepol-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsepol-static-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsepol-static = "libsepol-devel(x86-64) ( =  3.8-1.el10)"
RPROVIDES:libsepol-static = "libsepol-static ( =  3.8-1.el10) libsepol-static(x86-64) ( =  3.8-1.el10)"
