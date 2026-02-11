
PN = "libdatrie"
PE = "0"
PV = "0.2.13"
PR = "11.el10"
PACKAGES = "libdatrie libdatrie-devel"


URI_libdatrie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdatrie-0.2.13-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdatrie = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libdatrie = "libdatrie.so.1()(64bit) ( ) libdatrie.so.1(DATRIE_0.2)(64bit) ( ) libdatrie.so.1(DATRIE_0.2.13)(64bit) ( ) libdatrie.so.1(DATRIE_0.2.4)(64bit) ( ) libdatrie.so.1(DATRIE_0.2.6)(64bit) ( ) libdatrie.so.1(DATRIE_0.2.7)(64bit) ( ) libdatrie(x86-64) ( =  0.2.13-11.el10) libdatrie ( =  0.2.13-11.el10)"

URI_libdatrie-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdatrie-devel-0.2.13-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdatrie-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) libdatrie.so.1()(64bit) ( ) libdatrie.so.1(DATRIE_0.2)(64bit) ( ) libdatrie(x86-64) ( =  0.2.13-11.el10)"
RPROVIDES:libdatrie-devel = "libdatrie-devel ( =  0.2.13-11.el10) libdatrie-devel(x86-64) ( =  0.2.13-11.el10) pkgconfig(datrie-0.2) ( =  0.2.13)"
