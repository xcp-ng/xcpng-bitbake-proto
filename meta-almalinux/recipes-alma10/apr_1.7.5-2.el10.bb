
PN = "apr"
PE = "0"
PV = "1.7.5"
PR = "2.el10"
PACKAGES = "apr apr-devel"


URI_apr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-1.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( )"
RPROVIDES:apr = "libapr-1.so.0()(64bit) ( ) apr ( =  1.7.5-2.el10) apr(x86-64) ( =  1.7.5-2.el10)"

URI_apr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-devel-1.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-devel = "/usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libapr-1.so.0()(64bit) ( ) apr ( =  1.7.5-2.el10)"
RPROVIDES:apr-devel = "apr-devel ( =  1.7.5-2.el10) apr-devel(x86-64) ( =  1.7.5-2.el10) pkgconfig(apr-1) ( =  1.7.5)"
