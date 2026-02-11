
PN = "bzip2"
PE = "0"
PV = "1.0.8"
PR = "25.el10"
PACKAGES = "bzip2 bzip2-libs bzip2-devel bzip2-static"


URI_bzip2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bzip2-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bzip2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libbz2.so.1()(64bit) ( ) bzip2-libs(x86-64) ( =  1.0.8-25.el10)"
RPROVIDES:bzip2 = "bzip2 ( =  1.0.8-25.el10) bzip2(x86-64) ( =  1.0.8-25.el10)"

URI_bzip2-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bzip2-libs-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bzip2-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:bzip2-libs = "libbz2.so.1()(64bit) ( ) bzip2-libs(x86-64) ( =  1.0.8-25.el10) bzip2-libs ( =  1.0.8-25.el10)"

URI_bzip2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bzip2-devel-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bzip2-devel = "/usr/bin/pkg-config ( ) libbz2.so.1()(64bit) ( ) bzip2-libs(x86-64) ( =  1.0.8-25.el10)"
RPROVIDES:bzip2-devel = "bzip2-devel ( =  1.0.8-25.el10) bzip2-devel(x86-64) ( =  1.0.8-25.el10) pkgconfig(bzip2) ( =  1.0.6)"

URI_bzip2-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bzip2-static-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bzip2-static = ""
RPROVIDES:bzip2-static = "bzip2-static ( =  1.0.8-25.el10) bzip2-static(x86-64) ( =  1.0.8-25.el10)"
