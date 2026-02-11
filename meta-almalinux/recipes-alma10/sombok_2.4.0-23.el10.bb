
PN = "sombok"
PE = "0"
PV = "2.4.0"
PR = "23.el10"
PACKAGES = "sombok sombok-devel"


URI_sombok = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sombok-2.4.0-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sombok = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libthai.so.0()(64bit) ( ) libthai.so.0(LIBTHAI_0.1)(64bit) ( )"
RPROVIDES:sombok = "libsombok.so.3()(64bit) ( ) sombok ( =  2.4.0-23.el10) sombok(x86-64) ( =  2.4.0-23.el10)"

URI_sombok-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sombok-devel-2.4.0-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sombok-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libsombok.so.3()(64bit) ( ) sombok(x86-64) ( =  2.4.0-23.el10)"
RPROVIDES:sombok-devel = "pkgconfig(sombok) ( =  2.4.0) sombok-devel ( =  2.4.0-23.el10) sombok-devel(x86-64) ( =  2.4.0-23.el10)"
