
PN = "libnftnl"
PE = "0"
PV = "1.2.8"
PR = "2.el10"
PACKAGES = "libnftnl libnftnl-devel"


URI_libnftnl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnftnl-1.2.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnftnl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( )"
RPROVIDES:libnftnl = "libnftnl.so.11()(64bit) ( ) libnftnl.so.11(LIBNFTNL_11)(64bit) ( ) libnftnl.so.11(LIBNFTNL_13)(64bit) ( ) libnftnl.so.11(LIBNFTNL_14)(64bit) ( ) libnftnl.so.11(LIBNFTNL_15)(64bit) ( ) libnftnl.so.11(LIBNFTNL_16)(64bit) ( ) libnftnl.so.11(LIBNFTNL_12)(64bit) ( ) libnftnl.so.11(LIBNFTNL_17)(64bit) ( ) libnftnl ( =  1.2.8-2.el10) libnftnl(x86-64) ( =  1.2.8-2.el10)"

URI_libnftnl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnftnl-devel-1.2.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnftnl-devel = "/usr/bin/pkg-config ( ) pkgconfig(libmnl) ( ) libnftnl.so.11()(64bit) ( ) libnftnl(x86-64) ( =  1.2.8-2.el10)"
RPROVIDES:libnftnl-devel = "libnftnl-devel ( =  1.2.8-2.el10) libnftnl-devel(x86-64) ( =  1.2.8-2.el10) pkgconfig(libnftnl) ( =  1.2.8)"
