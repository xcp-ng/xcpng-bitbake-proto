
PN = "brotli"
PE = "0"
PV = "1.1.0"
PR = "6.el10"
PACKAGES = "libbrotli brotli brotli-devel python3-brotli"


URI_libbrotli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libbrotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbrotli = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:libbrotli = "libbrotlidec.so.1()(64bit) ( ) libbrotlicommon.so.1()(64bit) ( ) libbrotlienc.so.1()(64bit) ( ) libbrotli ( =  1.1.0-6.el10) libbrotli(x86-64) ( =  1.1.0-6.el10)"

URI_brotli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brotli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libbrotlienc.so.1()(64bit) ( ) libbrotli(x86-64) ( =  1.1.0-6.el10)"
RPROVIDES:brotli = "brotli(x86-64) ( =  1.1.0-6.el10) brotli ( =  1.1.0-6.el10)"

URI_brotli-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brotli-devel-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brotli-devel = "/usr/bin/pkg-config ( ) libbrotlidec.so.1()(64bit) ( ) libbrotlienc.so.1()(64bit) ( ) libbrotlicommon.so.1()(64bit) ( ) libbrotli(x86-64) ( =  1.1.0-6.el10) brotli(x86-64) ( =  1.1.0-6.el10) pkgconfig(libbrotlicommon) ( >=  1.1.0)"
RPROVIDES:brotli-devel = "brotli-devel ( =  1.1.0-6.el10) brotli-devel(x86-64) ( =  1.1.0-6.el10) pkgconfig(libbrotlicommon) ( =  1.1.0) pkgconfig(libbrotlidec) ( =  1.1.0) pkgconfig(libbrotlienc) ( =  1.1.0)"

URI_python3-brotli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-brotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-brotli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-brotli = "python-brotli ( =  1.1.0-6.el10) python3-brotli ( =  1.1.0-6.el10) python3-brotli(x86-64) ( =  1.1.0-6.el10) python3.12-brotli ( =  1.1.0-6.el10) python3.12dist(brotli) ( =  1.1) python3dist(brotli) ( =  1.1)"
