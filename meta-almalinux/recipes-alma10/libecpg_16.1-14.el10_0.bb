
PN = "libecpg"
PE = "0"
PV = "16.1"
PR = "14.el10_0"
PACKAGES = "libecpg libpgtypes libecpg-devel"


URI_libecpg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecpg-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libecpg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libpgtypes.so.3()(64bit) ( ) libpgtypes ( =  16.1-14.el10_0)"
RPROVIDES:libecpg = "libecpg.so.6()(64bit) ( ) libecpg ( =  16.1-14.el10_0) libecpg(x86-64) ( =  16.1-14.el10_0)"

URI_libpgtypes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpgtypes-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpgtypes = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libpgtypes = "libpgtypes.so.3()(64bit) ( ) libpgtypes ( =  16.1-14.el10_0) libpgtypes(x86-64) ( =  16.1-14.el10_0)"

URI_libecpg-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libecpg-devel-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libecpg-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) pkgconfig(libpgtypes) ( ) libecpg.so.6()(64bit) ( ) libpgtypes.so.3()(64bit) ( ) pkgconfig(libpq) ( ) libecpg(x86-64) ( =  16.1-14.el10_0) libpgtypes(x86-64) ( =  16.1-14.el10_0)"
RPROVIDES:libecpg-devel = "libecpg-devel ( =  16.1-14.el10_0) libecpg-devel(x86-64) ( =  16.1-14.el10_0) pkgconfig(libecpg) ( =  16.1) pkgconfig(libpgtypes) ( =  16.1)"
