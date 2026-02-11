
PN = "tokyocabinet"
PE = "0"
PV = "1.4.48"
PR = "28.el10_0"
PACKAGES = "tokyocabinet tokyocabinet-devel tokyocabinet-devel-doc"


URI_tokyocabinet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tokyocabinet-1.4.48-28.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:tokyocabinet = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libbz2.so.1()(64bit) ( )"
RPROVIDES:tokyocabinet = "libtokyocabinet.so.9()(64bit) ( ) tokyocabinet ( =  1.4.48-28.el10_0) tokyocabinet(x86-64) ( =  1.4.48-28.el10_0)"

URI_tokyocabinet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tokyocabinet-devel-1.4.48-28.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:tokyocabinet-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libtokyocabinet.so.9()(64bit) ( ) tokyocabinet ( =  1.4.48-28.el10_0)"
RPROVIDES:tokyocabinet-devel = "pkgconfig(tokyocabinet) ( =  1.4.48) tokyocabinet-devel ( =  1.4.48-28.el10_0) tokyocabinet-devel(x86-64) ( =  1.4.48-28.el10_0)"

URI_tokyocabinet-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tokyocabinet-devel-doc-1.4.48-28.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tokyocabinet-devel-doc = "pkgconfig ( ) tokyocabinet ( =  1.4.48-28.el10_0)"
RPROVIDES:tokyocabinet-devel-doc = "tokyocabinet-devel-doc ( =  1.4.48-28.el10_0)"
