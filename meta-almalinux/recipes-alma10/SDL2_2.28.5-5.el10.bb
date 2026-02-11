
inherit dnf-bridge

PN = "SDL2"
PE = "0"
PV = "2.28.5"
PR = "5.el10"
PACKAGES = "SDL2 SDL2-devel SDL2-static"


URI_SDL2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL2-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2 = " \
 glibc \
 libdecor \
"

URI_SDL2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL2-devel-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2-devel = " \
 cmake-filesystem \
 libglvnd-devel \
 pkgconf-pkg-config \
 mesa-libEGL-devel \
 libX11-devel \
 bash \
 SDL2 \
"

URI_SDL2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/SDL2-static-2.28.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:SDL2-static = " \
 SDL2-devel \
"
