
PN = "libpsl"
PE = "0"
PV = "0.21.5"
PR = "6.el10"
PACKAGES = "libpsl libpsl-devel psl psl-make-dafsa"


URI_libpsl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpsl-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpsl = "rtld(GNU_HASH) ( ) libunistring.so.5()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) publicsuffix-list-dafsa ( )"
RPROVIDES:libpsl = "libpsl.so.5()(64bit) ( ) libpsl ( =  0.21.5-6.el10) libpsl(x86-64) ( =  0.21.5-6.el10)"

URI_libpsl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpsl-devel-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpsl-devel = "/usr/bin/pkg-config ( ) libpsl.so.5()(64bit) ( ) publicsuffix-list ( ) libpsl(x86-64) ( =  0.21.5-6.el10)"
RPROVIDES:libpsl-devel = "libpsl-devel ( =  0.21.5-6.el10) libpsl-devel(x86-64) ( =  0.21.5-6.el10) pkgconfig(libpsl) ( =  0.21.5)"

URI_psl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psl-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:psl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpsl.so.5()(64bit) ( )"
RPROVIDES:psl = "psl ( =  0.21.5-6.el10) psl(x86-64) ( =  0.21.5-6.el10)"

URI_psl-make-dafsa = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psl-make-dafsa-0.21.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:psl-make-dafsa = "/usr/bin/python3 ( )"
RPROVIDES:psl-make-dafsa = "psl-make-dafsa ( =  0.21.5-6.el10)"
