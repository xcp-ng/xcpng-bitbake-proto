
PN = "libnet"
PE = "0"
PV = "1.3"
PR = "7.el10"
PACKAGES = "libnet libnet-devel libnet-doc"


URI_libnet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnet-1.3-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnet = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libnet = "libnet.so.1()(64bit) ( ) libnet ( =  1.3-7.el10) libnet(x86-64) ( =  1.3-7.el10)"

URI_libnet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnet-devel-1.3-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnet-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) /usr/bin/sh ( ) libnet.so.1()(64bit) ( ) libnet(x86-64) ( =  1.3-7.el10)"
RPROVIDES:libnet-devel = "libnet-devel ( =  1.3-7.el10) libnet-devel(x86-64) ( =  1.3-7.el10) pkgconfig(libnet) ( =  1.3)"

URI_libnet-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnet-doc-1.3-7.el10.noarch.rpm;unpack=0"
RDEPENDS:libnet-doc = ""
RPROVIDES:libnet-doc = "libnet-doc ( =  1.3-7.el10)"
