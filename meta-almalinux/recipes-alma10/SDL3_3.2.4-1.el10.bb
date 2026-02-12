
inherit dnf-bridge

PN = "SDL3"
PE = "0"
PV = "3.2.4"
PR = "1.el10"
PACKAGES = "SDL3 SDL3-devel SDL3-test"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/SDL3-3.2.4-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_SDL3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/SDL3-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_SDL3}"
RDEPENDS:SDL3 = " \
 glibc \
 libdecor \
"

URI_SDL3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/SDL3-devel-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_SDL3-devel}"
RDEPENDS:SDL3-devel = " \
 cmake-filesystem \
 libglvnd-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 mesa-libGLU-devel \
 SDL3 \
"

URI_SDL3-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/SDL3-test-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_SDL3-test}"
RDEPENDS:SDL3-test = " \
 SDL3-devel \
"
