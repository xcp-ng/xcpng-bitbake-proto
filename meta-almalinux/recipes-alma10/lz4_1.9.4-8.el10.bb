
PN = "lz4"
PE = "0"
PV = "1.9.4"
PR = "8.el10"
PACKAGES = "lz4 lz4-libs lz4-devel lz4-static"


URI_lz4 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lz4-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:lz4 = "lz4 ( =  1.9.4-8.el10) lz4(x86-64) ( =  1.9.4-8.el10)"

URI_lz4-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lz4-libs-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:lz4-libs = "liblz4.so.1()(64bit) ( ) lz4-libs ( =  1.9.4-8.el10) lz4-libs(x86-64) ( =  1.9.4-8.el10)"

URI_lz4-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lz4-devel-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-devel = "/usr/bin/pkg-config ( ) liblz4.so.1()(64bit) ( ) lz4-libs(x86-64) ( =  1.9.4-8.el10)"
RPROVIDES:lz4-devel = "lz4-devel ( =  1.9.4-8.el10) lz4-devel(x86-64) ( =  1.9.4-8.el10) pkgconfig(liblz4) ( =  1.9.4)"

URI_lz4-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lz4-static-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-static = ""
RPROVIDES:lz4-static = "lz4-static ( =  1.9.4-8.el10) lz4-static(x86-64) ( =  1.9.4-8.el10)"
