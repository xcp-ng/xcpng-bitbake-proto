
inherit dnf-bridge

PN = "libglvnd"
PE = "1"
PV = "1.7.0"
PR = "7.el10"
PACKAGES = "libglvnd libglvnd-core-devel libglvnd-devel libglvnd-egl libglvnd-gles libglvnd-glx libglvnd-opengl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libglvnd-1.7.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libglvnd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd}"
RDEPENDS:libglvnd = " \
 glibc \
"

URI_libglvnd-core-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-core-devel-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-core-devel}"
RDEPENDS:libglvnd-core-devel = " \
 pkgconf-pkg-config \
"

URI_libglvnd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-devel-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-devel}"
RDEPENDS:libglvnd-devel = " \
 libglvnd \
 libglvnd-core-devel \
 libglvnd-egl \
 libglvnd-gles \
 libglvnd-glx \
 libglvnd-opengl \
 pkgconf-pkg-config \
 libX11-devel \
"

URI_libglvnd-egl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-egl-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-egl}"
RDEPENDS:libglvnd-egl = " \
 glibc \
 mesa-libEGL \
 libglvnd \
"

URI_libglvnd-gles = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-gles-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-gles}"
RDEPENDS:libglvnd-gles = " \
 glibc \
 mesa-libEGL \
 libglvnd \
"

URI_libglvnd-glx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-glx-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-glx}"
RDEPENDS:libglvnd-glx = " \
 libglvnd \
 mesa-libGL \
 libX11 \
 glibc \
 libXext \
"

URI_libglvnd-opengl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libglvnd-opengl-1.7.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libglvnd-opengl}"
RDEPENDS:libglvnd-opengl = " \
 glibc \
 libglvnd \
"
