
PN = "sdl2-compat"
PE = "0"
PV = "2.32.50"
PR = "1.el10"
PACKAGES = "sdl2-compat sdl2-compat-devel"


URI_sdl2-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sdl2-compat-2.32.50-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl2-compat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) SDL3(x86-64) ( >=  3.2.4)"
RPROVIDES:sdl2-compat = "libSDL2-2.0.so.0()(64bit) ( ) SDL2 ( =  2.32.50) SDL2(x86-64) ( =  2.32.50) sdl2-compat ( =  2.32.50-1.el10) sdl2-compat(x86-64) ( =  2.32.50-1.el10)"

URI_sdl2-compat-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sdl2-compat-devel-2.32.50-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl2-compat-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(gl) ( ) pkgconfig(glu) ( ) libSDL2-2.0.so.0()(64bit) ( ) sdl2-compat(x86-64) ( =  2.32.50-1.el10)"
RPROVIDES:sdl2-compat-devel = "SDL2-devel ( =  2.32.50) SDL2-devel(x86-64) ( =  2.32.50) cmake(SDL2) ( =  2.32.50) cmake(sdl2) ( =  2.32.50) pkgconfig(sdl2) ( =  2.32.50) pkgconfig(sdl2_compat) ( =  2.32.50) sdl2-compat-devel ( =  2.32.50-1.el10) sdl2-compat-devel(x86-64) ( =  2.32.50-1.el10)"
