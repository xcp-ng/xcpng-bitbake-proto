
PN = "sdl12-compat"
PE = "0"
PV = "1.2.68"
PR = "4.el10"
PACKAGES = "sdl12-compat sdl12-compat-devel"


URI_sdl12-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sdl12-compat-1.2.68-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl12-compat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) SDL2(x86-64) ( >=  2.0.18)"
RPROVIDES:sdl12-compat = "libSDL-1.2.so.0()(64bit) ( ) SDL ( =  1.2.68) SDL(x86-64) ( =  1.2.68) sdl12-compat ( =  1.2.68-4.el10) sdl12-compat(x86-64) ( =  1.2.68-4.el10)"

URI_sdl12-compat-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sdl12-compat-devel-1.2.68-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl12-compat-devel = "/usr/bin/pkg-config ( ) /usr/bin/sh ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(gl) ( ) libSDL-1.2.so.0()(64bit) ( ) pkgconfig(glu) ( ) sdl12-compat(x86-64) ( =  1.2.68-4.el10)"
RPROVIDES:sdl12-compat-devel = "SDL-devel ( =  1.2.68) SDL-devel(x86-64) ( =  1.2.68) pkgconfig(sdl) ( =  1.2.68) pkgconfig(sdl12_compat) ( =  1.2.68) sdl12-compat-devel ( =  1.2.68-4.el10) sdl12-compat-devel(x86-64) ( =  1.2.68-4.el10)"
