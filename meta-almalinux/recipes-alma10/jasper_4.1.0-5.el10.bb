
PN = "jasper"
PE = "0"
PV = "4.1.0"
PR = "5.el10"
PACKAGES = "jasper jasper-libs jasper-utils jasper-devel"


URI_jasper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libjasper.so.7()(64bit) ( ) jasper-libs(x86-64) ( =  4.1.0-5.el10)"
RPROVIDES:jasper = "jasper ( =  4.1.0-5.el10) jasper(x86-64) ( =  4.1.0-5.el10)"

URI_jasper-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-libs-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( )"
RPROVIDES:jasper-libs = "libjasper.so.7()(64bit) ( ) jasper-libs(x86-64) ( =  4.1.0-5.el10) jasper-libs ( =  4.1.0-5.el10)"

URI_jasper-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-utils-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libOpenGL.so.0()(64bit) ( ) libGLX.so.0()(64bit) ( ) libjasper.so.7()(64bit) ( ) libGLU.so.1()(64bit) ( ) libglut.so.3()(64bit) ( ) jasper-libs(x86-64) ( =  4.1.0-5.el10) jasper ( =  4.1.0-5.el10)"
RPROVIDES:jasper-utils = "jasper-utils ( =  4.1.0-5.el10) jasper-utils(x86-64) ( =  4.1.0-5.el10)"

URI_jasper-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jasper-devel-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(libjpeg) ( ) libjpeg-devel ( ) libjasper.so.7()(64bit) ( ) jasper-libs(x86-64) ( =  4.1.0-5.el10)"
RPROVIDES:jasper-devel = "jasper-devel ( =  4.1.0-5.el10) jasper-devel(x86-64) ( =  4.1.0-5.el10) libjasper-devel ( =  4.1.0-5.el10) pkgconfig(jasper) ( =  4.1.0)"
