
PN = "libev"
PE = "0"
PV = "4.33"
PR = "14.el10"
PACKAGES = "libev libev-devel libev-libevent-devel libev-source"


URI_libev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libev-4.33-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libev = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libev = "libev.so.4()(64bit) ( ) bundled(libecb) ( =  1.05) libev ( =  4.33-14.el10) libev(x86-64) ( =  4.33-14.el10)"

URI_libev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libev-devel-4.33-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libev-devel = "libev.so.4()(64bit) ( ) libev(x86-64) ( =  4.33-14.el10)"
RPROVIDES:libev-devel = "libev-devel ( =  4.33-14.el10) libev-devel(x86-64) ( =  4.33-14.el10)"

URI_libev-libevent-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libev-libevent-devel-4.33-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libev-libevent-devel = "libev-devel(x86-64) ( =  4.33-14.el10)"
RPROVIDES:libev-libevent-devel = "libev-libevent-devel ( =  4.33-14.el10) libev-libevent-devel(x86-64) ( =  4.33-14.el10)"

URI_libev-source = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libev-source-4.33-14.el10.noarch.rpm;unpack=0"
RDEPENDS:libev-source = ""
RPROVIDES:libev-source = "bundled(libecb) ( =  1.05) libev-source ( =  4.33-14.el10)"
