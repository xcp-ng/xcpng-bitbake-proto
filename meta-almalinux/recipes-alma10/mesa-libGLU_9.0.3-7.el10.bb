
inherit dnf-bridge

PN = "mesa-libGLU"
PE = "0"
PV = "9.0.3"
PR = "7.el10"
PACKAGES = "mesa-libGLU mesa-libGLU-devel"


URI_mesa-libGLU = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGLU-9.0.3-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGLU = " \
 glibc \
 libglvnd-opengl \
 libgcc \
 libstdc++ \
"

URI_mesa-libGLU-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGLU-devel-9.0.3-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGLU-devel = " \
 mesa-libGLU \
 pkgconf-pkg-config \
 libglvnd-devel \
"
