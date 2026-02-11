
PN = "libxcvt"
PE = "0"
PV = "0.1.2"
PR = "9.el10"
PACKAGES = "libxcvt libxcvt-devel cvt"


URI_libxcvt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcvt-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcvt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:libxcvt = "libxcvt.so.0()(64bit) ( ) libxcvt ( =  0.1.2-9.el10) libxcvt(x86-64) ( =  0.1.2-9.el10)"

URI_libxcvt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxcvt-devel-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcvt-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libxcvt.so.0()(64bit) ( ) libxcvt(x86-64) ( =  0.1.2-9.el10)"
RPROVIDES:libxcvt-devel = "libxcvt-devel ( =  0.1.2-9.el10) libxcvt-devel(x86-64) ( =  0.1.2-9.el10) pkgconfig(libxcvt) ( =  0.1.2)"

URI_cvt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cvt-0.1.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cvt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libxcvt.so.0()(64bit) ( ) libxcvt(x86-64) ( =  0.1.2-9.el10)"
RPROVIDES:cvt = "cvt ( =  0.1.2-9.el10) cvt(x86-64) ( =  0.1.2-9.el10)"
