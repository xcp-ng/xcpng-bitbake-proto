
PN = "libxshmfence"
PE = "0"
PV = "1.3.2"
PR = "5.el10"
PACKAGES = "libxshmfence libxshmfence-devel"


URI_libxshmfence = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxshmfence-1.3.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxshmfence = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:libxshmfence = "libxshmfence.so.1()(64bit) ( ) libxshmfence(x86-64) ( =  1.3.2-5.el10) libxshmfence ( =  1.3.2-5.el10)"

URI_libxshmfence-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxshmfence-devel-1.3.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxshmfence-devel = "/usr/bin/pkg-config ( ) libxshmfence.so.1()(64bit) ( ) libxshmfence(x86-64) ( =  1.3.2-5.el10)"
RPROVIDES:libxshmfence-devel = "libxshmfence-devel ( =  1.3.2-5.el10) libxshmfence-devel(x86-64) ( =  1.3.2-5.el10) pkgconfig(xshmfence) ( =  1.3.2)"
