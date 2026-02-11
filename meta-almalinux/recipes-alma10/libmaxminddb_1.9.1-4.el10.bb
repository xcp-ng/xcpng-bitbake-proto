
PN = "libmaxminddb"
PE = "0"
PV = "1.9.1"
PR = "4.el10"
PACKAGES = "libmaxminddb libmaxminddb-devel"


URI_libmaxminddb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmaxminddb-1.9.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmaxminddb = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libmaxminddb = "libmaxminddb.so.0()(64bit) ( ) libmaxminddb ( =  1.9.1-4.el10) libmaxminddb(x86-64) ( =  1.9.1-4.el10)"

URI_libmaxminddb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmaxminddb-devel-1.9.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmaxminddb-devel = "/usr/bin/pkg-config ( ) libmaxminddb.so.0()(64bit) ( ) libmaxminddb(x86-64) ( =  1.9.1-4.el10)"
RPROVIDES:libmaxminddb-devel = "libmaxminddb-devel ( =  1.9.1-4.el10) libmaxminddb-devel(x86-64) ( =  1.9.1-4.el10) pkgconfig(libmaxminddb) ( =  1.9.1)"
