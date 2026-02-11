
PN = "expat"
PE = "0"
PV = "2.7.1"
PR = "1.el10_0.3"
PACKAGES = "expat expat-devel expat-static"


URI_expat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/expat-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( )"
RPROVIDES:expat = "libexpat.so.1()(64bit) ( ) expat ( =  2.7.1-1.el10_0.3) expat(x86-64) ( =  2.7.1-1.el10_0.3)"

URI_expat-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/expat-devel-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat-devel = "/usr/bin/pkg-config ( ) libexpat.so.1()(64bit) ( ) expat(x86-64) ( =  2.7.1-1.el10_0.3)"
RPROVIDES:expat-devel = "pkgconfig(expat) ( =  2.7.1) expat-devel ( =  2.7.1-1.el10_0.3) expat-devel(x86-64) ( =  2.7.1-1.el10_0.3)"

URI_expat-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expat-static-2.7.1-1.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:expat-static = "expat-devel(x86-64) ( =  2.7.1-1.el10_0.3)"
RPROVIDES:expat-static = "expat-static ( =  2.7.1-1.el10_0.3) expat-static(x86-64) ( =  2.7.1-1.el10_0.3)"
