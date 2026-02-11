
PN = "libthai"
PE = "0"
PV = "0.1.29"
PR = "10.el10"
PACKAGES = "libthai libthai-devel"


URI_libthai = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libthai-0.1.29-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libthai = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libdatrie.so.1()(64bit) ( ) libdatrie.so.1(DATRIE_0.2)(64bit) ( )"
RPROVIDES:libthai = "libthai.so.0()(64bit) ( ) libthai.so.0(LIBTHAI_0.1)(64bit) ( ) libthai.so.0(LIBTHAI_0.1.25)(64bit) ( ) libthai.so.0(LIBTHAI_0.1.19)(64bit) ( ) libthai ( =  0.1.29-10.el10) libthai(x86-64) ( =  0.1.29-10.el10)"

URI_libthai-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libthai-devel-0.1.29-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libthai-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libthai.so.0()(64bit) ( ) pkgconfig(datrie-0.2) ( ) libthai ( =  0.1.29-10.el10)"
RPROVIDES:libthai-devel = "libthai-devel ( =  0.1.29-10.el10) libthai-devel(x86-64) ( =  0.1.29-10.el10) pkgconfig(libthai) ( =  0.1.29)"
