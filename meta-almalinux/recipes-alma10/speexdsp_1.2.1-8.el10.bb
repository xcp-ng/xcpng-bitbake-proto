
PN = "speexdsp"
PE = "0"
PV = "1.2.1"
PR = "8.el10"
PACKAGES = "speexdsp speexdsp-devel"


URI_speexdsp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speexdsp-1.2.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speexdsp = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:speexdsp = "libspeexdsp.so.1()(64bit) ( ) speexdsp ( =  1.2.1-8.el10) speexdsp(x86-64) ( =  1.2.1-8.el10)"

URI_speexdsp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speexdsp-devel-1.2.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speexdsp-devel = "/usr/bin/pkg-config ( ) libspeexdsp.so.1()(64bit) ( ) speexdsp(x86-64) ( =  1.2.1-8.el10)"
RPROVIDES:speexdsp-devel = "pkgconfig(speexdsp) ( =  1.2.1) speexdsp-devel ( =  1.2.1-8.el10) speexdsp-devel(x86-64) ( =  1.2.1-8.el10)"
