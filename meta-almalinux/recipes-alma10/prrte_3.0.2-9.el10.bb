
PN = "prrte"
PE = "0"
PV = "3.0.2"
PR = "9.el10"
PACKAGES = "prrte prrte-libs prrte-devel"


URI_prrte = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/prrte-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libhwloc.so.15()(64bit) ( ) libevent_core-2.1.so.7()(64bit) ( ) libpmix.so.2()(64bit) ( ) libprrte.so.3()(64bit) ( ) prrte-libs(x86-64) ( =  3.0.2-9.el10)"
RPROVIDES:prrte = "prrte ( =  3.0.2-9.el10) prrte(x86-64) ( =  3.0.2-9.el10)"

URI_prrte-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/prrte-libs-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libhwloc.so.15()(64bit) ( ) libevent_core-2.1.so.7()(64bit) ( ) libpmix.so.2()(64bit) ( ) libevent_pthreads-2.1.so.7()(64bit) ( ) libtorque.so.2()(64bit) ( )"
RPROVIDES:prrte-libs = "libprrte.so.3()(64bit) ( ) prrte-libs(x86-64) ( =  3.0.2-9.el10) config(prrte-libs) ( =  3.0.2-9.el10) prrte-libs ( =  3.0.2-9.el10)"

URI_prrte-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/prrte-devel-3.0.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:prrte-devel = "libprrte.so.3()(64bit) ( ) prrte-libs(x86-64) ( =  3.0.2-9.el10)"
RPROVIDES:prrte-devel = "prrte-devel ( =  3.0.2-9.el10) prrte-devel(x86-64) ( =  3.0.2-9.el10)"
