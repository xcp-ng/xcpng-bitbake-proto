
PN = "libmnl"
PE = "0"
PV = "1.0.5"
PR = "7.el10"
PACKAGES = "libmnl libmnl-devel libmnl-static"


URI_libmnl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmnl-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libmnl = "libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libmnl.so.0(LIBMNL_1.1)(64bit) ( ) libmnl.so.0(LIBMNL_1.2)(64bit) ( ) libmnl ( =  1.0.5-7.el10) libmnl(x86-64) ( =  1.0.5-7.el10)"

URI_libmnl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmnl-devel-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl-devel = "/usr/bin/pkg-config ( ) libmnl.so.0()(64bit) ( ) libmnl(x86-64) ( =  1.0.5-7.el10)"
RPROVIDES:libmnl-devel = "libmnl-devel ( =  1.0.5-7.el10) libmnl-devel(x86-64) ( =  1.0.5-7.el10) pkgconfig(libmnl) ( =  1.0.5)"

URI_libmnl-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmnl-static-1.0.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmnl-static = "libmnl-devel(x86-64) ( =  1.0.5-7.el10)"
RPROVIDES:libmnl-static = "libmnl-static ( =  1.0.5-7.el10) libmnl-static(x86-64) ( =  1.0.5-7.el10)"
