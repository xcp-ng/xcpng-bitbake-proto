
PN = "libsemanage"
PE = "0"
PV = "3.8.1"
PR = "1.el10_0"
PACKAGES = "libsemanage python3-libsemanage libsemanage-devel libsemanage-static"


URI_libsemanage = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsemanage-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libaudit.so.1()(64bit) ( ) libbz2.so.1()(64bit) ( ) audit-libs ( ) libsepol.so.2()(64bit) ( ) libsepol.so.2(LIBSEPOL_1.0)(64bit) ( ) libsepol.so.2(LIBSEPOL_1.1)(64bit) ( ) bzip2-libs ( ) libsepol.so.2(LIBSEPOL_3.0)(64bit) ( ) libselinux(x86-64) ( >=  3.8-1)"
RPROVIDES:libsemanage = "libsemanage.so.2()(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) ( ) config(libsemanage) ( =  3.8.1-1.el10_0) libsemanage ( =  3.8.1-1.el10_0) libsemanage(x86-64) ( =  3.8.1-1.el10_0)"

URI_python3-libsemanage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libsemanage-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libsemanage = "rtld(GNU_HASH) ( ) /usr/bin/python3 ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libselinux-python3 ( ) libsemanage.so.2()(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) ( ) libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) ( ) python(abi) ( =  3.12) libsemanage(x86-64) ( =  3.8.1-1.el10_0)"
RPROVIDES:python3-libsemanage = "libsemanage-python3 ( =  3.8.1-1.el10_0) libsemanage-python3(x86-64) ( =  3.8.1-1.el10_0) python-libsemanage ( =  3.8.1-1.el10_0) python3-libsemanage ( =  3.8.1-1.el10_0) python3-libsemanage(x86-64) ( =  3.8.1-1.el10_0) python3.12-libsemanage ( =  3.8.1-1.el10_0)"

URI_libsemanage-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsemanage-devel-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage-devel = "/usr/bin/pkg-config ( ) pkgconfig(libselinux) ( ) libsemanage.so.2()(64bit) ( ) pkgconfig(libsepol) ( ) libsemanage(x86-64) ( =  3.8.1-1.el10_0)"
RPROVIDES:libsemanage-devel = "libsemanage-devel ( =  3.8.1-1.el10_0) libsemanage-devel(x86-64) ( =  3.8.1-1.el10_0) pkgconfig(libsemanage) ( =  3.8.1)"

URI_libsemanage-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsemanage-static-3.8.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsemanage-static = "libsemanage-devel(x86-64) ( =  3.8.1-1.el10_0)"
RPROVIDES:libsemanage-static = "libsemanage-static ( =  3.8.1-1.el10_0) libsemanage-static(x86-64) ( =  3.8.1-1.el10_0)"
