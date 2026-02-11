
PN = "freeglut"
PE = "0"
PV = "3.4.0"
PR = "9.el10"
PACKAGES = "freeglut freeglut-devel"


URI_freeglut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeglut-3.4.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeglut = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libX11.so.6()(64bit) ( ) libXi.so.6()(64bit) ( ) libGL.so.1()(64bit) ( ) libc.so.6(GLIBC_2.15)(64bit) ( )"
RPROVIDES:freeglut = "libglut.so.3()(64bit) ( ) freeglut ( =  3.4.0-9.el10) freeglut(x86-64) ( =  3.4.0-9.el10) glut ( =  3.7)"

URI_freeglut-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeglut-devel-3.4.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeglut-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libglut.so.3()(64bit) ( ) libGL-devel ( ) libGLU-devel ( ) freeglut ( =  3.4.0-9.el10)"
RPROVIDES:freeglut-devel = "cmake(FreeGLUT) ( =  3.4.0) cmake(freeglut) ( =  3.4.0) freeglut-devel ( =  3.4.0-9.el10) freeglut-devel(x86-64) ( =  3.4.0-9.el10) glut-devel ( =  3.7) pkgconfig(glut) ( =  3.4.0)"
