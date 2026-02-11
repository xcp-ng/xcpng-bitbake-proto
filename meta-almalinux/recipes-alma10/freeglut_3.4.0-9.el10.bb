
PN = "freeglut"
PE = "0"
PV = "3.4.0"
PR = "9.el10"
PACKAGES = "freeglut freeglut-devel"


URI_freeglut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeglut-3.4.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeglut = "
 glibc
 libglvnd-glx
 libX11
 libXi
"

URI_freeglut-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeglut-devel-3.4.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeglut-devel = "
 cmake-filesystem
 pkgconf-pkg-config
 mesa-libGL-devel
 mesa-libGLU-devel
 freeglut
"
