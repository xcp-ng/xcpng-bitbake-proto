
PN = "jbig2dec"
PE = "0"
PV = "0.20"
PR = "7.el10"
PACKAGES = "jbig2dec-libs jbig2dec-devel jbig2dec"


URI_jbig2dec-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbig2dec-libs-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:jbig2dec-libs = "libjbig2dec.so.0()(64bit) ( ) jbig2dec-libs ( =  0.20-7.el10) jbig2dec-libs(x86-64) ( =  0.20-7.el10)"

URI_jbig2dec-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jbig2dec-devel-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec-devel = "/usr/bin/pkg-config ( ) libjbig2dec.so.0()(64bit) ( ) jbig2dec-libs ( =  0.20-7.el10)"
RPROVIDES:jbig2dec-devel = "jbig2dec-devel ( =  0.20-7.el10) jbig2dec-devel(x86-64) ( =  0.20-7.el10) pkgconfig(jbig2dec) ( =  0.20)"

URI_jbig2dec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jbig2dec-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libjbig2dec.so.0()(64bit) ( ) jbig2dec-libs ( =  0.20-7.el10)"
RPROVIDES:jbig2dec = "jbig2dec ( =  0.20-7.el10) jbig2dec(x86-64) ( =  0.20-7.el10)"
