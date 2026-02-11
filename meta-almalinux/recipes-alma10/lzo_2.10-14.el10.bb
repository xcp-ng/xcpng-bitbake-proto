
PN = "lzo"
PE = "0"
PV = "2.10"
PR = "14.el10"
PACKAGES = "lzo lzo-devel lzo-minilzo"


URI_lzo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lzo-2.10-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lzo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:lzo = "liblzo2.so.2()(64bit) ( ) lzo ( =  2.10-14.el10) lzo(x86-64) ( =  2.10-14.el10)"

URI_lzo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lzo-devel-2.10-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lzo-devel = "/usr/bin/pkg-config ( ) zlib-devel ( ) liblzo2.so.2()(64bit) ( ) libminilzo.so.0()(64bit) ( ) lzo-minilzo ( =  2.10-14.el10) lzo ( =  2.10-14.el10)"
RPROVIDES:lzo-devel = "lzo-devel ( =  2.10-14.el10) lzo-devel(x86-64) ( =  2.10-14.el10) pkgconfig(lzo2) ( =  2.10)"

URI_lzo-minilzo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lzo-minilzo-2.10-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lzo-minilzo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:lzo-minilzo = "libminilzo.so.0()(64bit) ( ) lzo-minilzo ( =  2.10-14.el10) lzo-minilzo(x86-64) ( =  2.10-14.el10)"
