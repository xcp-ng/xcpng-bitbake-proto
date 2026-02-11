
PN = "libseccomp"
PE = "0"
PV = "2.5.3"
PR = "10.el10"
PACKAGES = "libseccomp libseccomp-devel libseccomp-static"


URI_libseccomp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libseccomp-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libseccomp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libseccomp = "libseccomp.so.2()(64bit) ( ) libseccomp ( =  2.5.3-10.el10) libseccomp(x86-64) ( =  2.5.3-10.el10)"

URI_libseccomp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libseccomp-devel-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libseccomp-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) libseccomp.so.2()(64bit) ( ) libseccomp(x86-64) ( =  2.5.3-10.el10)"
RPROVIDES:libseccomp-devel = "libseccomp-devel ( =  2.5.3-10.el10) libseccomp-devel(x86-64) ( =  2.5.3-10.el10) pkgconfig(libseccomp) ( =  2.5.3)"

URI_libseccomp-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libseccomp-static-2.5.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libseccomp-static = "libseccomp-devel(x86-64) ( =  2.5.3-10.el10)"
RPROVIDES:libseccomp-static = "libseccomp-static ( =  2.5.3-10.el10) libseccomp-static(x86-64) ( =  2.5.3-10.el10)"
