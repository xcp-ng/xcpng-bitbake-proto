
PN = "SDL3"
PE = "0"
PV = "3.2.4"
PR = "1.el10"
PACKAGES = "SDL3 SDL3-devel SDL3-test"


URI_SDL3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL3-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libdecor-0.so.0()(64bit) ( if  libwayland-client)"
RPROVIDES:SDL3 = "bundled(hidraw) ( ) libSDL3.so.0()(64bit) ( ) libSDL3.so.0(SDL3_0.0.0)(64bit) ( ) SDL3 ( =  3.2.4-1.el10) SDL3(x86-64) ( =  3.2.4-1.el10)"

URI_SDL3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/SDL3-devel-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL3-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(gl) ( ) pkgconfig(glu) ( ) libSDL3.so.0()(64bit) ( ) SDL3(x86-64) ( =  3.2.4-1.el10)"
RPROVIDES:SDL3-devel = "SDL3-devel(x86-64) ( =  3.2.4-1.el10) SDL3-devel ( =  3.2.4-1.el10) cmake(SDL3) ( =  3.2.4) cmake(sdl3) ( =  3.2.4) pkgconfig(sdl3) ( =  3.2.4)"

URI_SDL3-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/SDL3-test-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL3-test = "SDL3-devel(x86-64) ( =  3.2.4-1.el10)"
RPROVIDES:SDL3-test = "SDL3-test ( =  3.2.4-1.el10) SDL3-test(x86-64) ( =  3.2.4-1.el10)"
