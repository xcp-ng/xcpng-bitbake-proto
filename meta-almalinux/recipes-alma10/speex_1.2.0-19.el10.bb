
PN = "speex"
PE = "0"
PV = "1.2.0"
PR = "19.el10"
PACKAGES = "speex speex-devel speex-tools"


URI_speex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speex-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speex = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:speex = "libspeex.so.1()(64bit) ( ) speex ( =  1.2.0-19.el10) speex(x86-64) ( =  1.2.0-19.el10)"

URI_speex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speex-devel-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speex-devel = "/usr/bin/pkg-config ( ) libspeex.so.1()(64bit) ( ) speex(x86-64) ( =  1.2.0-19.el10)"
RPROVIDES:speex-devel = "pkgconfig(speex) ( =  1.2.0) speex-devel ( =  1.2.0-19.el10) speex-devel(x86-64) ( =  1.2.0-19.el10)"

URI_speex-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/speex-tools-1.2.0-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speex-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libspeexdsp.so.1()(64bit) ( ) libogg.so.0()(64bit) ( ) libspeex.so.1()(64bit) ( ) speex(x86-64) ( =  1.2.0-19.el10)"
RPROVIDES:speex-tools = "speex-tools ( =  1.2.0-19.el10) speex-tools(x86-64) ( =  1.2.0-19.el10)"
