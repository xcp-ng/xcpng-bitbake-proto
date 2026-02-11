
PN = "SDL2"
PE = "0"
PV = "2.28.5"
PR = "5.el10"
PACKAGES = "SDL2 SDL2-devel SDL2-static"


URI_SDL2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL2-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libdecor-0.so.0()(64bit) ( if  libwayland-client)"
RPROVIDES:SDL2 = "libSDL2-2.0.so.0()(64bit) ( ) SDL2(x86-64) ( =  2.28.5-5.el10) SDL2 ( =  2.28.5-5.el10)"

URI_SDL2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL2-devel-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libSDL2-2.0.so.0()(64bit) ( ) libX11-devel(x86-64) ( ) mesa-libEGL-devel(x86-64) ( ) mesa-libGLES-devel(x86-64) ( ) SDL2(x86-64) ( =  2.28.5-5.el10)"
RPROVIDES:SDL2-devel = "SDL2-devel ( =  2.28.5-5.el10) SDL2-devel(x86-64) ( =  2.28.5-5.el10) cmake(SDL2) ( =  2.28.5) cmake(sdl2) ( =  2.28.5) pkgconfig(sdl2) ( =  2.28.5)"

URI_SDL2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/SDL2-static-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2-static = "SDL2-devel(x86-64) ( =  2.28.5-5.el10)"
RPROVIDES:SDL2-static = "SDL2-static ( =  2.28.5-5.el10) SDL2-static(x86-64) ( =  2.28.5-5.el10)"
