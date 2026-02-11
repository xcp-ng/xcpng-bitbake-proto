
PN = "libdaemon"
PE = "0"
PV = "0.14"
PR = "31.el10"
PACKAGES = "libdaemon libdaemon-devel"


URI_libdaemon = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdaemon-0.14-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdaemon = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libdaemon = "libdaemon.so.0()(64bit) ( ) libdaemon ( =  0.14-31.el10) libdaemon(x86-64) ( =  0.14-31.el10)"

URI_libdaemon-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdaemon-devel-0.14-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdaemon-devel = "/usr/bin/pkg-config ( ) libdaemon.so.0()(64bit) ( ) libdaemon ( =  0.14-31.el10)"
RPROVIDES:libdaemon-devel = "libdaemon-devel ( =  0.14-31.el10) libdaemon-devel(x86-64) ( =  0.14-31.el10) pkgconfig(libdaemon) ( =  0.14)"
