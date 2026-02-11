
PN = "tinycdb"
PE = "0"
PV = "0.80"
PR = "4.el10"
PACKAGES = "tinycdb tinycdb-devel"


URI_tinycdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tinycdb-0.80-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tinycdb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:tinycdb = "libcdb.so.1()(64bit) ( ) tinycdb ( =  0.80-4.el10) tinycdb(x86-64) ( =  0.80-4.el10)"

URI_tinycdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tinycdb-devel-0.80-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tinycdb-devel = "/usr/bin/pkg-config ( ) libcdb.so.1()(64bit) ( ) tinycdb(x86-64) ( =  0.80-4.el10)"
RPROVIDES:tinycdb-devel = "pkgconfig(libcdb) ( =  0.78) tinycdb-devel ( =  0.80-4.el10) tinycdb-devel(x86-64) ( =  0.80-4.el10)"
