
PN = "sdl2-compat"
PE = "0"
PV = "2.32.50"
PR = "1.el10"
PACKAGES = "sdl2-compat sdl2-compat-devel"


URI_sdl2-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sdl2-compat-2.32.50-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl2-compat = " \
 glibc \
 SDL3 \
"

URI_sdl2-compat-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sdl2-compat-devel-2.32.50-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl2-compat-devel = " \
 cmake-filesystem \
 libglvnd-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 bash \
 mesa-libGLU-devel \
 sdl2-compat \
 SDL2 \
"
