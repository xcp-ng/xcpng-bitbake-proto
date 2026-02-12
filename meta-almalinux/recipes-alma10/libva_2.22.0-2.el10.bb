
inherit dnf-bridge

PN = "libva"
PE = "0"
PV = "2.22.0"
PR = "2.el10"
PACKAGES = "libva libva-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libva-2.22.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libva = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libva-2.22.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libva}"
RDEPENDS:libva = " \
 libXfixes \
 libwayland-client \
 libglvnd-glx \
 mesa-filesystem \
 libX11 \
 libxcb \
 libX11-xcb \
 glibc \
 libdrm \
 libXext \
"

URI_libva-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libva-devel-2.22.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libva-devel}"
RDEPENDS:libva-devel = " \
 wayland-devel \
 libva-devel \
 pkgconf-pkg-config \
 libva \
"
