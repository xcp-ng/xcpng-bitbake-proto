
inherit dnf-bridge

PN = "sdl12-compat"
PE = "0"
PV = "1.2.68"
PR = "4.el10"
PACKAGES = "sdl12-compat sdl12-compat-devel"


URI_sdl12-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sdl12-compat-1.2.68-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl12-compat = " \
 glibc \
 SDL2 \
"

URI_sdl12-compat-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sdl12-compat-devel-1.2.68-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sdl12-compat-devel = " \
 libglvnd-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 bash \
 mesa-libGLU-devel \
 sdl12-compat \
"
